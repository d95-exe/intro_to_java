class car {
    void intro() {
        System.out.println("I am a car");
    }
}
class Nissan extends car {
    void intro() {
        super.intro();
        System.out.println("I am a Nissan!");
    }
}

public class inheritance_demo {
    public static void main(String[] args) {
        Nissan myCar = new Nissan();
        myCar.intro();
    }
}
