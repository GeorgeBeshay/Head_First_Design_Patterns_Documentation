# <p align="center"> Notes </p>
***
## 12th Design Pattern
- **The State Pattern** allows an object to alter its behavior when its internal state
changes. The object will appear to change its class.

<hr>

## Notes
- By inspecting the State Design Pattern class diagram, we can notice that it is exactly the same as the Strategy Design Pattern class diagram, and that's
true ... however the main difference between both is their intent.
- The Strategy Pattern is an alternative to subclassing, that's because defining behaviors with inheritance establishes the problem of being stuck
to a behavior, on the other hand the strategy pattern offers a way to change behavior of classes by composing an object with different objects.
- The State Pattern is an alternative to putting lots of conditional statements in your context, by encapsulating the behaviors with state objects,
you can simply change the state object in a context to change its behavior.
- Also, an importance difference is that in the strategy pattern, usually the client decides which strategy to use ... in other words the client code has
knowledge about the strategies available, on the other hand in the state pattern, the client code has no knowledge about the states available, and can't
even change a context's state.
- Using the state pattern will often result in a greater number of classes in your design.
- State classes may be shared among context instances.