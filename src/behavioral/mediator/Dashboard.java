package behavioral.mediator;

public class Dashboard extends Component {

    public Dashboard(Mediator mediator) {
        super(mediator);
    }

    @Override
    public String toString() {
        String visible = super.getVisible() ? "is visible" : "is invisible";
        return "Dashboard{" + visible + "}";
    }
}
