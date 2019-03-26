/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

/**
 *
 * @author valem
 * @param <X>
 */
public class DoublyLinkedList<X extends Comparable<X>> implements StructureBehavior<X> {

    //se crea la clase nodo especial para la double linked list
    private class DoubleLinkedNode<X> {

        private X element;
        private DoubleLinkedNode<X> prev, next;

        //se crean los getters and setters
        public X getElement() {
            return element;
        }

        public void setElement(X element) {
            this.element = element;
        }

        public DoubleLinkedNode<X> getPrev() {
            return prev;
        }

        public void setPrev(DoubleLinkedNode<X> prev) {
            this.prev = prev;
        }

        public DoubleLinkedNode<X> getNext() {
            return next;
        }

        public void setNext(DoubleLinkedNode<X> next) {
            this.next = next;
        }

        //se crea el constructor
        public DoubleLinkedNode(X element) {
            this.element = element;
        }

        @Override
        public String toString() {
            return "element=" + element;
        }
    }

    //Crea los atributos
    private DoubleLinkedNode<X> head, tail;
    private int size;

    public DoubleLinkedNode<X> getHead() {
        return head;
    }

    public void setHead(DoubleLinkedNode<X> head) {
        this.head = head;
    }

    public DoubleLinkedNode<X> getTail() {
        return tail;
    }

    public void setTail(DoubleLinkedNode<X> tail) {
        this.tail = tail;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void create(X element) {
        if (isEmpty()) {
            head = new DoubleLinkedNode(element);
            tail = head;
            size++;
        } else {
            tail.setNext(new DoubleLinkedNode(element));
            tail.getNext().setPrev(tail);
            tail = tail.getNext();
            size++;
        }
    }
    //permite eliminar el primer nodo de la lista

    private void DeleteFrist() {
        DoubleLinkedNode<X> temp = head;
        head = head.getNext();
        temp.setNext(null);
        head.setPrev(null);
        size--;
    }

    //permite eliminar el ultimo nodo de la lista 
    private void DeleteFinal() {
        DoubleLinkedNode<X> temp = tail;
        tail = tail.getPrev();
        temp.setPrev(null);
        tail.setNext(null);
        size--;
    }

    //elimina un solo nodo
    private void DeleteOnly1(X element) {
        if (head.getElement().equals(element)) {
            head = null;
            tail = head;
            size--;
        }
    }

    //permite elimar un elemnto de una lista de size 2
    private void DeleteOnly2(X element) {
        if (head.getElement().equals(element)) {
            DeleteFrist();
        } else if (tail.getElement().equals(element)) {
            DeleteFinal();
        }
        size--;
    }

    //permite eliminar los elementos en cualquier parte de la lista
    private void DeleteWherever(X element) {
        DoubleLinkedNode<X> temp, tempNext, tempPrev;
        temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(element)) {
                tempPrev = temp.getPrev();
                tempNext = temp.getNext();
                tempNext.setPrev(tempPrev);
                tempPrev.setNext(tempNext);
                temp.setNext(null);
                temp.setPrev(null);
                break;
            } else {
                temp = temp.getNext();
            }
        }
        size--;
    }

    //elimina cualquier nodo,dependiendo del size
    public void Delete(X element) {
        if (!isEmpty()) {
            if (tail.getElement().equals(element)) {
                DeleteFinal();
            } else if (head.getElement().equals(element)) {
                DeleteFrist();
            } else if (size == 1) {
                DeleteOnly1(element);
            } else if (size == 2) {
                DeleteOnly2(element);
            } else if (size >= 3) {
                DeleteWherever(element);
            }
        }
    }

    @Override
    public void clear() {
        this.head = this.tail = null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    //permite consultar el elemnto del nodo consultado 
    public X consult(X element) {
        DoubleLinkedNode<X> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement() == element) {
                break;
            } else {
                temp = temp.getNext();
            }
        }
        return temp.getElement();
    }

    //actualiza los elementos de los nodos
    public void update(X initialElem, X replacedElem) {
        DoubleLinkedNode<X> temp, replacedNode, tempPrev, tempNext;
        temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(initialElem)) {
                tempPrev = temp.getPrev();
                tempNext = temp.getNext();

                replacedNode = new DoubleLinkedNode<>(replacedElem);
                tempPrev.setNext(replacedNode);
                tempNext.setPrev(replacedNode);
                replacedNode.setPrev(tempPrev);
                replacedNode.setNext(tempNext);

                temp.setPrev(null);
                temp.setNext(null);
                break;
            } else {
                temp = temp.getNext();
            }
        }
    }

    //permite conocer los elementos del nodo desde el primero hasta el ultimo
    @Override
    public String toString() {
        String msg = "";
        DoubleLinkedNode<X> temp = head;
        for (int i = 0; i < size; i++) {
            msg += temp.toString() + "\n";
            temp = temp.getNext();
        }
        return msg;
    }

    //ESTOS METODOS NO SE USAN, YA QUE NO CUMPLEN CON LAS CARACTERISTICAS, CON LAS QUE SABEMOSHACER CIERTAS ESTRUCTURAS 
    @Override
    public X consult(int position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
