package c5_access_control.cookie2;

public class CookieMonster {

    public static void main(String[] args) {
        Cookie cookie = new Cookie();
        cookie.bite(); // package access to protected method!
    }

}
