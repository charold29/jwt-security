# Proyecto de Autenticación JWT con Spring

Este proyecto es un ejemplo básico de cómo implementar la autenticación JWT en una aplicación web utilizando el framework Spring.

## Requisitos previos

Asegúrate de tener instalado:

- Java JDK
- Maven

## Configuración

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu IDE preferido.

## Base de Datos

Por defecto, se está utilizando una base de datos en memoria H2 para simplificar el ejemplo. Puedes modificar la configuración de la base de datos en el archivo `application.properties`.

## Rutas HTTP

### Registro de Usuario

**Endpoint:** `POST /api/v1/auth/register`

Este endpoint permite a los usuarios registrarse en la aplicación. Envía una solicitud POST con un JSON que contiene los siguientes campos:

```json
{
  "firstname": "primerNombre",
  "lastname": "apellido",
  "email": "correo",
  "password": "contraseña"
}
```

### Autenticación

**Endpoint:** `POST /api/v1/auth/authenticate`

Este endpoint permite a los usuarios autenticarse y obtener un token JWT. Envía una solicitud POST con un JSON que contiene los siguientes campos:

```json
{
  "email": "correo",
  "password": "contraseña"
}
```

## Ejecutar la Aplicación

1. Ejecuta la aplicación desde tu IDE o mediante el comando `mvn spring-boot:run`.
2. Accede a las rutas de registro y autenticación utilizando herramientas como Postman o cURL.

## Contribuciones

¡Las contribuciones son bienvenidas! Si encuentras alguna mejora o corrección, no dudes en crear un pull request.

## Agradecimientos

Este proyecto se basa en los conocimientos y tutoriales disponibles en línea sobre autenticación JWT con Spring.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más información.

---

¡No olvides personalizar el README con detalles específicos de tu proyecto y configuración!
