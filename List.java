
import java.util.ArrayList;

public class List {

    static void ArrayListExample() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1));
        l.set(0, 10);
        System.out.println(l);
        System.out.println(l.contains(10));
    }

    public static void main(String[] args) {
        ArrayListExample();
    }
}
