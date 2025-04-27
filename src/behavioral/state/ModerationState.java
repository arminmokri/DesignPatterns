package behavioral.state;

public class ModerationState implements State {

    public void goTo(DocumentContext context, StateType desired, UserRole role) {
        switch (desired) {
            case DRAFT -> {
                context.setState(new DraftState());
                Main.println("Moderation -> Draft");
            }
            case PUBLISHED -> {
                if (role == UserRole.ADMIN) {
                    context.setState(new PublishedState());
                    Main.println("Admin: Moderation -> Published");
                } else {
                    Main.errPrintln("Only Admin can publish");
                }
            }
            default -> {
                Main.errPrintln("Invalid transition from Moderation");
            }
        }
    }

    public StateType getType() {
        return StateType.MODERATION;
    }
}
