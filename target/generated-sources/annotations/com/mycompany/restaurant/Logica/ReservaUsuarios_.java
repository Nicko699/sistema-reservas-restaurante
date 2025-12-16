package com.mycompany.restaurant.Logica;

import com.mycompany.restaurant.Logica.Mesas;
import com.mycompany.restaurant.Logica.Usuarios;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-12-16T08:28:58", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(ReservaUsuarios.class)
public class ReservaUsuarios_ { 

    public static volatile SingularAttribute<ReservaUsuarios, Date> fecha;
    public static volatile SingularAttribute<ReservaUsuarios, String> estado;
    public static volatile SingularAttribute<ReservaUsuarios, Mesas> mesa;
    public static volatile SingularAttribute<ReservaUsuarios, String> hora;
    public static volatile SingularAttribute<ReservaUsuarios, Usuarios> usu;
    public static volatile SingularAttribute<ReservaUsuarios, Integer> id;

}