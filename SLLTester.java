public class SLLTester {

    public static void main(String[] args) {

SuperLinkedList list1 = new SuperLinkedList();
SuperLinkedList list2 = new SuperLinkedList();
SuperLinkedList list3 = new SuperLinkedList();


list1.add("a");
list1.add("b");
list1.add("c");
list1.add("d");
list1.add("e");


list2.add("e");
list2.add("d");
list2.add("c");
list2.add("b");
list2.add("a");


list3.add("A");
list3.add("D");
list3.add("C");
list3.add("C");
list3.add("D");
list3.add("E");
list3.add("B");


System.out.println("This is list1:");
printList(list1);

System.out.println("\nThis is list2:");
printList(list2);

System.out.println("\nThis is list3:");
printList(list3);


LinkedList<String> retLists = list1.mix(list2);

System.out.println("\nThis is the calling list after the mix:");
System.out.println(list1);

System.out.println("This is the sent list after the mix:");
System.out.println(list2);

System.out.println("This is retLists, return value of the call to mix:");
printList(retLists);


LinkedList<String> removed = list3.removeDuplicates();

System.out.println("\nThis is list3 after the removeDuplicates:");
System.out.println(list3);

System.out.println("\nReturned from removeDuplicates:");
printList(removed);


boolean vowelsRemoved = list3.removeVowels();
System.out.println("\nRemoved Vowels: " + vowelsRemoved);

System.out.println("This is list3 after the removeVowels:");
System.out.println(list3);

boolean consonantsRemoved = list2.removeConsonants();
System.out.println("\nRemoved Consonants: " + consonantsRemoved);

System.out.println("This is list2 after the removeConsonants:");
System.out.println(list2);

LinkedList<String> concat = list3.concatenateStrings();

System.out.println("\nThis is list3 after the concatenateStrings:");
System.out.println(list3);

System.out.println("This is retLists, return value of the call to concatenateStrings:");
printList(concat);
}


public static void printList(LinkedList<String> list) {
Iterator<String> it = list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
} //end main
} //end class