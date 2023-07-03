# <p align="center"> Notes </p>
***
## 8th Design Pattern
- **The  Adapter Pattern** converts the interface of a class into another interface the clients expect.
Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
## 9th Design Pattern
- **The  Pattern**

***
## The Adapter Pattern
- The Client is the code which is implemented against / expecting to deal with a specific IF, 
our previous example, the client was the `testDuck()` method which was expecting to receive an object
of type Duck as a parameter.
- The Adapter is the essential class in this pattern, it holds an instance of an object which implements
the adaptee IF (the interface that should be converted / behave as another IF, in our example
it was the turkey IF) and implements the target IF (the IF which the adaptee should be converted / behave as it which in our case
was the duck interface).
- The Adaptee is the interface which the objects used to implement, actually it is the current behavior that the objects exhibit, and it is required to 
change this behavior to another form.
- The object composition of the Adapter class make it possible to use the adapter with any subclass of the adaptee.
- The pattern binds the client code to an interface not to an implementation, which means that we could use several adapters
each converting a different set of classes to the target interface without the client code having any knowledge about them.

<hr>

### Object Adapter VS Class Adapter
- The previously described pattern was the object adapter pattern, that favors composition than inheritance,
however the class adapter pattern uses multiple inheritances which is not supported in java.
- The class adapter pattern is committed to one adaptee, which means it can't adapt more than 1 adaptee.
- The Class Adapter Pattern can override the behavior of the adaptee.
- In case of the Object Adapter Pattern, when adding any behavior on the adaptee, this behavior is also applied to all the adaptee
subclasses.
- for more information check the following [article](https://stackoverflow.com/questions/9978477/difference-between-object-adapter-pattern-and-class-adapter-pattern)

<hr>

### Real World Adapters
- Enumerators & Iterators
- 
 