[< Back To Design Patterns](../../../)

# Factory Method Design Pattern
### Please support my repo with your star.

## Definition
The Factory Design Pattern is a creational pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. It abstracts the instantiation logic, enabling clients to create objects without specifying the exact class of the object to be created. This pattern promotes loose coupling and greater flexibility when introducing new types of objects into the system.

## Example in Real World/Nature Inspired
1. **Baking in a Bakery:** A bakery acts like a factory — you order a type of pastry (e.g., bread, croissant), and the bakery prepares it without you needing to know how it's made internally.
2. **Toy Factory:** A toy factory receives orders and produces different types of toys (dolls, cars, animals) based on the requested specification — the same system creates different products.
3. **Plant Seed Germination:** A seed contains the blueprint to produce a specific plant. Different seeds (factories) grow into different plants based on their internal structure, even if grown in the same environment.
4. **Tailor-Made Clothing:** A customer specifies the kind of clothing (shirt, trousers, jacket), and the tailor (factory) crafts the item based on the request, without the customer knowing the stitching process.

## Real Usage/System Design Problems
1. **Framework or Library Design:** When building frameworks, factories allow developers to inject dependencies or create components without knowing the implementation details.
2. **Switching Implementations Easily:** If an app needs to support different databases, file formats, or services, a factory can be used to create the correct implementation at runtime based on configuration or environment.
3. **Object Lifecycle Management:** For applications where object creation involves complex steps (e.g., initializing state, loading dependencies), a factory centralizes and simplifies that process.

## Important Points of Implementation
- **Common Interface or Abstract Class:** Products should share a common interface or superclass to allow clients to interact with the result in a generic way.
- **Decouple Instantiation:** Client code should rely on a factory to get the object, not instantiate it directly using new.
- **Extensibility:** Adding new product types should not require modifying existing factory logic if designed with good abstraction (Open/Closed Principle).
- **Factory Method vs. Simple Factory:** A factory method is typically part of a class hierarchy and may be overridden by subclasses, while a simple factory is a standalone class responsible for creating objects.

[< Back To Design Patterns](../../../)
