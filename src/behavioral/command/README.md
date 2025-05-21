[< Back To Design Patterns](../../../)

# Command Design Pattern
### Please support my repo with your star.

## Definition
The Command Design Pattern is a behavioral pattern that turns a request into a standalone object containing all information about the request, such as the method to call, the method’s arguments, and the receiver of the request. This pattern decouples the sender and receiver of a request and allows for parameterizing methods, queuing requests, and logging operations. It enables operations like undo, redo, and transaction management through encapsulation of actions as objects.

## Example in Real World/Nature Inspired
1. **Remote Control for Devices:** A remote control sends commands like "turn on", "volume up", or "mute" to various devices. Each button encapsulates a specific action, and the remote doesn’t need to know the internal details of the device.
2. **Restaurant Ordering System:** A waiter takes an order (command) and delivers it to the kitchen. The waiter doesn’t cook the food—they just pass the command to the right receiver.
3. **Voice Assistant Commands:** When you say "turn off the lights" to a smart assistant, it encapsulates the request and sends it to the smart home system. You issue the command; the system executes it.
4. **Military Orders:** A general issues orders that contain the instructions. Soldiers carry them out without the general managing the execution directly. Orders can also be delayed or stored for future execution.

## Real Usage/System Design Problems
1. **GUI Button Actions:** In GUI applications, clicking a button can trigger different actions (commands). Using the Command pattern, buttons can be easily assigned, changed, or undone without modifying the button's implementation.
2. **Undo/Redo Functionality:** Many applications (e.g., text editors) use commands to represent operations. These can be stored in stacks to allow users to undo and redo actions.
3. **Task Queuing and Scheduling:** In job queues or task schedulers, commands encapsulate the logic for tasks and can be executed asynchronously or at a later time.

## Important Points of Implementation
- **Encapsulation of Actions:** Each command should encapsulate a specific action and its context (receiver and arguments), providing flexibility in execution.
- **Command Interface:** Define a common interface for all commands with an execute method (and optionally undo).
- **Invoker Role:** An invoker is responsible for triggering the execution of commands and may also support queuing or undo/redo stacks.
- **Decoupling Sender and Receiver:** The invoker (e.g., UI element) does not need to know the implementation details of the receiver. This makes it easier to modify or extend behavior.

<p align="center">
  <a href="../../behavioral/cor">⬅️ <strong>Chain of Responsibility</strong></a>
  🔸
  <a href="../../behavioral/interpreter"><strong>Interpreter</strong> ➡️</a>
</p>

[< Back To Design Patterns](../../../)
