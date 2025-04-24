package behavioral.state;

public class PublishedState implements State {

    public void goTo(DocumentContext context, StateType desired, UserRole role) {
        switch (desired) {
            case DRAFT -> {
                context.setState(new DraftState());
                System.out.println("Published -> Draft");
                System.out.flush();
            }
            case MODERATION -> {
                context.setState(new ModerationState());
                System.out.println("Published -> Moderation");
                System.out.flush();
            }
            default -> {
                System.err.println("Can't move to " + desired + " from Published");
                System.err.flush();
            }
        }
    }

    public StateType getType() {
        return StateType.PUBLISHED;
    }
}
