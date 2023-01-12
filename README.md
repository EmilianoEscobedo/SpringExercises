# OB Spring Exercises
<br><br>

## Ejercicio 1

Crear proyecto maven con la dependencia spring-context y crear una clase Saludo con un método imprimirSaludo que imprima un texto por consola.

Crear el archivo beans.xml con un bean para la clase Saludo.

Obtener el bean desde el método main y ejecutar el método imprimirSaludo.

## Ejercicio 2

Crear la clase NotificationService, con un método que imprima un saludo.

Crear una clase UserService que tenga un atributo de clase NotificationService.

Utilizar la anotación @Component en cada clase.

Habilitar el escaneo de clases en el archivo beans.xml

Desde el método main, probar a obtener el bean UserService y ejecutar el método imprimirSaludo que tiene asociado el atributo de tipo NotificationService. De forma similar a la realizada en clase.

## Ejercicio 3

Crear un proyecto Spring Boot con las dependencias:

Spring Data JPA

H2

## Ejercicio 4

Crear un proyecto Spring Boot con las dependencias:

H2

Spring Data JPA

Spring Web

Spring Boot dev tools

Crear una clase HelloController que sea un controlador REST. Dentro de la clase crear un método que retorne un saludo. Probar que retorna el saludo desde el navegador y desde Postman.

## Ejercicio 5

Dentro de la misma app crear las clases necesarias para trabajar con "ordenadores":

Laptop (entidad)

LaptopRepository (repositorio)

LaptopController (controlador)

Desde LaptopController crear un método que devuelva una lista de objetos Laptop.

Probar que funciona desde Postman.

Los objetos Laptop se pueden insertar desde el método main de la clase principal.

## Ejercicio 6

Crear un método en LaptopController que reciba un objeto Laptop enviado en formato JSON desde Postman y persistirlo en la base de datos.

Comprobar que al obtener de nuevo los laptops aparece el nuevo ordenador creado.

## Ejercicio 7

Implementar los métodos CRUD en el API REST de Laptop creada en ejercicios anteriores.

Los métodos CRUD:

* findAll()

* findOneById()

* create()

* update()

* delete()

* deleteAll()

## Ejercicio 8

Implementar swagger sobre el API REST de Laptop y verificar que funciona en la URL: http://localhost:8081/swagger-ui/

## Ejercicio 9

Crear casos de test para el controlador de Laptop desde Spring Boot. Con click derecho dentro del código de la clase LaptopController utilizar la opción Generate > Test para crear la clase con todos los tests unitarios e implementarlos siguiente el proceso visto en clase.
