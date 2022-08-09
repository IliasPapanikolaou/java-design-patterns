# Java Design Patterns

## Decorator design pattern

### What problems can it solve?

- Responsibilities should be added to (and removed from) an object dynamically at run-time.
- A flexible alternative to subclassing for extending functionality should be provided.

When using subclassing, different subclasses extend a class in different ways. 
But an extension is bound to the class at compile-time and can't be changed at run-time.

### What solution does it describe?

Define Decorator objects that

- implement the interface of the extended (decorated) object (Component) transparently by forwarding all requests to it
- perform additional functionality before/after forwarding a request.
- 
This allows working with different Decorator objects to extend the functionality of an object dynamically at run-time.

![decorator_uml1](https://upload.wikimedia.org/wikipedia/commons/c/c6/UML2_Decorator_Pattern.png)

UML class and sequence diagram
![decorator_uml2](https://upload.wikimedia.org/wikipedia/commons/8/83/W3sDesign_Decorator_Design_Pattern_UML.jpg)

source: <https://en.wikipedia.org/wiki/Decorator_pattern>