package behavioral.mediator;

public class Component {

    protected Mediator mediator;
    private Boolean visible;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
}
