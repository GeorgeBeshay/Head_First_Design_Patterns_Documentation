# <p align="center"> Notes </p>
***
## 13th Design Pattern
- **The Proxy Pattern** provides a surrogate or placeholder for another object to control access to it.

<hr>

## Notes
- A `remote proxy` acts as a local representative to a remote object - an object that lives in the heap of a 
different JVM or running in a different address space - so this remote proxy allows you to call a local
methods on it, and then forwards them to the real remote object.
- The `client object` is the object that is making use of the proxy object.
- `Remote Method Invocation` (RMI), A client object invokes a method on a remote object that doesn't exist in
the same JVM, through 2 new classes, the first one is the client helper class that acts as if it is the remote object
that would apply the method logic, actually it doesn't. The client helper class packs the method invocation and sends it
to the service helper object that exists in the remote address space, the service helper unpacks the request and apply it 
on the real service object, after getting the return result it packs it up and returns it to the client helper object, which
further the client helper object returns it to the client object. We must notice that both the client helper object
and the service helper object are objects that don't contain any method logic, they are just used for networking and communication.
- The client helper and service helper are known as `stub` and `skeleton` respectively.
- For more information about the RMI, check the following [article](https://www.javatpoint.com/RMI)
- Use the proxy pattern to create a representative object that controls access to another object, which may be remote, expensive
to create, or in need of securing.
- Some examples for proxies that control access:
  - Remote proxy that controls access to a remote object.
  - Virtual proxy that controls access to a resource that is expensive to create.
  - Protection proxy that controls access to a resource based on the access rights.