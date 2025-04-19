[< Back To Design Patterns](../../../)

# Mediator Design Pattern
### Please support my repo with your star.

## Definition
The Mediator Design Pattern is a behavioral pattern that promotes loose coupling between objects by having them communicate through a mediator object instead of referring to each other directly. This pattern centralizes complex communication and control logic between related objects, making the system easier to maintain and scale. It is especially useful in scenarios where multiple objects interact in complex ways, helping reduce the interdependencies among them.

## Example in Real World/Nature Inspired
1. **Air Traffic Control:** At an airport, airplanes don’t communicate with each other directly. Instead, they communicate through the air traffic control tower (the mediator), which coordinates takeoffs, landings, and movements.
2. **Team Project Manager:** In a team, members typically coordinate tasks and schedules through a project manager. The manager acts as the mediator to streamline communication and avoid confusion.
3. **Smart Home Hub:** In a smart home, devices like lights, thermostats, and alarms communicate through a central hub (e.g., Google Home or Alexa), which orchestrates their actions without direct device-to-device communication.
4. **Nervous System in the Body:** Organs do not directly control each other. The brain and spinal cord (central nervous system) act as mediators, processing inputs and sending out responses.

## Real Usage/System Design Problems
1. **Chat Applications:** In group chats or messaging systems, users communicate through a central server or chatroom mediator, which handles message broadcasting and delivery.
2. **GUI Component Coordination:** In a dialog window, components (buttons, input fields, etc.) may affect each other’s behavior. Using a mediator (e.g., dialog controller), components notify the mediator instead of updating each other directly.
3. **Game Development (NPC Coordination):** In games with multiple AI characters (e.g., team-based bots), a mediator can coordinate team strategies and actions, preventing direct dependencies between individual bots.

## Important Points of Implementation
- **Central Communication Hub:** The mediator encapsulates interaction logic between components, helping avoid a tangled web of object references.
- **Decoupling:** Components only know the mediator, not each other, which reduces class interdependence and improves modularity.
- **Mediator Interface:** Define a mediator interface for sending/receiving messages or events; concrete implementations control the workflow between participants.
- **Maintenance Trade-Off:** While it simplifies communication, the mediator can become overly complex if too much logic is centralized — balance is key.

[< Back To Design Patterns](../../../)
