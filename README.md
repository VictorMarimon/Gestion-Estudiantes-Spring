# 🎓 Gestión de Estudiantes con Spring

Este proyecto es una aplicación web desarrollada en **Java** utilizando el framework **Spring**. Su objetivo es gestionar información de estudiantes, permitiendo operaciones CRUD (Crear, Leer, Actualizar, Eliminar) de manera eficiente.

---

## 🚀 Características

- **Gestión de estudiantes**:
  - Crear nuevos registros de estudiantes.
  - Consultar la lista de estudiantes.
  - Actualizar información existente.
  - Eliminar registros.

- **Arquitectura basada en Spring**:
  - Uso de Spring Boot para facilitar la configuración.
  - Implementación de Spring Data JPA para la persistencia de datos.
  - Controladores RESTful para la gestión de solicitudes HTTP.

---

## ♦️ Estructura Base de Datos

![image](https://github.com/user-attachments/assets/ccb54f07-2005-42ff-a1ec-121912d1420f)

# 📊 Tabla: ESTUDIANTE

La tabla **ESTUDIANTE** es la principal en el sistema y almacena los datos personales y de contacto de cada estudiante. Es utilizada por la aplicación para realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar).

---

## 📋 Estructura de la tabla

| Columna     | Tipo           | Descripción                                    |
|-------------|----------------|------------------------------------------------|
| **ID**      | INTEGER UNIQUE | Identificador único de cada estudiante. Es la clave primaria (PK). |
| **NOMBRE**  | VARCHAR(100)   | Nombre del estudiante (máximo 100 caracteres). |
| **APELLIDO**| VARCHAR(100)   | Apellido del estudiante (máximo 100 caracteres). |
| **TELEFONO**| VARCHAR(10)    | Número de teléfono del estudiante (máximo 10 caracteres). |
| **EMAIL**   | VARCHAR(50)    | Dirección de correo electrónico del estudiante (máximo 50 caracteres). |


## 🛠️ Tecnologías y herramientas

- **Lenguaje**: Java
- **Framework principal**: Spring Boot
- **Persistencia**: Spring Data JPA
- **Base de datos**: MySQL
- **Gestión de dependencias**: Maven

---

## 📂 Estructura del proyecto

![image](https://github.com/user-attachments/assets/6497b482-eb1a-4234-8068-994834ebb2e7)


## 🧑‍💻 Cómo ejecutar el proyecto

1. **Requisitos previos**:
   - Tener instalado [Java JDK 8 o superior](https://www.oracle.com/java/technologies/javase-downloads.html).
   - Instalar [Maven](https://maven.apache.org/download.cgi).
   - [Opcional] Tener configurada la base de datos correspondiente.

2. **Configuración**:
   - Clona este repositorio:
     ```bash
     git clone https://github.com/VictorMarimon/Gestion-Estudiantes-Spring.git
     ```
   - Navega al directorio del proyecto:
     ```bash
     cd Gestion-Estudiantes-Spring
     ```
   - Configura las propiedades de la base de datos en `src/main/resources/application.properties`.

3. **Ejecución**:
   - Compila y ejecuta la aplicación con Maven:
     ```bash
     mvn spring-boot:run
     ```
   - Accede a la aplicación en `http://localhost:8080`.

---

## 📝 Notas

- Asegúrate de que la base de datos esté en funcionamiento y las credenciales sean correctas.
- Puedes modificar el puerto y otras configuraciones en el archivo `application.properties`.

---

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Si deseas colaborar:
1. Haz un fork del repositorio.
2. Crea una nueva rama (`feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit.
4. Envía un pull request.

---

## 📄 Licencia

Este proyecto está bajo la licencia [MIT](LICENSE).
