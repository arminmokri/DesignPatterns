[< Back To Design Patterns](../../../)

# Singleton Pattern

### Please support my repo with your star.

## Definition
The Singleton pattern ensures that a class has only one instance and provides a global point of access to it. This design pattern is useful when you need to control access to a single resource or object, for instance, in situations where having more than one instance could lead to inconsistent behavior, resource contention, or other complications.

## Real-World Example
1. **The Sun and the Earth**: The Sun is a singular entity that maintains the Earth's orbit. There is only one Sun for Earth, and its consistent presence governs the patterns of life, similarly to how the Singleton pattern ensures one instance of a class governs behavior in an application.
   
2. **Presidents of Countries**: Every country typically has one president at a time. A country can only function effectively with a single leader; similarly, the Singleton pattern ensures that a class has only one instance.

3. **Thermostat**: In a building, there is often one thermostat that controls the entire climate of the space. Multiple thermostats would conflict, just as a Singleton pattern prevents multiple instances from causing inconsistency.

## Example of Usage or System Design Problems Solved
1. **Database Connection Pool**: When managing database connections, you want only one instance of the database connection pool to ensure the application doesn't open multiple connections unnecessarily, leading to performance degradation and resource wastage.
   
2. **Logger Class**: A logging utility is a common example. Having multiple loggers that write to the same file or log stream would cause confusion. The Singleton pattern ensures a single logger instance, preventing potential file access conflicts.

3. **Configuration Settings**: In many applications, configuration settings are stored centrally. Using a Singleton ensures that there is one and only one configuration manager that reads, stores, and updates settings, providing consistency across the application.

## Important Points of Implementation
- **Lazy Instantiation**: Often, the Singleton pattern uses lazy instantiation, where the instance is created only when needed. In multi-threaded environments, care should be taken to make the instantiation thread-safe.
  
- **Thread Safety**: When implementing a Singleton in a multi-threaded application, ensuring thread safety during instance creation is important. This can be achieved by using synchronization mechanisms or the "Bill Pugh Singleton" design, which utilizes a static inner helper class for thread-safe instantiation.
  
- **Global Access**: The Singleton instance should be accessible globally, but you should avoid making it overly accessible, as this could lead to misuse and poor separation of concerns in the codebase.

[< Back To Design Patterns](../../../)
