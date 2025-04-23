[< Back To Design Patterns](../../../)

# Flyweight Design Pattern
### Please support my repo with your star.

## Definition
The Flyweight Design Pattern is a structural pattern that focuses on reducing memory usage by sharing as much data as possible with similar objects. It achieves this by separating intrinsic (shared, immutable) and extrinsic (context-specific, variable) state, allowing many fine-grained objects to be represented efficiently with fewer instances. This pattern is especially useful when dealing with large numbers of objects that share common data.

## Example in Real World/Nature Inspired
1. **Text Characters in a Document:** When rendering a large document, each character (e.g., "a", "b", "c") is stored once, and reused across the document. The position and formatting are external (extrinsic), but the glyph is shared.
2. **Chess Pieces on a Board:** In a chess game, there are only a few types of pieces (king, queen, rook), and instead of creating new objects for each, you can reuse one instance per piece type and track position externally.
3. **Leaves on a Tree in a Forest Simulation:** A simulation might render thousands of trees, but all use the same leaf structure — color, shape, and texture are shared, while position and orientation are extrinsic.
4. **Street Lamps in a City Model:** A 3D city model can share a single street lamp design across all streets, only varying the position, brightness, or orientation as needed.

## Real Usage/System Design Problems
1. **Rendering Text in Word Processors or IDEs:** Characters are flyweights — one object per symbol, with extrinsic state like position, font size, or color managed separately.
2. **Game Development (Sprites, Tiles):** A game with many similar objects (e.g., grass tiles, bullets) can use flyweight objects to reuse image data while tracking coordinates or status externally.
3. **Memory Optimization in Large Data Structures:** Systems that handle large graphs, trees, or document object models (DOM) can use flyweight nodes to share common attributes across repeated structures.

## Important Points of Implementation
- **Intrinsic vs. Extrinsic State:** Separate shared data (intrinsic) from unique data (extrinsic). Intrinsic state is stored in the flyweight object; extrinsic state is provided by the client.
- **Flyweight Factory:** Use a factory to manage flyweight instances and ensure that identical intrinsic state objects are shared.
- **Memory Efficiency:** The main goal is to reduce memory usage in scenarios with high object count and redundancy.
- **Immutable Shared State:** Flyweight objects are typically immutable and stateless — changes should happen in the extrinsic context, not in the flyweight itself.

[< Back To Design Patterns](../../../)
