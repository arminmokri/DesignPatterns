[< Back To Design Patterns](../../../)

# Adapter Design Pattern
### Please support my repo with your star.

## Definition
The Adapter Design Pattern is a structural pattern that allows incompatible interfaces to work together. It acts as a bridge between two interfaces by wrapping one interface so that it behaves like another. This enables the reuse of existing classes even if they don’t fit the expected interface, promoting flexibility and integration with third-party or legacy code without modifying the original source.

## Example in Real World/Nature Inspired
1. **Electrical Plug Adapter:** A travel plug adapter allows you to connect your charger to different outlet types around the world. It adapts one plug shape and voltage to another.
2. **Language Interpreter:** In international meetings, a human interpreter translates between two languages, allowing people with incompatible vocabularies to communicate.
3. **Shoe Inserts:** A person may use orthopedic insoles (adapter) to wear standard shoes while still meeting their foot support needs.
4. **Tool Attachments:** A drill bit adapter allows different drill heads to fit onto a power drill, making incompatible parts work together.

## Real Usage/System Design Problems
1. **Integrating Legacy Systems:** When refactoring or modernizing a system, an adapter can help integrate older components with new interfaces without changing existing code.
2. **Third-Party Library Integration:** You can use an adapter to make a third-party API fit your application’s expected interface, avoiding direct dependencies on vendor-specific types.
3. **Standardization Across Interfaces:** In large systems where various modules expose different interfaces for similar functionality, adapters can create a common interface layer to simplify client usage.

## Important Points of Implementation
- **Target and Adaptee:** Identify the target interface your client expects and the adaptee interface that needs to be adapted.
- **Wrapper Class:** Implement a wrapper (adapter) that translates requests from the target interface to the adaptee’s format and behavior.
- **Object vs. Class Adapter:** Use object adapters (composition) to wrap adaptees or class adapters (inheritance) where language support exists (e.g., multiple inheritance in C++).
- **Minimal Intrusion:** The adapter should not modify the existing code or interface of the adaptee, preserving its original integrity.

<p align="center">
  <a href="../../creational/singleton">⬅️ <strong>Singleton</strong></a>
  🔸
  <a href="../../structural/bridge"><strong>Bridge</strong> ➡️</a>
</p>

[< Back To Design Patterns](../../../)
