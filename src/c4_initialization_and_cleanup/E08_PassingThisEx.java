package c4_initialization_and_cleanup;

class Doc {
    void intubate() {
        laryngoscopy();
        this.laryngoscopy();
    }

    void laryngoscopy() {
        System.out.println("use laryngoscopy");
    }
}

public class E08_PassingThisEx {
    public static void main(String[] args) {
        new Doc().intubate();
    }
}
