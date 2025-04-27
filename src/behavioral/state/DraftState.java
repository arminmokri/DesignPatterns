package behavioral.state;

public class DraftState implements State {

    public void goTo(DocumentContext context, StateType desired, UserRole role) {
        switch (desired) {
            case MODERATION -> {
                context.setState(new ModerationState());
                Main.println("Draft -> Moderation");
            }
            case PUBLISHED -> {
                if (role == UserRole.ADMIN) {
                    context.setState(new PublishedState());
                    Main.println("Admin: Draft -> Published");
                } else {
                    Main.errPrintln("Only Admin can publish");
                }
            }
            default -> {
                Main.errPrintln("Invalid transition from Draft");
            }
        }
    }

    public StateType getType() {
        return StateType.DRAFT;
    }
}
