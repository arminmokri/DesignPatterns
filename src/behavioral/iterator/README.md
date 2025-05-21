[< Back To Design Patterns](../../../)

# Iterator Design Pattern
### Please support my repo with your star.

## Definition
The Iterator Design Pattern is a behavioral pattern that provides a way to access the elements of a collection object sequentially without exposing its underlying representation. It encapsulates the traversal logic and allows the client to iterate over a collection in a consistent manner, regardless of the collection's structure. This pattern promotes decoupling between collections and the algorithms used to traverse them.

## Example in Real World/Nature Inspired
1. **TV Channel Remote Scanning:** When flipping through TV channels using a remote, you sequentially access each channel without knowing the internal order or signal structure — the remote acts as an iterator.
2. **Music Playlist:** When playing songs in a playlist, the music player iterates through each track one by one, regardless of whether the list is shuffled, sorted, or looped.
3. **Library Book Browsing:** When browsing a library shelf, you scan books one by one without needing to know how they are cataloged internally.
4. **Bee Pollination:** Bees move from flower to flower collecting nectar — they visit elements (flowers) of a field (collection) in sequence, without knowing the layout of the entire field.

## Real Usage/System Design Problems
1. **Collection Traversal:** When an application needs to traverse various types of collections (e.g., arrays, lists, trees), the Iterator pattern provides a unified interface for doing so.
2. **Custom Data Structures:** In systems with custom data structures (e.g., a graph or a composite object), implementing an iterator allows external code to access elements without exposing structure.
3. **Parallel or Lazy Iteration:** For large datasets or stream processing, iterators can control access to data elements one at a time, improving performance and supporting lazy evaluation.

## Important Points of Implementation
- **Iterator Interface:** Define a standard interface with methods like hasNext() and next() to provide consistent traversal.
- **Separation of Concerns:** The iterator encapsulates the traversal logic, keeping the data structure clean and focused on storage rather than navigation.
- **Multiple Iterators:** Different types of iterators (e.g., reverse, filtered) can be implemented for the same collection, enabling flexible traversal strategies.
- **Fail-Safe or Fail-Fast:** Consider whether the iterator should detect changes in the underlying collection during iteration (fail-fast) or tolerate them (fail-safe).

<p align="center">
  <a href="../../behavioral/interpreter">⬅️ <strong>Interpreter</strong></a>
  🔸
  <a href="../../behavioral/mediator"><strong>Mediator</strong> ➡️</a>
</p>

[< Back To Design Patterns](../../../)
