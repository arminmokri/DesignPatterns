package behavioral.mediator;

public class Dialog extends Component {

    public final static String EVENT_OK = "ok";

    public Dialog(Mediator mediator) {
        super(mediator);
    }

    public void showMessage(String message) {
        Main.println("Dialog: message='" + message + "'");
    }

    public void clickOk() {
        Main.println("Dialog: action='OK button pressed'");
        super.mediator.notify(this, EVENT_OK);
    }

    @Override
    public String toString() {
        String visible = super.getVisible() ? "is visible" : "is invisible";
        return "Dialog{" + visible + "}";
    }


}
