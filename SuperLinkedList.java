import java.util.LinkedList;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {
    public boolean removeVowels() {
        boolean removed = false;
        Iterator<String> it = this.iterator();
        while (it.hasNext()) {
            String ch = it.next();
            if (isVowel(ch)) {
                it.remove();
                removed = true;
            }
        }
        return removed;
    }

    private boolean isVowel(String s) {
        if (s == null || s.isEmpty()) return false;
        char c = s.charAt(0);
        return "aeiouAEIOU".indexOf(c) >= 0;
    }

    public boolean removeConsonants() {
           Iterator<String> it = this.iterator();
           
           while (it.hasNext()) {
            String ch = it.next();
            if(!iVowel(ch)) {
               it.remove();
               removed = true;
            }
           }

        return false;
    }

    public LinkedList<String> removeDuplicates() {
    
    LinkedList<String> removedList = new LinkedList<>();

    for (int i = 0; i < this.size(); i++) {
         String current = this.get(i);
         
        Iterator<String> it = this.listIterator(i+1);
        while (it.hasNext()) {
        String value = it.next();

        if (value.equals(current)) {
            removedList.add(value);
            it.remove();
        }
        }
    }
    
        return null;
    }

    public LinkedList<String> concatenateStrings() {

    LinkedList<String> result = new LinkedList<>();
    Iterator <String> it = this.iterator();
    String running = "";

    while(it.hasNext()) {
    running += it.next();  
    result.add(running);
    }

        return null;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {

    LinkedList<String> mixed = new LinkedList<>();


        Iterator<String> it1 = this.iterator();
        Iterator<String> it2 = list2.iterator();


        while (it1.hasNext() && it2.hasNext()) {
            mixed.add(it1.next());
            mixed.add(it2.next());
        }

        return null;
    }

    public String toString() {

    Iterator<String> it = this.iterator();
    String result = "";

    while (it.hasNext()) {
    String ch = it.next();
    
    if (it.hasNext()) {
    result += ch + ", ";
   }
    else {
            result += ch;
            }
        }

        return result;
    }
} // end SuperLinkedList