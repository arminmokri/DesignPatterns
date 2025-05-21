[< Back To Design Patterns](../../../)

# Simple Factory Design Pattern
### Please support my repo with your star.

## Definition
The Simple Factory Pattern is a creational pattern that centralizes object creation in one place: a factory class. It defines a static method that takes some parameters and returns an instance of a class, typically choosing the appropriate subclass or implementation based on input. While not officially part of the "Gang of Four" design patterns, it is widely used as a practical way to separate object creation from business logic.

## Example in Real World/Nature Inspired
1. **Pizza Store:** You order a pizza by telling the store what kind (cheese, pepperoni, veggie), and the kitchen (factory) prepares the correct type without you knowing the detailed steps.
2. **Toy Factory:** You specify which toy you want (car, doll, robot), and the toy factory produces the correct one, hiding the complexity of the manufacturing process.
3. **Shoe Store:** Based on your needs (running shoes, boots, sandals), the store selects and provides the right shoe type for you.
4. **Coffee Machine:** Pressing a button (espresso, latte, cappuccino) causes the machine to make the selected drink without you manually preparing each component.

## Real Usage/System Design Problems
1. **UI Component Creation:** In simple UI libraries, a factory might create buttons, labels, or text boxes based on a type parameter.
2. **Message or Notification Systems:** A simple factory can generate SMS, Email, or PushNotification objects based on user settings.
3. **Payment Processing Systems:** Depending on the selected payment method (credit card, PayPal, cryptocurrency), the factory can produce the appropriate payment handler.

## Important Points of Implementation
- **Static Factory Method:** Typically uses a static method for object creation without needing to instantiate the factory class itself.
- **Centralized Object Creation:** Simplifies maintenance by keeping the object creation logic in one place.
- **Limited Scalability:** Adding a new product requires modifying the factory code, which can violate the Open/Closed Principle if changes are frequent.
- **Good for Small Projects:** Best suited for applications where the number of product types is relatively small and stable.

<p align="center">
  <a href="../../creational/factory_method"><strong>Factory Method</strong> ➡️</a>
</p>

[< Back To Design Patterns](../../../)
