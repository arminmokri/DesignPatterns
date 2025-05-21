[< Back To Design Patterns](../../../)

# Factory Method Design Pattern
### Please support my repo with your star.

## Definition
The Factory Method Design Pattern is a creational pattern that defines an interface for creating an object but lets subclasses alter the type of objects that will be created. Instead of calling a constructor directly, the client calls a factory method, promoting loose coupling between client code and the concrete classes it uses. This pattern provides flexibility and scalability for object creation.

## Example in Real World/Nature Inspired
1. **Bakery Making Cakes:** A bakery can make different types of cakes (chocolate, vanilla, fruit) based on the customer's order, using a method that selects the cake type at runtime.
2. **Car Rental Service:** A car rental agency can provide different types of vehicles (SUV, sedan, truck) depending on the customer’s needs, not always the same model.
3. **Animal Breeding Farms:** A breeding farm might produce different types of animals (horses, cows, sheep) based on demand or season.
4. **Furniture Factory:** A furniture factory produces chairs, tables, or sofas. Each product creation follows a basic procedure but results in different final items.

## Real Usage/System Design Problems
1. **UI Frameworks:** Toolkits like Java Swing or Android UI use factory methods to create various UI components like buttons, text fields, and windows without coupling to specific subclasses.
2. **Logger Systems:** Logging libraries often use factory methods to create loggers configured for different outputs (console, file, network) without requiring the client to know about the specific implementation.
3. **Database Connections:** Systems may use factory methods to return different types of database connections (MySQL, Oracle, PostgreSQL) based on configuration without changing client code.

## Important Points of Implementation
- **Provides Extension Points:** Subclasses can override the factory method to determine the specific type of object to instantiate.
- **Reduces Tight Coupling:** Client code depends only on abstract products and creators, promoting flexibility and maintainability.
- **Single Responsibility Principle:** Separates object creation code from business logic, making code cleaner and easier to modify.
- **Can Be Combined with Other Patterns:** Often used alongside patterns like Singleton (for factory instance) or Template Method (for creation steps).

<p align="center">
  <a href="../simple_factory">⬅️ <strong>Simple Factory</strong></a>
  🔸
  <a href="../abstract_factory"><strong>Abstract Factory</strong> ➡️</a>
</p>

[< Back To Design Patterns](../../../)
