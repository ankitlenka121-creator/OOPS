class Interest {

    
    void simpleInterest(double principal, int time) {
        double rate = 5;
        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }

    
    void simpleInterest(int rate, int time) {
        double principal = 10000;
        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }
}

public class Simple {
    public static void main(String[] args) {

        Interest obj = new Interest();

        obj.simpleInterest(10000, 2);

        obj.simpleInterest(10, 2);
    }
}