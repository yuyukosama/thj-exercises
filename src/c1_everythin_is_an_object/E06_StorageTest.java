package c1_everythin_is_an_object;

public class E06_StorageTest {
    public static void main(String[] args) {
        class StoreStuff {
            int storage(String s) {
                return s.length() * 2;
            }
        }

        StoreStuff s = new StoreStuff();
        System.out.println(s.storage("asd"));

    }
}
