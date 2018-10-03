package c5_access_control;

class Connection {
    private static int count = 0;
    private Connection() {
        System.out.println("Connection()");
    }

    static Connection makeConnection() {
        count++;
        return new Connection();
    }

    public static int howMany() {
        return count;
    }

    public String toString() {
        return "Connection: " + count;
    }
}

public class E08_ConnectionManager {
    static int howManyLeft = 3;
    static Connection[] ca = new Connection[3];
    static {
        for (int i = 0; i < 3; i++) {
            ca[i] = Connection.makeConnection();
        }
    }

    public static Connection getConnection() {
        if (howManyLeft > 0) {
            return ca[--howManyLeft];

        } else {
            System.out.println("No more connections!");
            return null;
        }
    }

    public static void main(String[] args) {
        E08_ConnectionManager cm = new E08_ConnectionManager();
        System.out.println(cm.howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
    }
}
