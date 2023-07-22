interface Car {
    Integer wheels();
}

interface Tuktuk {
    Integer wheels();
}

class Bike implements Car, Tuktuk {
    public Integer wheels() {
        return 2;
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Bike honda = new Bike();
        System.out.println(honda.wheels());
    }
}
