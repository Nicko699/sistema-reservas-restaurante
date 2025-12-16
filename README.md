# 🍽️ Sistema de Reservas de Restaurante

Sistema de gestión de reservas para restaurantes desarrollado en Java con interfaz gráfica Swing y persistencia de datos con JPA/MySQL.

## 📋 Descripción

Aplicación de escritorio que permite gestionar reservas de mesas en un restaurante, incluyendo administración de usuarios, mesas y reservaciones con sistema de autenticación seguro.

## 🚀 Características

- **Gestión de Usuarios**: Listar, Registro, edición y eliminación de usuarios con roles diferenciados, Administrador(Admi) y Usuario(User)
- **Hasheo Seguro**: Sistema de hasheo de contraseñas usando PBKDF2WithHmacSHA256
- **Gestión de Mesas**: Control de capacidad y disponibilidad de mesas
- **Sistema de Reservas**: Creación y administración de reservas con fecha, hora y estado
- **Interfaz Gráfica**: UI intuitiva desarrollada con Java Swing
- **Persistencia de Datos**: Almacenamiento en base de datos MySQL con JPA

## 🛠️ Tecnologías

- **Java 17**
- **Maven** - Gestión de dependencias
- **JPA (EclipseLink 2.7.12)** - Persistencia de datos
- **MySQL 8.0** - Base de datos
- **Java Swing** - Interfaz gráfica
- **JCalendar 1.3.2** - Selector de fechas

## ⚙️ Configuración

### Requisitos Previos

- Java JDK 17 o superior
- MySQL 8.0 o superior
- Maven 3.6 o superior

### Configuración de Base de Datos

1. Crear una base de datos vacía con nombre `restauran` en MySQL

2. Configurar credenciales en `persistence.xml`:
```xml
<!-- Tener en cuenta el puerto de MySQL (3306) y el nombre de la base de datos (restaurant) -->
<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/restauran?serverTimezone=UTC"/>

<!-- Usuario de MySQL, por defecto 'root' o el que tengas creado -->
<property name="javax.persistence.jdbc.user" value="root"/>

<!-- Contraseña de MySQL, cambiar 'tu_contraseña' o dejar vacío si no tienes -->
<property name="javax.persistence.jdbc.password" value="tu_contraseña"/>
```

### Instalación

1. Clonar el repositorio:
```bash
git clone [url-del-repositorio]
cd sistema-reservas-restaurante
```

2. Compilar el proyecto con Maven:
```bash
mvn clean install
```

3. Ejecutar la aplicación:
```bash
mvn exec:java
```

## 🔒 Seguridad

El sistema implementa hasheo seguro de contraseñas utilizando:
- **Algoritmo**: PBKDF2WithHmacSHA256
- **Iteraciones**: 65,536
- **Longitud de clave**: 256 bits
- **Salt único** por contraseña generado con SecureRandom

## 🐛 Solución de Problemas

### Error de Conexión a Base de Datos
- Verificar que MySQL esté ejecutándose
- Confirmar credenciales en `persistence.xml`
- Validar que la base de datos `restaurant` exista

### Error de Dependencias
```bash
mvn clean install -U
```

