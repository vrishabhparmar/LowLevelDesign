# LLD: Low Level design 

### Importance of Low Level Design 

&rarr; Part of pre-production work in SDLC  
&rarr; Helps in envisioning and covering majority of the project before 
actual coding  
&rarr; Helps in envisioning the future enhancement & consideration. 


### Object Oriented Design
OOD (Object-Oriented Design) and OOP (Object-Oriented Programming) are closely related concepts, though they represent different stages in the software development process:

Object-Oriented Design (OOD): This is the planning phase that focuses on structuring your software using object-oriented principles. During OOD, you define the objects, their properties (data), behaviours (methods), and the relationships between them. It's like creating a blueprint for your code.
Object-Oriented Programming (OOP): This is the implementation phase where you use a programming language like Java, Kotlin, or Swift to translate your OOD design into actual code. You create classes based on your design, write methods to define the object's behaviours, and establish relationships between objects. It's like building a house based on the blueprint.

Here's an analogy to further clarify the difference:

Imagine you're building a car.
In OOD, you'd decide what the car's parts are (engine, wheels, seats), what information each part needs (engine type, wheel size), and how these parts interact (engine powers wheels).
In OOP, you'd translate this design into code. You would define Engine, Wheel, and Seat classes, with properties and methods specific to each part. You'd then write code to connect these objects and make the car function.  

### Classs & Objects

#### Class 

&rarr; A class is a template from which individual objects are created  
&rarr; A class contains fields and methods  
&rarr; An object is an instance of a class. It has 3 characteristics 

        State: Represents data of an object
        Behavior: Represents functionality
        Identity: Assigned by JVM to identify each object uniquely (Memory location)

### Constructor

A constructor is a special method of a class in the OOP that initializes a new created object, either to default or to used defined values.
Although, it resembles a method, a constructor is not a method since it doesn't have any return type  

#### Types of Constructor
&rarr; Default  
&rarr; Copy  
&rarr; Chained  
&rarr; Parameterized  


### This keyword  
        It is a reference variable that refers to the current object in the constructor or the method


### Parameterized Constructor

Constructor has a specific number of parameters. It is used to provide diff values at the initialization. Checks for correctness during object construction.  

### Copy Constructor 

A copy constructor is a special type of constructor that creates an object using another object of the same Java class

It returns a deep duplicate copy of an existing object of the class. 


### Chained Constructor 

Constructor chaining is a process of calling one constructor from another constructor with respect to the current object

One of the main use case of chaining constructor is duplicate code while having multiple parameterized constructor. 

## Access Specifiers 

#### Type of Access Specifiers

&rarr; Default: Cannot be accessed outside the package.  
&rarr; Public: Can be accessed outside the package  
&rarr; Private: Only access inside the class. Not even child class can access it. If you want yoour child class to access it you need to set it as protected  
&rarr; Protected: It allows you to access with in the module but not outside the module. But if you still want to access the memeber then you need to extend that class as a parent class. 

## Four pillars of OOPs

### Encapsulation  
&rarr; Reduce complexity + Data Security  

        It helpes to bind the data and related methods into single unit. It also keeps the data and methods safe from th external interface. 
        a.k.a Data hiding. There is no side effects of this code on the rest of the application.
Encapsulation and data hiding are not same. Encapsulation unables Data hinding. 
Data hiding is achieved using Access Modifiers. 

### Steps for Proper Encapsulation 

&rarr; Restrict Access  
&rarr; Know the bounds of values (i.e. donot allow negactive balance)  
&rarr; Initilize data elements to right initial values  
&rarr; Choose data types wisely  
&rarr; Validate the input while modifying / setting data 


### Abstraction 
&rarr; Hide complexity + Isolate impact of changes 

        Abstraction hides the implementation or complexity and exposes only relavant functionality to the User. End user focus is on what the object does instead of how it does.
        It can be achieved using access specifiers but there are other ways also to achieve it. 

#### Abstraction vs Encapsulation 

Grouping the behavior and data in a single logical unit and enable data hiding to protect the access of the data from the outside world is called encapsulation while hiding the complex implementation details from clients is called Abstraction.

#### Ways to achieve Abstraction 

&rarr; By use of private access specifiers  
&rarr; Abstract classes  (0 to 100%)
&rarr; Interfaces (100%)

#### Abstract class:

An abstract class is a class that is declared abstract - it may or may not include abstract methods. Abstract classes cannot be instantiated ,but they can be subclassed. 

When an abstract class is subclassed, the subclass usually provides implementations for all the abstract methods in its parent class. However, if it does not, then the subclass must not be declared abstract. 

#### Abstract method

An abstact methods is a method which is declared without any implementation. 

### Interface 

        A interface is a contract which specifies what a class must do. Any class implementing the interface my implement this methods

### Inheritance
&rarr; Eliminate Redundant code + reusability

        Inheritance is a mechanism in which one object (child object) acquires all the properties of the parent class.
        It is an important part of the object oriented programming. 

Inheritance represents the IS-A relationship which is also known as a parent child relationship

#### Types of Inheritance
&rarr; Single level  
&rarr; Multi-level  
&rarr; Hierarchical 

        "Final" keyword. A methods once written cannot be override it. 

### Polymorphism 
&rarr; Ability to take many forms

#### Type of polymorphism 

&rarr; Static polymorphism: Also known as Compile time polymorphism. Method overloading.  
        
&rarr; Dynamic polymorphism: Also known as runtime polymorphism. Method overriding.   

#### Method Overloading

&rarr; Multiple methods having same name but different parameters.  
&rarr; A class can hold several methods having same name.  


#### Three ways to overload methods:

&rarr; By changing the number of arguments  
&rarr; By changing the data types of the argument.  
&rarr; by changing the order of the argument  

#### Method Overridding 

&rarr; Only inherited methods can be overridden  
&rarr; The overridden methods must have same argument list  
&rarr; The overridden method must have same return type.  

    The overriding method must not have more restrictive access modifier. If the overridden methods has a default access, then the overriding one must be 
    default, protected or public. If the overidden method is protected, then the overriding one must be protected or public. 
    If the overridden methods is public, then the overriding method must be public. 

## Solid Principles

&rarr; S: Single responsibility principle  
&rarr; O: Open close principle  
&rarr; L: Liskov substitution principle  
&rarr; I: Interface segregation principle  
&rarr; D: Dependency inversion principle 

### Why solid principles? 

&rarr; Maintainability  
&rarr; Preserve good design   
&rarr; Loose coupling  
&rarr; Reusability   
&rarr; Testability  

## Single Responsibility Principle 

        A class should have one, and only one, reason to change.

## Interface segregation principle

        Clients should not be forced to depend on interface that they do not use

## Open close principle (open for extention , close for modification )

        Software entities (classes, modules, functions) should be open for extention, but close for modification. 

Rules to be careful about when applying OCP
1. Try to avoid inheritance as it introduces tight coupling - if the superclass changes =, subclasses may need to be modified, too.
2. Use abstraction (interface) to enable you to adapt the functionality of your application without changing the existing code.


## Liskov Substitution principle 

        According to this principle, if you are inhereting any class then it should consist of all the functionality of the super class
        and it can also contain additional functionality. It should not exclude the methods of super class. Whenever using inheritence
        you should be always carefull if it is needed for sure.

## Dependency Inversion Principle

        High level modules should not depend on low level modules. Both should be dependent on Interfaces or abstraction.
        Abstraction should not depend on details. Details should depend on abstraction. 


## Objects & Relationships 

### Types of Object Relationships

1. IS-A relationships

2. HAS-A relationships
    1. Aggregation: Single owner & have their own lifetime & Child objects belong to single parent 
         Ex. Manager has many workers working under him (Employee -- has-a---> (Workers)
    2. Composition: Single owner & Owners life & Child objects belong to single parent
         Ex. Manager has the responsibility of ensuring the project success. (Manager <---has a ----> Project)

3. USES-A relationships
    1. Association 
         No Owner & Have their own lifetime & No child objects all are independent
         ex. Employee uses a swipe card by which he enters the building (Employee ---uses-a---> Swipe)

## Relationships & cardinality


## Factory Method

    Factory method is a creational design pattern that provides an interface for creating objects  in the superclass 
    but allows subclasses to alter  the type of  objects that will be created. 

    The Factory Method Design Pattern is a creational design pattern used in software development. It provides an interface for creating objects in a superclass while allowing subclasses to specify the types of objects they create.

This pattern simplifies the object creation process by placing it in a dedicated method, promoting loose coupling between the object creator and the objects themselves.
This approach enhances flexibility, extensibility, and maintainability, enabling subclasses to implement their own factory methods for creating specific object types.

### When to use Factory Design Pattern 

- If your object creation process is complex or varies under different conditions, 
using a factory method can make your client code simpler and promote reusability.

- The Factory Method Pattern allows you to create objects through an interface or abstract class, 
hiding the details of concrete implementations. 
This reduces dependencies and makes it easier to modify or expand the system without affecting existing code.

- If your application needs to create different versions of a product or may introduce new types in the future, 
the Factory Method Pattern provides a flexible way to handle these variations by defining specific factory methods 
for each product type.

- Factories can also encapsulate configuration logic, allowing clients to customize the object creation process 
by providing parameters or options to the factory method.

### Components of Factory method

1. Creator: This is an abstract class or an interface that declares the factory method. 
    The creator typically contains a method that serves as a factory for creating objects. 
    It may also contain other methods that work with the created objects.

2. Concrete Creator: Concrete Creator classes are subclasses of the Creator that implement the factory method to create specific types of objects. 
Each Concrete Creator is responsible for creating a particular product.

3. Product: This is the interface or abstract class for the objects that the factory method creates. 
The Product defines the common interface for all objects that the factory method can create.

4. Concrete Products: Concrete Product classes are the actual objects that the factory method creates. 
Each Concrete Product class implements the Product interface or extends the Product abstract class.


## Singleton Method





 











