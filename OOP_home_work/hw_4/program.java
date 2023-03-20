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
        newList.addElement(12);
        newList.printArr();
        newList.removeIndexData(2);
        newList.removeByValueArr(22);
        System.out.println("Мин = " + newList.searchMin());
        System.out.println("Макс = " + newList.searchMax());
        System.out.println("сумма = " +newList.sumElemArr());
        System.out.println("произведение = " +newList.multiElemArr());
        System.out.println("поисмк индекса = " + newList.searchByIndex(7));
        System.out.println("проаверка элемента = " + newList.checkInElem(77));


        ArrayDinamic<String> newListSt = new ArrayDinamic<>();
        newListSt.addElement("раз");
        newListSt.addElement("два");
        newListSt.addElement("три");
        newListSt.printArr();
    }
    
}
