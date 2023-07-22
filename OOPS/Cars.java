
abstract class XUV {
    abstract void brands();

    Integer wheels() {
        return 4;
    }
}

class TATA extends XUV {
    public void brands() {
        System.out.println("TATA SAFARI");
    }

    Integer wheels() {
        return 4;
    }
}

class MAHINDRA extends XUV {
    public void brands() {
        System.out.println("MAHINDRA XUV700");
    }

    Integer wheels() {
        return 4;
    }
}

public class Cars {

    public static void main(String[] args) {
        MAHINDRA mH = new MAHINDRA();
        mH.brands();
        System.out.println(mH.wheels());
    }
}
