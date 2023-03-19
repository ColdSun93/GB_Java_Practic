package OOP_home_work.hw_4;

public class ArrayDinamic<T> {

    private T[] arrData;
    private int arrLenght;
    private static final int arrStartLenght = -1;

    public ArrayDinamic() {
        this.arrLenght = 0;
        this.arrData = (T[]) new Object[arrStartLenght];
    }

    public int getArrLenght() {
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
            if (i != this.getArrLenght() - 1) {
                System.out.print(this.arrData[i] + ",");
            } else {
                System.out.print(this.arrData[i]);
            }
        }
        System.out.println("]");
    }

    public void removeIndexData(int id) {
        if (id < 0 || id > this.getArrLenght()) {
            System.out.printf("");
        } else {
            int newLenght = this.getArrLenght() - 1;
            T[] newArrData = (T[]) new Object[newLenght];
            int i = 0;
            while (i < id) {
                newArrData[i] = this.arrData[i];
                i++;
            }
            i++;
            while (i < this.getArrLenght()) {
                newArrData[i - 1] = this.arrData[i];
                i++;
            }
            this.arrData = newArrData;
            this.arrLenght--;
        }
    }

    public void removeByValueArr(T element) {
        for (int i = 0; i < arrData.length; i++) {
            if (arrData[i] == element) {
                removeIndexData(i);
                i--;
            }
        }
    }

    public int searchMin() {
        int minElem = (int) this.arrData[0];
        for (int i = 0; i < arrData.length; i++) {
            if (minElem > (int) this.arrData[i]) {
                minElem = (int) this.arrData[i];

            }
        }
        return minElem;
    }

    public int searchMax() {
        int maxElem = (int) this.arrData[0];
        for (int i = 0; i < arrData.length; i++) {
            if (maxElem < (int) this.arrData[i]) {
                maxElem = (int) this.arrData[i];
            }
        }
        return maxElem;
    }

    public int sumElemArr() {
        int result = 0;
        for (int i = 0; i < arrData.length; i++) {
            result += (int) this.arrData[i];
        }
        return result;
    }

    public int multiElemArr() {
        int result = 1;
        for (int i = 0; i < arrData.length; i++) {
            result *= (int) this.arrData[i];
        }
        return result;
    }

    public int searchByIndex(T element) {
        int id = 0;
        for (T t : arrData) {
            if (t == element) {
                return id;
            }
            id++;
        } 
        return -1;
    }

    public boolean checkInElem(T element) {
        for (T t : arrData) {
            if (t == element) {
                return true;
            }  
        } 
        return false;
    }



}
