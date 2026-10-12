class StaticD {

    static int count = 0;
    int rollNo;

    static {
        System.out.println("Static block executed");
    }

    StaticD(int r) {
        rollNo = r;
        count++;
    }

    static void display() {
        System.out.println("Number of objects: " + count);
    }

    static class Test {
        void show() {
            System.out.println("Static nested class");
        }
    }

    public static void main(String[] args) {

        StaticD s1 = new StaticD(101);
        StaticD s2 = new StaticD(102);
        StaticD s3 = new StaticD(103);

        StaticD.display();

        System.out.println("Static variable: " + StaticD.count);

        StaticD.Test t = new StaticD.Test();
        t.show();
    }
}