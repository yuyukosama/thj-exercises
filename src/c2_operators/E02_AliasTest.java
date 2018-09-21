package c2_operators;

class Tank {
    //This is field;
    float amor;
}

public class E02_AliasTest {

    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();

        t1.amor = 99.9f;
        t2.amor = 89.3f;

        System.out.println("t1.amor : " + t1.amor + ", t2.amor" + t2.amor);

        t1 = t2;
        System.out.println("t1.amor : " + t1.amor + ", t2.amor" + t2.amor);

        t1.amor = 78.8f;
        System.out.println("t1.amor : " + t1.amor + ", t2.amor" + t2.amor);

    }
}
