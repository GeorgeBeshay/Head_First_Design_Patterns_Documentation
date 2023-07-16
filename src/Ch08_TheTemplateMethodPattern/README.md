# <p align="center"> Notes </p>
***
## 10th Design Pattern
- **The Template Method Pattern** defines the skeleton of an algorithm in a method,
deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an 
algorithm without changing the algorithm's structure.

<hr>

## Design Principle
- **The Hollywood Principle** Don't Call us, we'll call you.
- Used to prevent `dependency rot` (High level component depending on a low level component
depending on a high level component and so on ..)
- 
<hr>

## Notes
- Template method should always be declared as final.
- Concrete methods can either be declared as final or not, this depends on
whether we want the subclasses to have access for overriding it - this is called a `hook method` - or not.
- The primitive methods, are those abstract methods that **should** be implemented
by the subclasses.
