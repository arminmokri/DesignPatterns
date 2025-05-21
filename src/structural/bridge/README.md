[< Back To Design Patterns](../../../)

# Bridge Design Pattern
### Please support my repo with your star.

## Definition
The Bridge Design Pattern is a structural pattern that decouples an abstraction from its implementation so that the two can vary independently. It involves splitting a class into two separate hierarchies — one for abstraction and one for implementation — and connecting them with a bridge interface. This promotes flexibility, extensibility, and avoids a combinatorial explosion of classes when dealing with multiple dimensions of variation.

## Example in Real World/Nature Inspired
1. **TV Remote Control:** The remote (abstraction) works independently of the specific TV brand (implementation). The same remote logic can be used to control different TV models using a common interface.
2. **Musical Instrument and Player:** A violinist (abstraction) can play different types of violins (implementation), and vice versa. They operate independently but interact through a common interface (playing technique).
3. **Bridge Structure (Literally):** A physical bridge (structure) can be built over different types of terrain (land, water, valley) using various supports (implementation), yet the basic function (abstraction) of connecting two points remains consistent.
4. **Writing Tools and Surfaces:** A pen (abstraction) can be used on paper, a whiteboard, or a touchscreen (implementation). The writing tool logic is decoupled from the surface.

## Real Usage/System Design Problems
1. **UI Frameworks with Multiple Platforms:** A UI abstraction (e.g., window, button) can be rendered on different platforms (e.g., Windows, macOS, Linux) via a bridge to the platform-specific renderer.
2. **Device Control Interfaces:** An application can define a general device control abstraction, and use bridges to operate specific implementations like printers, scanners, or projectors.
3. **Cross-Format Report Generation:** A reporting module might generate reports (abstraction) in various formats (PDF, HTML, Excel), and each format has its own rendering strategy (implementation).

## Important Points of Implementation
- **Two Independent Hierarchies:** Define an abstraction interface and an implementation interface. Concrete abstractions and implementations can evolve separately.
- **Composition Over Inheritance:** Use composition to link the abstraction with its implementation rather than inheritance. This keeps the design more flexible.
- **Reduces Class Explosion:** Instead of creating a class for every combination of abstraction and implementation, use the bridge to dynamically pair them.
- **Flexible Scalability:** Adding new abstractions or implementations does not affect the existing code, making the system open for extension but closed for modification.

<p align="center">
  <a href="../../structural/adapter">⬅️ <strong>Adapter</strong></a>
  🔸
  <a href="../../structural/composite"><strong>Composite</strong> ➡️</a>
</p>

[< Back To Design Patterns](../../../)
