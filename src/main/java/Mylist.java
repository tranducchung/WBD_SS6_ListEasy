import java.util.Arrays;

public class Mylist<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 5;
    private Object[] element;
    Mylist(){
        element = new Object[DEFAULT_CAPACITY];
    }
    public void add(E e){
        if(size == element.length){
            setCapa();
        }
        element[size] = e;
        size++;
    }
    public void setCapa(){
        int newSize  = element.length*2;
        element = Arrays.copyOf(element, newSize);
    }
    public E get(int i){
        if(i >= size || i< 0 ){
            throw new IndexOutOfBoundsException("Index: " + i + ",Size " + i );
        }
        return  (E) element[i];
    }
}
