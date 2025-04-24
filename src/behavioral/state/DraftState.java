package behavioral.state;

public class DraftState implements State {

    public void goTo(DocumentContext context, StateType desired, UserRole role) {
        switch (desired) {
            case MODERATION -> {
                context.setState(new ModerationState());
                System.out.println("Draft -> Moderation");
                System.out.flush();
            }
            case PUBLISHED -> {
                if (role == UserRole.ADMIN) {
                    context.setState(new PublishedState());
                    System.out.println("Admin: Draft -> Published");
                    System.out.flush();
                } else {
                    System.err.println("Only Admin can publish");
                    System.err.flush();
                }
            }
            default -> {
                System.err.println("Invalid transition from Draft");
                System.err.flush();
            }
        }
    }

    public StateType getType() {
        return StateType.DRAFT;
    }
}
