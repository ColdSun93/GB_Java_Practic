package OOP_home_work.hw_4;

public class program {

    public static void main(String[] args) {
        ArrayDinamic<Integer> newList = new ArrayDinamic<>();
        newList.addElement(10);
        newList.addElement(15);
        newList.addElement(12);
        newList.addElement(16);
        newList.addElement(9);
        newList.addElement(22);
        newList.addElement(22);
        newList.addElement(22);
        newList.printArr();
        newList.removeIndexData(2);
        newList.removeByValueArr(22);
        newList.searchMin();
        newList.searchMax();
        newList.sumElemArr();
        newList.multiElemArr();
        newList.searchByIndex(7);
        newList.checkInElem(77);

    }
    
}
