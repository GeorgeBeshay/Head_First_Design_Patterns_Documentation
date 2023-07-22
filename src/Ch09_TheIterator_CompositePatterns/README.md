# <p align="center"> Notes </p>
***
## 11th Design Pattern
- **The Iterator Pattern** provides a way to access the elements of an aggregate object sequentially without
exposing its underlying representation.
- **The Composite Pattern** allows you to compose objects into tree structures to represent
part-whole hierarchies. Composite lets clients treat individual objects and compositions
of objects uniformly.

<hr>

## Design Principles
- **The Single Responsibility** A class should have only one reason to change (being modified).
- `Cohesion`: is term used as a measure of how closely a class or a module supports the single responsibility principle,
When a class has a high cohesion, it means that it is designed around a set of related functions and properties. 
<hr>

## Notes
- The Iterator pattern also places the responsibility of traversal
on the iterator object, not the aggregate object which applies the principle of single
responsibility, as the aggregate object now can focus on its main goal, which is
managing multiple objects instead of managing how to iterate over them.
- Note the difference between the external and the internal iterator, our implemented iterator is an external one, 
that's because the iteration process itself 'next()' is called from the client, however the internal iterator manages this 
by itself.
- The composite pattern allows us to build structures of objects in the form of trees that contain
both compositions of objects and individual objects as nodes. 