package behavioral.state;

public class PublishedState implements State {

    public void goTo(DocumentContext context, StateType desired, UserRole role) {
        switch (desired) {
            case DRAFT -> {
                context.setState(new DraftState());
                Main.println("Published -> Draft");
            }
            case MODERATION -> {
                context.setState(new ModerationState());
                Main.println("Published -> Moderation");
            }
            default -> {
                Main.errPrintln("Can't move to " + desired + " from Published");
            }
        }
    }

    public StateType getType() {
        return StateType.PUBLISHED;
    }
}
