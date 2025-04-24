package behavioral.state;

public interface State {

    void goTo(DocumentContext context, StateType desiredState, UserRole role);

    StateType getType();
}
