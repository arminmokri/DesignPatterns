[< Back To Design Patterns](../../../)

# Memento Design Pattern
### Please support my repo with your star.

## Definition
The Memento Design Pattern is a behavioral pattern that allows an object to capture and externalize its internal state so that it can be restored later, all without violating encapsulation. It provides the ability to undo or rollback an object to a previous state, which is useful in scenarios like editors, games, and transaction systems.

## Example in Real World/Nature Inspired
1. **Undo in Writing:** When you’re writing on paper with a pencil, using an eraser is like reverting to a previous version. You change the current state while preserving the ability to undo.
2. **Saving a Chess Game:** When playing chess, saving the game at a certain point lets you restore the game to that exact state later, even after several moves.
3. **Taking Photos:** A photo captures the state of a moment. Looking back at it, you can remember or even recreate what was happening at that time.
4. **Human Memory:** The human brain stores snapshots of experiences and emotions — sometimes consciously, sometimes not — that you can recall to relive or re-evaluate decisions.

## Real Usage/System Design Problems
1. **Text Editors with Undo/Redo:** Word processors and IDEs allow undoing recent changes by restoring previous states of the document or code.
2. **Game Save Systems:** Video games use mementos to save and reload game state, enabling checkpoints or rewind features.
3. **Transactional Systems:** Systems like databases or shopping carts may use mementos to rollback operations in case of errors, ensuring consistency.

## Important Points of Implementation
- **Three Roles: Originator, Memento, and Caretaker:** 
  - Originator: the object whose state needs saving/restoring.
  - Memento: stores the state.
  - Caretaker: manages saving and restoring but does not modify or inspect the content.
- **Encapsulation is Preserved:** The Memento hides the internal structure from external classes, ensuring that only the originator can access and modify its state.
- **Efficiency Considerations:** Saving deep object state frequently can be costly in terms of memory; use wisely based on use case (e.g., incremental snapshots or limiting history size).
- **Immutable Memento:** Mementos should typically be immutable once created, ensuring consistent rollback behavior.

<p align="center">
  <a href="../../behavioral/mediator">⬅️ <strong>Mediator</strong></a>
  🔸
  <a href="../../behavioral/observer"><strong>Observer</strong> ➡️</a>
</p>

[< Back To Design Patterns](../../../)
