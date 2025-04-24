package behavioral.state;

public class DocumentContext {

    private State currentState;

    public DocumentContext() {
        this.currentState = new DraftState(); // Initial state
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void goTo(StateType desiredState, UserRole role) {
        currentState.goTo(this, desiredState, role);
    }

    public StateType getCurrentState() {
        return currentState.getType();
    }
}
