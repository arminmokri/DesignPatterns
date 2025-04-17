[< Back To Design Patterns](../../../)

# Chain of Responsibility Design Pattern
### Please support my repo with your star.

## Definition
The Chain of Responsibility Design Pattern is a behavioral pattern that allows a request to be passed along a chain of handlers until one of them handles it. Each handler in the chain either processes the request or forwards it to the next handler in the sequence. This decouples the sender of the request from its receiver, promoting flexibility in assigning responsibilities dynamically and making it easy to add or change request-processing logic without altering client code.

## Example in Real World/Nature Inspired
1. **Customer Service Call Center:** When a customer calls, their issue is first addressed by a general agent. If the issue is too complex, it's escalated to a supervisor, and then maybe to a manager — each one forming a link in the chain.
2. **Military Chain of Command:** In the military, orders or reports are passed through a hierarchy — from soldiers to sergeants, then captains, and so on — until they reach the person responsible for that level of decision-making.
3. **Animal Behavior – Pack Hierarchy:** In a wolf pack, decisions (like when to hunt or move) are initiated by the alpha and may involve other ranks in the pack, depending on the situation — forming a natural decision-handling chain.
4. **Legal System Appeals:** In a legal system, a case can go from a local court to a state court, and possibly to the supreme court if needed. Each court decides if it can handle the case or pass it up the chain.

## Real Usage/System Design Problems
1. **Event Handling Systems:** In GUI frameworks or middleware, events like mouse clicks or keyboard presses are passed along a chain of UI elements until one of them handles it.
2. **Request Filtering (e.g., HTTP Middleware):** Web frameworks often use middleware chains where each middleware component (e.g., logging, authentication, validation) processes the request and passes it along to the next if necessary.
3. **Technical Support Ticketing Systems:** Based on the nature or severity of the issue, support tickets are escalated to various levels of support. Each handler checks if it can resolve the issue before forwarding it.

## Important Points of Implementation
- **Handler Interface:** Each handler implements a common interface with a method to process the request and optionally forward it.
- **Linking Handlers:** Handlers must be connected in a chain structure. This can be done via constructor injection or setter methods.
- **Flexible Order:** Handlers can be added, removed, or reordered without impacting the overall architecture, increasing system extensibility.
- **Termination Condition:** Ensure that the request is eventually handled or gracefully rejected if no handler processes it. Avoid infinite loops in poorly designed chains.

[< Back To Design Patterns](../../../)

