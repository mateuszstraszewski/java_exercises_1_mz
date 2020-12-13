package onlineEx;

public class Main {
    public static void main(String[] args) {
        Ex2 myList = new Ex2();
        myList.addElemList(2,3,4,5,6);
        System.out.println(myList.listLength());
        myList.addElemList(7,8);
        System.out.println(myList.listLength());
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
        myList.printList();

    }
}
