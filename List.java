
import java.util.ArrayList;

public class List {

    static void ArrayListExample() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);
        System.out.println(l.get(1));
        l.set(0, 10);
        l.set(1, 20);
        l.set(2, 30);
        l.set(3, 40);
        System.out.println(l);
    }

    public static void main(String[] args) {
        ArrayListExample();
    }
}
