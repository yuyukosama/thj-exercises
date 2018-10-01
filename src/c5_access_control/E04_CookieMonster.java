package c5_access_control;
import c5_access_control.cookie2.Cookie;

public class E04_CookieMonster extends Cookie {

    public static void main(String[] args) {
        Cookie cookie = new Cookie();
//        cookie.bite(); access protected

        new E04_CookieMonster().bite();
    }

}
