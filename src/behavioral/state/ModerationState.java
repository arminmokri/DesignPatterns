package behavioral.state;

public class ModerationState implements State {

    public void goTo(DocumentContext context, StateType desired, UserRole role) {
        switch (desired) {
            case DRAFT -> {
                context.setState(new DraftState());
                System.out.println("Moderation -> Draft");
                System.out.flush();
            }
            case PUBLISHED -> {
                if (role == UserRole.ADMIN) {
                    context.setState(new PublishedState());
                    System.out.println("Admin: Moderation -> Published");
                    System.out.flush();
                } else {
                    System.err.println("Only Admin can publish");
                    System.err.flush();
                }
            }
            default -> {
                System.err.println("Invalid transition from Moderation");
                System.err.flush();
            }
        }
    }

    public StateType getType() {
        return StateType.MODERATION;
    }
}
