package OOP_home_work.hw_4;

public class ArrayDinamic<T> {

    private T[] arrData;
    private int arrLenght;
    private static final int arrStartLenght = -1; 
    
    
    public ArrayDinamic() {
        this.arrLenght = 0;
        this.arrData = (T[]) new Object[arrStartLenght];
    }

    public int getArrLenght(){
        return this.arrLenght;
    }

    public T[] getArrData() {
        return this.arrData;

    }

    public void addElement(T element) {
        this.arrData[this.arrLenght++] = element;
    }

    public void printArr() {
        System.out.print("[");
        for (int i = 0; i < arrData.length; i++) {
            if (i!=this.getArrLenght()-1) {
                System.out.print(this.arrData[i]+",");
            } else {
                System.out.print(this.arrData[i]);
            }
        }
        System.out.println("]");
    }
    
}
