/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

/**
 *
 * @author raquelrojas
 */
public class Pila <T> {

    private Nodo<T> top;
    private int size;

    public Pila() {
        this.top = null;
        this.size = 0;
    }

    public void push(T element) {
        this.top = new Nodo<>(element, this.top);
        this.size++;
    }

    public T pop(){
        if (this.top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        T temp = this.top.getElemento();
        this.top = this.top.getNodoSig();
        this.size--;
        return temp;
    }

    public T top(){
        if (this.top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        return this.top.getElemento();
    }

    public int size(){
        return this.size;
    }

    public void clear(){
        this.top = null;
        this.size = 0;
    }

    public String toString(){
        String result = "**LStack**\n";
        Nodo<T>temp = top;
        while(temp != null){
            result+= temp.getElemento() + "\n";
            temp = temp.getNodoSig();
        }
        return result;
    }

    //public static void main(String[] args) {
        
    }

   
