package microservices.saga;

import java.util.ArrayList;
import java.util.List;

public class SagaExecutor {
    private final List<SagaAction> actions;

    public SagaExecutor() {
        actions = new ArrayList<>();
    }

    public void addAction(SagaAction action) {
        actions.add(action);
    }

    public void execute() {
        List<SagaAction> completedActions = new ArrayList<>();
        try {
            for (SagaAction action : actions) {
                action.execute();
                completedActions.add(action);
                Thread.sleep(500);
            }
        } catch (RuntimeException e) {
            Main.errPrintln("Error occurred: '" + e.getMessage() + "', performing compensations.");
            undo(completedActions);
        } catch (InterruptedException e) {
        }
    }

    private void undo(List<SagaAction> completedActions) {
        // Undo all actions that have been completed so far
        for (int i = completedActions.size() - 1; i >= 0; i--) {
            try {
                completedActions.get(i).compensate();
                Thread.sleep(500);
            } catch (RuntimeException e) {
                Main.errPrintln("Error during compensation: '" + e.getMessage() + "'");
            } catch (InterruptedException e) {
            }
        }
    }
}
