package estructura;

public class PriorityQueue<X extends Comparable<X>> implements StructureBehavior<X> {

    StructureNode<X> head;
    StructureNode<X> tail;
    int size;

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

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void create(X element) {
        if (isEmpty()) {
            head = new StructureNode<>(element);
            tail = head;
        } else {
            StructureNode<X> newEle = new StructureNode<>(element);
            StructureNode<X> temp = head;
            if (size == 1) {
                if (newEle.getElement().compareTo(head.getElement()) < 0) {
                    newEle.setNextNode(head);
                    head = newEle;
                } else {
                    head.setNextNode(newEle);
                    tail = tail.getNextNode();
                }
            } else {
                while (temp.getNextNode() != tail) {
                    if (newEle.getElement().compareTo(temp.getNextNode().getElement()) < 0) {
                        if (temp == head) {
                            newEle.setNextNode(head);
                            head = newEle;
                            break;
                        } else {
                            newEle.setNextNode(temp.getNextNode());
                            temp.setNextNode(newEle);
                            break;
                        }
                    } else {
                        temp = temp.getNextNode();
                    }
                }
                if (temp.getNextNode() == tail) {
                    if (newEle.getElement().compareTo(tail.getElement()) < 0) {
                        newEle.setNextNode(tail);
                        temp.setNextNode(newEle);
                    } else {
                        tail.setNextNode(newEle);
                        tail = tail.getNextNode();
                    }
                }
            }
        }
        size++;
    }

    public X consult(X element) {
        StructureNode<X> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(element)) {
                break;
            } else {
                temp = temp.getNextNode();
            }
        }
        return temp.getElement();
    }

    public void update(X initialElem, X replacedElem) {
        StructureNode<X> temp;
        StructureNode<X> tempPrev, tempNext, tempNew;
        temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.getNextNode().equals(initialElem)) {
                tempPrev = temp;
                temp = temp.getNextNode();
                tempNext = temp.getNextNode();
                tempNew = new StructureNode<>(replacedElem);
                tempPrev.setNextNode(tempNew);
                tempNew.setNextNode(tempNext);
                temp.setElement(null);
            } else {
                temp = temp.getNextNode();
            }
        }
    }

    @Override
    public void remove() {
        if (isEmpty()) {
            System.out.println("");
        } else {
            StructureNode<X> temp = head;
            head = head.getNextNode();
            temp.setNextNode(null);
            size--;
        }
    }

    @Override
    public String toString() {
        String msg = "";
        StructureNode<X> temp = head;
        for (int i = 0; i < size; i++) {
            msg = msg + temp.toString() + "\n";
            temp = temp.getNextNode();
        }
        return msg;
    }

    @Override
    public X consult(int position) {
        StructureNode<X> temp = head;
        if (position > this.getSize()) {
            return null;
        } else {
            for (int i = 0; i < position; i++) {
                temp = temp.getNextNode();
            }
        }
        return temp.getElement();
    }

    @Override
    public void clear() {
        this.head = this.tail = null;
    }

}
