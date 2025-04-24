[< Back To Design Patterns](../../../)

# Template Method Design Pattern
### Please support my repo with your star.

## Definition
The Template Method Design Pattern is a behavioral pattern that defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It allows subclasses to redefine certain steps of an algorithm without changing its overall structure. This promotes code reuse and enforces a consistent process while still allowing flexibility for specific behaviors.

## Example in Real World/Nature Inspired
1. **Cooking Recipes:** A recipe lays out the steps to prepare a dish (boil water, add pasta, cook for 10 minutes), but the exact type of ingredients or seasoning may vary depending on the dish.
2. **Morning Routines:** People generally follow a similar routine in the morning (wake up, brush teeth, have breakfast), but specific steps like choice of food or exercise may differ.
3. **Construction Process:** Building a house follows a general plan (lay foundation, build structure, install utilities), but the style and materials may vary with each project.
4. **Plant Growth:** The process of germination, growth, flowering, and reproduction is generally the same across plants, but specific mechanisms differ between species.

## Real Usage/System Design Problems
1. **Report Generation Systems:** A system that generates different types of reports (PDF, Excel, HTML) can use a template method for the overall generation process while letting subclasses implement format-specific logic.
2. **Data Parsing/Processing Pipelines:** When parsing different file formats (CSV, XML, JSON), a template method can define the steps for validation, extraction, and storage, allowing format-specific details to be implemented in subclasses.
3. **Frameworks with Hook Methods:** UI frameworks and testing tools often use the Template Method pattern to allow developers to define hooks (e.g., setup(), teardown()) that fit into a predefined lifecycle.

## Important Points of Implementation
- **Abstract Class Defines Template:** An abstract class implements the template method and defines default behavior for shared steps, while marking others as abstract or overridable.
- **Hook Methods:** Optional steps can be defined as hooks, giving subclasses the option to override them without being forced to.
- **Inversion of Control:** This pattern is an example of the "Hollywood Principle" — “Don’t call us, we’ll call you.” The base class controls the algorithm and calls subclass methods at the right time.
- **Promotes Code Reuse:** Common logic stays in the base class, reducing duplication and improving maintainability.

[< Back To Design Patterns](../../../)
