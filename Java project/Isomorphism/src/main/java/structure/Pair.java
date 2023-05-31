package structure;

public class Pair<Left, Right> {
    private Left node1;
    private Right node2;

    public Pair(Left node1, Right node2) {
        this.node1 = node1;
        this.node2 = node2;
    }

    public Left getNode1() {
        return node1;
    }

    public void setNode1(Left node1) {
        this.node1 = node1;
    }

    public Right getNode2() {
        return node2;
    }

    public void setNode2(Right node2) {
        this.node2 = node2;
    }
}
