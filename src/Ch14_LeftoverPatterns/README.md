# <p align="center"> Notes </p>
***

## The Bridge Pattern
    Use it to vary not only the implementations, but also the abstractions.
  - Decouples implementation so that it is not bound permanently to an interface.
  - Abstraction and implementation can be extended independently.
  - Increases design complexity.

## The Builder Pattern
    Use the builder pattern to encapsulates the construction of a product and allow
    it to be constructed in several steps.
  - Encapsulates the way a complex object is constructed.
  - allows objects to be constructed in multi-steps and varying process.
  - Hides the internal representation of the product from the client.
  - Often used for building composite structures.

## The Chain of Responsibility Pattern
    Use the COR pattern when you want to give more than one object a chance to handle 
    a request.
  - Decouples the sender of the request from its receivers.
  - Allows you to add / remove responsibilities dynamically by changing the members or 
the order of the chain.
  - Execution of request is not guaranteed, as the request may fall of the chain without being 
handled (however you can implement a catch-all handler at the end of the chain based your design intention.)

## The Flyweight Pattern
    Use the Flyweight pattern when one instance of a class can be used to provide many
    virtual instances.
  - Reduces the number of object instances at runtime.
  - Centralizes state for many virtual objects into a single location.
  - Used when a class has many instances, and they can all be controlled identically.
  - single instances of the class will not be able to behave independently.

## The Interpreter Pattern
    Use it to build an interpreter for a SIMPLE language.
  - You can easily change or extend the language.
  - When adding methods to the class structure, you can easily add new behaviors beyond interpretation.
  - Don't use when the number of grammar rules is large.

## The Mediator Pattern
    Use the mediator pattern to centralize complex communication and control between
    related objects.
  - Before the pattern, the objects were tightly coupled to each other, after applying
the pattern they now have no knowledge about each other, all of them just communicates
with the mediator.
  - Simplifies maintenance of the system by centralizing control logic.
  - simplifies and reduces the variety of messages sent from / to objects in the system.

## The Memento Pattern
    Use the memento pattern when you need to be able to return an object to one of its previous state
    for instances, if your user requests an "undo"
  - Used to save state.
  - saving and restoring process can be time-consuming.
  - keeps the key object's data encapsulated.
  - keeping the saved state external from the key objects helps to maintain cohesion.

## The Prototype Pattern
    Use it when creating an instance of a given class is either expensive or complicated.
  - Sometimes, copying an object can be more efficient than creating a new one.
  - Hides the complexities of making new instances from the client code.

## The Visitor Pattern
    Use it when you want to add capabilties to a composite of objects and encapsulation is not 
    important.
  - Allows you to add operations to a composite structure without changing the structure itself.
  - The code for operations performed on the composite objects by the visitor is centralized.
  - The composite classes' encapsulation is broken when the visitor is used.