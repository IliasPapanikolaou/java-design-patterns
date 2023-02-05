# Java Design Patterns

<https://en.wikipedia.org/wiki/Design_Patterns>

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

This allows working with different Decorator objects to extend the functionality of an object dynamically at run-time.

![decorator_uml1](https://upload.wikimedia.org/wikipedia/commons/c/c6/UML2_Decorator_Pattern.png)

UML class and sequence diagram

![decorator_uml2](https://upload.wikimedia.org/wikipedia/commons/8/83/W3sDesign_Decorator_Design_Pattern_UML.jpg)

source: <https://en.wikipedia.org/wiki/Decorator_pattern>

## Adapter design pattern
### What problems can it solve?

Consider a scenario in which there is an app that's developed in the US which returns the top speed of 
luxury cars in miles per hour (MPH). Now we need to use the same app for our client in the UK that wants 
the same results but in kilometers per hour (km/h).

To deal with this problem, we'll create an adapter which will convert the values and give us the desired results:

![adapter_uml1](https://www.baeldung.com/wp-content/uploads/2017/09/Rpt_ER5p.jpg)

## Observer design pattern
### What problems can the Observer design pattern solve?
The Observer pattern addresses the following problems:

- A one-to-many dependency between objects should be defined without making the objects tightly coupled.
- It should be ensured that when one object changes state, an open-ended number of dependent objects are updated 
automatically.
- It should be possible that one object can notify an open-ended number of other objects.

UML class and sequence diagram

![observer_uml1](https://upload.wikimedia.org/wikipedia/commons/0/01/W3sDesign_Observer_Design_Pattern_UML.jpg)

UML class diagram

![observer_uml2](https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Observer_w_update.svg/1920px-Observer_w_update.svg.png)

## Proxy design pattern
### What problems can it solve?
The Proxy design pattern is one of the twenty-three well-known GoF design patterns that describe how to solve 
recurring design problems to design flexible and reusable object-oriented software, that is, 
objects that are easier to implement, change, test, and reuse.

- The access to an object should be controlled.
- Additional functionality should be provided when accessing an object.

![proxy_uml1](https://upload.wikimedia.org/wikipedia/commons/6/6e/W3sDesign_Proxy_Design_Pattern_UML.jpg)

Class Diagram

![proxy_uml2](https://www.baeldung.com/wp-content/uploads/2017/09/MrvrsH6.jpg)

## FACADE design pattern
### What problems can the FACADE design pattern solve?
The Facade design pattern is a structural design pattern that provides a simple and unified interface to a complex system of classes, libraries, or frameworks. It acts as a wrapper around the existing system, hiding its complexities and providing a single, easy-to-use interface to clients. The facade design pattern is often used in software engineering to improve the readability and usability of a codebase, making it easier for developers to work with and understand.

## Factory design pattern
### What problems can the Factory design pattern solve?
The Factory design pattern is a creational design pattern in software engineering that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. The Factory Method pattern allows a class to defer instantiation to its subclasses. This provides a way to encapsulate object creation, and improve flexibility and maintainability of the code.