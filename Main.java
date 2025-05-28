
class Animal {

    public void animalsound() {
        System.out.println("animal sound");
    }
}

class dog extends Animal {

    public void animalsound() {
        System.out.println("dog sound bow wow");
    }
}

class cat extends Animal {

    public void animalsound() {
        System.out.println("cat sound maw maw");
    }
}

public class Main {

    public static void main(String[] args) {
        Animal myanimal = new Animal();
        Animal mydog = new dog();
        Animal mycat = new cat();
        myanimal.animalsound();
        mydog.animalsound();
        mycat.animalsound();
    }
}
