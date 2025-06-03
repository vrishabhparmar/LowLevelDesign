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
&rarr; Private: Only access inside the class  
&rarr; Protected

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


### Inheritance
&rarr; Eliminate Redundant code + reusability

### Polymorphism 
&rarr; Ability to take many forms












