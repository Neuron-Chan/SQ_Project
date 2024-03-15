public class ListTest {
    public static void main(String[] args) {
        IntList myList = new IntList(10);
        myList.add(100);
        myList.add(50);
        myList.add(200);
        myList.add(25);
        System.out.println(myList);
        SortedIntList List = new SortedIntList(10);
        List.add(100);
        List.add(50);
        List.add(200);
        List.add(25);
        System.out.println(List);
    }
}