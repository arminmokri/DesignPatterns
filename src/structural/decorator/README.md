[< Back To Design Patterns](../../../)

# Decorator Design Pattern
### Please support my repo with your star.

## Definition
The Decorator Design Pattern is a structural pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class. It provides a flexible alternative to subclassing for extending functionality, by wrapping an object with a series of decorator classes that implement the same interface.

## Example in Real World/Nature Inspired
1. **Gift Wrapping:** A gift can be wrapped with decorative layers (boxes, ribbons, paper) that enhance its appearance without altering the actual gift inside.
2. **Clothing Layers:** A person can wear a base outfit and then add layers like jackets, scarves, or hats — each adding functionality like warmth or style without changing the person.
3. **Tree Decorations:** A Christmas tree is decorated with lights, ornaments, and garlands. Each added decoration enhances the tree’s look, and they can be combined in various ways.
4. **Makeup or Accessories:** Just as accessories or makeup enhance someone’s appearance or performance for a specific event, decorators enhance an object’s behavior for specific contexts.

## Real Usage/System Design Problems
1. **Extending UI Elements:** In GUI frameworks, decorators are used to add scrollbars, borders, or drop shadows to UI components without changing the base class.
2. **Adding Responsibilities in Logging:** A logging system may decorate messages with timestamps, tags, or formatting styles in a composable way.
3. **Stream I/O Systems:** In Java I/O, classes like BufferedInputStream, DataInputStream, etc., decorate base input streams to add buffering or data-type handling without modifying the original stream.

## Important Points of Implementation
- **Same Interface:** Both the core object and decorators implement the same interface, allowing decorators to be nested and treated uniformly.
- **Composition Over Inheritance:** Functionality is extended through object composition rather than deep inheritance chains, promoting more flexible designs.
- **Order Matters:** The order in which decorators are applied can affect the final behavior, so careful composition is needed.
- **Transparent Wrapping:** Clients using the final decorated object should not need to know whether it has been wrapped — interaction remains consistent.

<p align="center">
  <a href="../../structural/composite">⬅️ <strong>Composite</strong></a>
  🔸
  <a href="../../structural/facade"><strong>Facade</strong> ➡️</a>
</p>

[< Back To Design Patterns](../../../)
