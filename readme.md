# Student Management System
This is a Spring Boot application. It is built on Model-View-Controller architecture. Read more about it [here](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html) . Below are the dependencies or modules used in the project: 
 - spring-boot-starter-data-jpa - It will communicate with database. It internally used hibernate as the JPA provider. Out of box hibernate supports all the relational databases, so we just need to change the configuration and the underlying code remains the same. It will expose all the database operations for a particular entity. We use Spring data JPA to reduce a lot of boilerplate code that is required to build the persistence layer.
- spring-boot-starter-thymeleaf - It is used to develop the view layer. Thymeleaf is a Java XML/XHTML/HTML5 template engine that can work both in web and non-web environments. It is better suited for serving XHTML/HTML5 at the view layer of MVC-based web applications, but it can process any XML file even in offline environments.
- spring-boot-devtools - It is used to automatically render the changes when changes are made and saved to the application.
- spring-boot-starter-web - Starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as the default embedded container

## Some points
- Spring Rest Controller - It is developed using Spring MVC to develop and expose REST endpoints.
- This project uses the in memory database called h2 database, tomacat as the embedded web server and apache maven as the build tool.
- How to run in-memory h2 database: go to <url> like localhost:8080/h2-console , in the url enter the database url from the application logs like jdbc:h2:mem:4221a180-aae6-48d6-ae77-e76c300664b5 , don't enter password and hit enter. Applciation logs will be something like : ```Added connection conn111: url=jdbc:h2:mem:4221a180-aae6-48d6-ae77-e76c300664b5 user=SA```
- JPARepository format -> <Type of the JPA Entity, Type of the primary key>
- We are using Spring provided dependency injection. In order to loose couple all the dependencies, we are going to use interface and a class(StudentServiceImpl) to implement interface(StudentService). So the naming convention is to create implementation classes under impl folder.
- Spring Boot will find all the templates for thymeleaf under templates folder.
- To bind data to the model attribute we are using th:field=*{firstName} in the creat_student.html page. firstName should match the variable value in the Student entity object.
- The flow when user wants to create new student: User clicks on Add Student button -> Request goes to `/students/new GET` mapping in the `StudentController` class -> `createStringForm` method in StudentController class pass a model object with student class object initialised and passed as attribute to the model object and returns `create_student` html page -> create_student form takes the student object passed as an attribute to the model object and binds data to the` model attributes` using the field names like `firstName`, `lastName` and `email` and on submitting redirects back to the `saveStudent  POST` mapping method in the StudentController class -> This method saves the student object and then redirects to the `/students` page.
- `@` in html pages indicates reference to the context path of the application.

### Development notes in VS Code
- option+shit+o - To import libraries in a class in VS Code(Mac).
- In VS Code - to auto generate interface methods in JAVA, right click in the class -> Source Action -> Override/implement methods
- Some usedful JAVA extensions - Extension pack for JAVA , Maven for JAVA , Debugger for JAVA , Project Manager for JAVA , Test Runner for JAVA , Language Support for Java(TM) by Red Hat and Spring Initializr Java Support .
 