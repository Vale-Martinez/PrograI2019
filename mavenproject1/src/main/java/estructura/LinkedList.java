package estructura;

/**
 *
 * @author valem
 * @param <X>
 */
public class LinkedList<X extends Comparable<X>> implements StructureBehavior<X> {

    private StructureNode<X> head, tail;
    private int size;

    public StructureNode<X> getHead() {
        return head;
    }

    public void setHead(StructureNode<X> head) {
        this.head = head;
    }

    public StructureNode<X> getTail() {
        return tail;
    }

    public void setTail(StructureNode<X> tail) {
        this.tail = tail;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void create(X element) {
        if (isEmpty()) {
            head = new StructureNode<>(element);
            tail = head;
            size++;
        } else {
            tail.setNextNode(new StructureNode<>(element));
            tail = tail.getNextNode();
            size++;
        }
    }

    private void DeleteWherever(X element) {
        StructureNode<X> tempNode, tempPrevios, tempNext;
        tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.getNextNode().getElement().equals(element)) {
                tempPrevios = tempNode;
                tempNode = tempNode.getNextNode();
                tempNext = tempNode.getNextNode();
                tempPrevios.setNextNode(tempNext);
                tempNode.setNextNode(null);
            } else {
                tempNode = tempNode.getNextNode();
            }
        }
        size--;
    }

    public void Delete(X element) {
        if (!isEmpty()) {
            if (tail.getElement().equals(element)) {
                StructureNode<X> temp = head;
                for (int i = 0; i < size; i++) {
                    if (temp.getNextNode() == tail) {
                        tail = temp;
                        tail.setNextNode(null);
                    } else {
                        temp.getNextNode();
                    }
                }
                size--;
            } else if (head.getElement().equals(element)) {
                StructureNode temp = head;
                head = head.getNextNode();
                temp.setNextNode(null);
                size--;
            } else if (size == 1) {
                head = null;
                tail = head;
                size--;
            } else if (size >= 2) {
                DeleteWherever(element);
            }
        }
    }

    @Override
    public void clear() {
        this.head = this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    public X consult(X elemento) {
        StructureNode<X> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(elemento)) {
                break;
            } else {
                temp = temp.getNextNode();
            }
        }
        return temp.getElement();
    }

    @Override
    public String toString() {
        String message = "";
        StructureNode<X> temp = head;
        for (int i = 0; i < size; i++) {
            message += temp.toString();
            temp = temp.getNextNode();
        }
        return message;
    }
//estos metodos no se usan con esas caracteristicas en especifico, al ser utilizadas con una interface, no se usan las mismas caracterisiticas en todas
    @Override
    public X consult(int position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
