# <p align="center"> Notes </p>
***
## Design Principles
- .

***
## Sixth Design Patterns
- **The Singleton Pattern** ensures a class has only one instance, and provides a global
point of access to it.

***
### Notes on the DP
- Singleton objects are only created when they are needed. (Lazy Instantiation)
- The simple implementation for the pattern would result in a non expected 
behaviour when dealing with a multithreaded application, that's why it is suggested to implement
the getInstance() method as a synchronized method.
- However, synchronizing the method is expensive, that's because it is only needed
on the first call, other than that, the synchronization process is a waste of resources.
So how can we overcome this problem ??
  - Option #1: Do Nothing, in case that the method performance wasn't critical for your application
  - Option #2: ~~Lazy Creation~~, Eager Creation
  - Option #3: Double-checked locking, AKA synchronize only when needed
    - *Volatile*: Keyword used to guarantee that no thread make a copy of the variable value
  in its own stack, but, all the read and write operations are made from / to the main memory (1 copy).
  <br>For more information about the **volatile** keyword, [check this article](https://www.javatpoint.com/volatile-keyword-in-java)
  <br>For more information about the synchronized block, [check this on stackoverflow](https://stackoverflow.com/questions/2056243/java-synchronized-block-for-class)
  