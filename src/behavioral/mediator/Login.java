package behavioral.mediator;

public class Login extends Component {

    public final static String EVENT_EMPTY_FIELD = "empty-field";
    public final static String EVENT_YES = "yes";
    public final static String EVENT_NO = "no";

    public final static String MESSAGE_EMPTY_FIELD = "Please fill username and password";
    public final static String MESSAGE_INVALID_USERNAME_PASSWORD = "Invalid username or password";


    private String usernameTextBox;
    private String passwordTextBox;

    public Login(Mediator mediator) {
        super(mediator);
        this.usernameTextBox = "";
        this.passwordTextBox = "";
    }

    public void doLogin() {
        System.out.println("Login: action='login button pressed'");
        if (this.usernameTextBox.equals("") || this.passwordTextBox.equals("")) {
            super.mediator.notify(this, EVENT_EMPTY_FIELD);
        } else {
            User user = User.getUser(this.usernameTextBox);
            if (user.isPasswordValid(this.passwordTextBox)) {
                super.mediator.notify(this, EVENT_YES);
            } else {
                super.mediator.notify(this, EVENT_NO);
            }
        }
    }

    public void setUsernameTextBox(String usernameTextBox) {
        System.out.println("Login: action='write \"" + usernameTextBox + "\" in username text box'");
        this.usernameTextBox = usernameTextBox;
    }

    public void setPasswordTextBox(String passwordTextBox) {
        System.out.println("Login: action='write \"" + "****" + "\" in password text box'");
        this.passwordTextBox = passwordTextBox;
    }

    @Override
    public String toString() {
        String visible = super.getVisible() ? "is visible" : "is invisible";
        return "Login{" + visible + "}";
    }

}
