package c4_initialization_and_cleanup;

class WebBank {
    boolean loggedIn = false;
    WebBank(boolean logStatus) {
        loggedIn = logStatus;
    }

    void logIn() {
        loggedIn = true;
    }

    void logOut() {
        loggedIn = false;
    }

    protected void finalize() {
        if (loggedIn)
            System.out.println("Error: still logged in");

    }


}


public class E10_TerminationConditionEx {

    public static void main(String[] args) {
        WebBank bank1 = new WebBank(true);
//        WebBank bank2 = new WebBank(true);
        //proper cleanup
        bank1.logOut();
        new WebBank(true);
        System.gc();
    }
}
