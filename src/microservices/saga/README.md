[< Back To Design Patterns](../../../)

# Saga Design Pattern
### Please support my repo with your star.

## Definition
The Saga Pattern is a design and data management strategy initially introduced in 1987 by Hector Garcia-Molina and Kenneth Salem to handle long-lived transactions, particularly across distributed systems or databases. In a Saga, a sequence of local transactions T1, T2, ..., Tn is executed in order. Each transaction Ti has a corresponding compensation Ci that undoes its effects. The ideal case (the "happy path") is when all transactions succeed: T1 (success), T2 (success), ..., Tn (success). If one transaction fails (e.g., Tj), the pattern prescribes executing the compensating transactions in reverse order — Cj-1, ..., C2, C1 — to undo the successfully completed actions. This concept is now commonly applied in microservices architecture to maintain data consistency without requiring distributed transactions.

## Example in Real World/Nature Inspired
1. **Travel Booking:** Booking a trip may involve multiple steps — booking a flight, reserving a hotel, and renting a car. If the hotel reservation fails, the flight and car rental must be canceled (compensated).
2. **Online Shopping Checkout:** When placing an order, the system may reserve inventory, charge the card, and create a shipment. If the payment fails, the reserved inventory must be released.
3. **Organizing a Conference:** If scheduling a venue, sending invites, and booking catering are sequential steps — but the venue is canceled — then catering and invites must be revoked.
4. **Loan Processing:** If a loan approval process involves checking credit, evaluating collateral, and disbursing funds, a failure in disbursal would require rolling back earlier steps (like retracting credit approval).

## Real Usage/System Design Problems
1. **Microservices with Distributed Transactions:** In distributed systems, especially microservices, sagas ensure data consistency by replacing two-phase commits with sequences of compensating transactions.
2. **E-Commerce Order Management:** When multiple services (inventory, payment, shipping) must complete successfully, sagas help maintain data integrity when one fails.
3. **Workflow Automation Engines:** Long-running business workflows (e.g., onboarding a customer) often need to support rollback behavior across different services and systems.

## Important Points of Implementation
- **Two Main Approaches:**
  - Choreography: Each service knows what to do and whom to notify next; no centralized orchestrator.
  - Orchestration: A central coordinator controls the saga’s flow and triggers each step.
- **Compensating Transactions Are Essential:** These must be idempotent and reliable to ensure consistency during rollback.
- **No Global Locking:** Sagas avoid holding distributed locks, making them suitable for high-scale environments.
- **Failure Scenarios Must Be Well-Handled:** Consider what happens if compensations themselves fail or are interrupted mid-execution.

<p align="center">
  <a href="../../behavioral/visitor">⬅️ <strong>Visitor</strong></a>
</p>

[< Back To Design Patterns](../../../)
