package estructura;

/**
 *
 * @author valem
 * @param <X>
 */
public class Stack<X extends Comparable<X>> implements StructureBehavior<X> {

    private StructureNode<X> top;
    private int size;

    public StructureNode<X> getTop() {
        return top;
    }

    public void setTop(StructureNode<X> top) {
        this.top = top;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
    public Stack() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public void create(X element) {
        this.top = new StructureNode<>(element, this.top);
        this.size++;
    }

    @Override
    public void remove() {
        if (this.top == null) {
            System.out.println("Stack is empty");
            System.out.println("null");
        }
        System.out.println(this.top.getElement());
    }

    @Override
    public void clear() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public X consult(int position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String result="";
        StructureNode<X> temp = top;
        while (temp != null) {
            result += temp.getElement() + "\n";
            temp = temp.getNextNode();
        }
        return result;
    }
    @Override
    public int compareTo(X t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
