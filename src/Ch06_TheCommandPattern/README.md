# <p align="center"> Notes </p>
***
## Seventh Design Patterns
- **The Command Pattern** Encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.

***
## Uses of Command Pattern
- Queueing requests (Think of bunch of threads that keep serving some requests from multiples sources, 
the sources and the threads are decoupled through the command pattern, which means that the requester doesn't know
who will serve it, neither the server thread has any idea about the concrete implementation of how something
is exactly done, all what the thread knows is that the command has an execute() method so it will invoke it)
- Logging requests 