package structural.flyweight;

public record Tree(int x, int y, TreeType type) {

    public void draw() {
        type.draw(x, y);
    }
}
