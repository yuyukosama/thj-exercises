package c10_holding;
import java.util.Stack;

public class Ex15 {
    public static void main(String[] args) {
        char[] s = "+U+n+c---+e+r+t---+a+i+n+t+y---+ -+r+u--+l+e+s---".toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '+') {
                stack.push(s[++i]);
            } else if (s[i] == '-') {
                System.out.print(stack.pop());
            }
        }

       //cnUtreytn ursel
    }
}
