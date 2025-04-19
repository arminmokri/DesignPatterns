package behavioral.mediator;

public class GuiMediator implements Mediator {

    private final Login login;
    private final Dashboard dashboard;
    private final Dialog dialog;

    public GuiMediator() {
        login = new Login(this);
        dashboard = new Dashboard(this);
        dialog = new Dialog(this);

        // startup state
        login.setVisible(true);
        dashboard.setVisible(false);
        dialog.setVisible(false);
    }

    @Override
    public void notify(Component component, String event) {

        if (component == login) {
            switch (event) {
                case Login.EVENT_EMPTY_FIELD:
                    login.setVisible(false);
                    dashboard.setVisible(false);
                    dialog.setVisible(true);
                    dialog.showMessage(Login.MESSAGE_EMPTY_FIELD);
                    break;
                case Login.EVENT_NO:
                    login.setVisible(false);
                    dashboard.setVisible(false);
                    dialog.setVisible(true);
                    dialog.showMessage(Login.MESSAGE_INVALID_USERNAME_PASSWORD);
                    break;
                case Login.EVENT_YES:
                    login.setVisible(false);
                    dashboard.setVisible(true);
                    dialog.setVisible(false);
                    break;
            }
        } else if (component == dialog) {
            switch (event) {
                case Dialog.EVENT_OK:
                    login.setVisible(true);
                    dashboard.setVisible(false);
                    dialog.setVisible(false);
                    break;
            }
        } else if (component == dashboard) {
            switch (event) {
                // implement dashboard functionality here
            }
        }
    }

    public Login getLogin() {
        return login.getVisible() ? login : null;
    }

    public Dashboard getDashboard() {
        return dashboard.getVisible() ? dashboard : null;
    }

    public Dialog getDialog() {
        return dialog.getVisible() ? dialog : null;
    }

    @Override
    public String toString() {
        return "GuiMediator{" +
                this.login.toString() +
                ", " + this.dashboard.toString() +
                ", " + this.dialog.toString() +
                '}';
    }
}
