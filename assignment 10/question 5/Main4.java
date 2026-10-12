
class A {
    void displayA() {
        System.out.println("Class A");
    }
}

class B extends A {
    void displayB() {
        System.out.println("Class B");
    }
}

class C extends B {
    void displayC() {
        System.out.println("Class C");
    }
}

class D extends B {
    void displayD() {
        System.out.println("Class D");
    }
}

public class Main4 {
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.displayA();
        obj1.displayB();
        obj1.displayC();

        D obj2 = new D();
        obj2.displayA();
        obj2.displayB();
        obj2.displayD();
    }
}
