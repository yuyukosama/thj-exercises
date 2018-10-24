package c8_interfaces;

interface Playable {
    void play(Note n); // Automatically public
}

public class E10_Music {
    static void tune(Playable p) {
        //...
        p.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e) {
        for(Playable p : e)
            tune(p);
    }
    public static void main(String[] args) {
//        // Upcasting during addition to the array:
//        Playable[] orchestra = {
//                new Wind(),
//                new Percussion(),
//                new Stringed(),
//                new Brass(),
//                new Woodwind()
//        };
//        tuneAll(orchestra);
    }
}
