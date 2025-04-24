[< Back To Design Patterns](../../../)

# State Design Pattern
### Please support my repo with your star.

## Definition
The State Design Pattern is a behavioral pattern that allows an object to change its behavior when its internal state changes. It appears as if the object changed its class. Instead of using conditionals to manage state-dependent behavior, state-specific logic is encapsulated into separate classes, and the context object delegates the work to the current state object. This improves readability, flexibility, and maintainability.

## Example in Real World/Nature Inspired
1. **Traffic Light System:** A traffic light changes its behavior (e.g., red, yellow, green) based on its current state. Each light governs how cars and pedestrians behave at that time.
2. **Vending Machine:** A vending machine behaves differently depending on its state: accepting coins, dispensing items, or being out of service.
3. **Seasons of Nature:** The environment behaves differently in each season — in winter, animals hibernate, and in spring, flowers bloom. The world’s behavior shifts based on its current state.
4. **Human Moods:** A person may react differently to the same situation depending on their mood (happy, sad, angry). Mood represents the internal state that alters external behavior.

## Real Usage/System Design Problems
1. **Workflow Engines:** A document in a publishing system can have states like Draft, Review, Published, and Archived. Each state determines what actions are allowed and how transitions occur.
2. **Game Character Behavior:** A game character might behave differently when idle, walking, attacking, or dead. Using the State pattern, each behavior is encapsulated and swapped as needed.
3. **Connection States (Network/Database):** A connection object might be in a Connected, Disconnected, or Connecting state. Each state has different methods enabled or behavior for retrying, timing out, etc.

## Important Points of Implementation
- **Encapsulate States in Classes:** Each state is represented as a separate class implementing a common interface, which defines behaviors for that state.
- **Context Maintains Current State:** The main context class holds a reference to a state object and delegates calls to it.
- **Avoids Conditional Complexity:** Eliminates complex conditionals based on state inside the context class by moving behavior into the state classes themselves.
- **State Transitions are Encapsulated:** State transitions can be managed inside the state objects or explicitly via the context, offering clean separation and control.

[< Back To Design Patterns](../../../)
