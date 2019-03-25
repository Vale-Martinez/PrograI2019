package estructura;

public class StructureNode<X extends Comparable<X>> {

    private X element;
    private StructureNode<X> nextNode;

    public X getElement() {
        return element;
    }

    public void setElement(X element) {
        this.element = element;
    }

    public StructureNode<X> getNextNode() {
        return nextNode;
    }

    public void setNextNode(StructureNode<X> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "" + element;
    }

    public StructureNode(X element) {
        this.element = element;
    }

    public StructureNode(X element, StructureNode<X> nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }
    
}
