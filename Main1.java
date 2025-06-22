
class Engine {

    public void start() {
        System.out.println("engine is started");
    }
}

class Car {

    private Engine e;

    public Car(Engine engine) {
        this.e = engine;
    }

    public void startcar() {
        e.start();
    }
}

public class Main1 {

    public static void main(String[] args) {
        Engine e = new Engine();
        Car c = new Car(e);
        c.startcar();
    }
}
