
package com.mycompany.restaurant.Logica;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

//Clase para hasheo de contraseñas
public class HashearPassword {

    private static final int ITERACIONES = 65536;
    private static final int KEY_LENGTH = 256;

    public String hashPassword(String password) {
        try {
            // Generamos el salt
            byte[] salt = new byte[16];
            new SecureRandom().nextBytes(salt);

            // Creamos el hash
            PBEKeySpec spec = new PBEKeySpec(
                    password.toCharArray(),
                    salt,
                    ITERACIONES,
                    KEY_LENGTH
            );

            SecretKeyFactory skf =
                    SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");

            byte[] hash = skf.generateSecret(spec).getEncoded();

            // Guardamos salt + hash juntos
            return Base64.getEncoder().encodeToString(salt)
                    + ":" +
                   Base64.getEncoder().encodeToString(hash);

        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new RuntimeException("Error al hashear contraseña", e);
        }
    }
    
    public boolean verificarPassword(String passwordIngresada,
                                        String passwordGuardada) {
    try {
        // Separamos el salt y hash
        String[] partes = passwordGuardada.split(":");
        byte[] salt = Base64.getDecoder().decode(partes[0]);
        byte[] hashGuardado = Base64.getDecoder().decode(partes[1]);

        // Hasheamos la contraseña ingresada con el mismo salt
        PBEKeySpec spec = new PBEKeySpec(
                passwordIngresada.toCharArray(),
                salt,
                ITERACIONES,
                KEY_LENGTH
        );

        SecretKeyFactory skf =
                SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");

        byte[] hashIngresado = skf.generateSecret(spec).getEncoded();

        // Comparamos los 2, el guardado en la bd hasheado y el ingresado por el usuario sin hashear
        return java.security.MessageDigest.isEqual(
                hashGuardado,
                hashIngresado
        );

    } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
        return false;
    }
}

}
