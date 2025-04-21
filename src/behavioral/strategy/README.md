[< Back To Design Patterns](../../../)

# Strategy Design Pattern
### Please support my repo with your star.

## Definition
The Strategy Design Pattern is a behavioral pattern that enables selecting an algorithm’s behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable. The pattern allows the algorithm to vary independently from the clients that use it, promoting the Open/Closed Principle by enabling easy addition of new strategies without modifying existing code.

## Example in Real World/Nature Inspired
1. **Travel Navigation Methods:** When planning a trip, you can choose different travel strategies — by car, bike, or public transport. The route depends on the selected strategy.
2. **Animal Hunting Techniques:** Different animals use various hunting strategies — e.g., lions hunt in groups, owls use stealth, spiders use webs. The hunting goal is the same, but the strategy varies.
3. **Cooking Techniques:** Preparing an egg can involve boiling, frying, or scrambling — each is a strategy to achieve the same goal (cooked egg).
4. **Payment Methods:** At a store, you can pay via cash, credit card, or mobile wallet. Each payment type follows a different internal process (strategy) but serves the same purpose.

## Real Usage/System Design Problems
1. **Sorting Algorithms in Libraries:** Many libraries use the Strategy pattern to allow users to plug in different sorting strategies (e.g., quicksort, mergesort, bubblesort) depending on the context or data size.
2. **Game AI Behavior:** In games, enemies might switch between different strategies like aggressive, defensive, or evasive based on game state, implemented using interchangeable strategy classes.
3. **Data Compression or Encryption:** Systems often support multiple algorithms for tasks like compression (e.g., ZIP, GZIP) or encryption (e.g., AES, RSA), which can be swapped via a strategy interface.

## Important Points of Implementation
- **Strategy Interface:** Define a common interface for all strategies to ensure they are interchangeable and used polymorphically by the client.
- **Encapsulation of Behavior:** Each algorithm is encapsulated in a separate class, isolating it from other parts of the system and making it easier to test and maintain.
- **Runtime Flexibility:** The strategy can be selected at runtime, either manually or programmatically, allowing systems to adapt their behavior dynamically.
- **Avoid Conditional Logic:** Instead of using multiple if-else or switch statements, delegate the behavior to different strategy implementations to clean up the codebase.

[< Back To Design Patterns](../../../)
