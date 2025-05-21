[< Back To Design Patterns](../../../)

# Proxy Design Pattern
### Please support my repo with your star.

## Definition
The Proxy Design Pattern is a structural pattern that provides a surrogate or placeholder for another object to control access to it. The proxy acts as an intermediary between the client and the real object, which can be helpful for controlling access, adding functionality, or delaying object creation. Proxies are often used for reasons such as security, logging, lazy initialization, or remote object interaction.

## Example in Real World/Nature Inspired
1. **Security Guard at a Gate:** A guard (proxy) controls who can access a building. They represent the building and decide whether to allow someone in or not, based on permissions.
2. **Credit Card Usage:** A credit card acts as a proxy for your bank account. It facilitates transactions without giving direct access to your actual funds or bank systems.
3. **TV Remote Control:** A remote acts as a proxy to the actual TV — you interact with the remote, which then controls the TV on your behalf.
4. **Real Estate Agent:** An agent acts as a proxy between the buyer and seller, handling the communication and property tours without the buyer having to directly deal with the owner.

## Real Usage/System Design Problems
1. **Virtual Proxy for Expensive Objects:** Used to delay the creation of expensive objects like images, videos, or network connections until absolutely necessary (lazy loading).
2. **Remote Proxy for Distributed Systems:** In distributed systems, a local proxy object represents a remote service or object, handling communication over the network.
3. **Protection Proxy for Security:** Used to restrict access to sensitive operations or data based on user roles or permissions, acting as a gatekeeper.
4. **Smart Proxy for Logging or Counting:** A proxy can add extra functionality like logging calls, counting accesses, or managing reference counts without modifying the original object.

## Important Points of Implementation
- **Implements Same Interface:** The proxy and real subject implement the same interface, allowing the client to interact with them interchangeably.
- **Control Access Transparently:** The proxy should manage access or enhancement without changing the client's usage.
- **Multiple Proxy Types:** Variants include virtual proxy (lazy initialization), protection proxy (authorization), remote proxy (networking), and smart proxy (extra logic like caching or logging).
- **Decouples Responsibilities:** Allows you to separate resource-intensive or cross-cutting concerns from the core business logic in the real object.

<p align="center">
  <a href="../../structural/flyweight">⬅️ <strong>Flyweight</strong></a>
  🔸
  <a href="../../behavioral/cor"><strong>Chain of Responsibility</strong> ➡️</a>
</p>

[< Back To Design Patterns](../../../)
