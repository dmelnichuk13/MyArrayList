import java.util.ArrayList;

public class MyArrayList<T> {
    private Object[] elements;
    private int size;
    public MyArrayList(){
        elements = new Object[10];
        size = 0;
    }
    public MyArrayList(int capacity){
        elements = new Object[capacity < 10 ? 10 : capacity];
        size = 0;
    }
    public void add(T element){
        if (size >= elements.length){
            elements = addCapacity();
        }
        elements[size] = element;
        size++;
    }
    private Object[] addCapacity(){
        int newCapacity = (int) (elements.length * 1.5 + 1);
        Object[] newElements = new Object[newCapacity];
        for (int i = 0; i < elements.length; i++){
            newElements[i] = elements[i];
        }
        return newElements;
    }
    public T get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Индекс вне границ " + index);
        }
        return (T) elements[index];
    }
    public int size(){
        return size;
    }
    public void remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Индекс вне границ " + index);
        }
        Object[] deleteElement = new Object[elements.length];
        for (int i = 0; i < elements.length; i++){
             if(i < index){
                 deleteElement[i] = elements[i];
             } if (i > index){
                 deleteElement[i] = elements[i - 1];
            }
        }
        for (int i = 0; i <= deleteElement.length; i++){
            elements[i] = deleteElement[i];
        }
    }
}
