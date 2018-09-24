/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

/**
 *
 * @author marip
 */
public class QueueList<X> {
    Nodo<X> head, tail;
    int size;

    public Nodo<X> getHead() {
        return head;
    }

    public void setHead(Nodo<X> head) {
        this.head = head;
    }

    public Nodo<X> getTail() {
        return tail;
    }

    public void setTail(Nodo<X> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
    public boolean isEmpty() {
        return size == 0;
    }

    
    public void insert(X element) {
        if (isEmpty()) {
            head = new Nodo<>(element);
            tail = head;
            size++;
        } else {
            tail.setNodoSig(new Nodo<>(element));
            tail = tail.getNodoSig();
            size++;
        }
    }

    public X consult(X element) {
        Nodo<X> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElemento().equals(element)) {
                break;
            } else {
                temp = temp.getNodoSig();
            }
        }
        return temp.getElemento();
    }

    public void update(X initialElem, X replacedElem) {
        Nodo<X> temp, tempPrev, tempNext, tempNew;
        temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.getNodoSig().equals(initialElem)) {
                tempPrev = temp;
                temp = temp.getNodoSig();
                tempNext = temp.getNodoSig();
                tempNew = new Nodo<>(replacedElem);
                tempPrev.setNodoSig(tempNew);
                tempNew.setNodoSig(tempNext);
                temp.setElemento(null);
            } else {
                temp = temp.getNodoSig();
            }
        }
    }

    public void delete(X element) {
        Nodo<X> temp = head;
        head = head.getNodoSig();
        temp.setNodoSig(null);
        size--;
    }

    @Override
    public String toString() {
        String msg = "";
        Nodo<X> temp = head;
        for (int i = 0; i < size; i++) {
            msg += temp.toString();
            temp = temp.getNodoSig();
        }
        return msg;
    }
}
