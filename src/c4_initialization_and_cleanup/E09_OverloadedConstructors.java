package c4_initialization_and_cleanup;

class Doc1 {
    Doc1(int i) {
        this("MD");
        int yearsTraining = i;
        System.out.println("New doc with " + i + " years of training");
    }

    Doc1(String s) {
        String degree = s;
        System.out.println("New doc with " + s + " degree");
    }

    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
    }

    void laryngoscopy() {
        System.out.println("use laryngoscope");
    }

}

public class E09_OverloadedConstructors {

    public static void main(String[] args) {
        new Doc1(8).intubate();
    }
}
