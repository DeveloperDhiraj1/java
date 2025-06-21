
import java.util.*;

public class Linked {

    static void linkedexample() {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        l.set(0, 20);
        l.set(1, 90);
        l.set(2, 111);
        System.out.print(l);
    }

    public static void main(String[] args) {
        linkedexample();
    }
}
