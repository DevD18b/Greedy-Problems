import java.util.Stack;

public class removeKCharacter {

    public static String removeDigits(String str, int k) {
        // from here what i need to do is simplyyyy
        // add characters.
        Stack<Character> stack = new Stack<>();

        int index = 0;

        while (index < str.length()) {
            // if our string is 1432219.
            // we have k = 3 // so what can we do is very simple we iterate the string //
            // and we check the last character we insert
            // will help us to form a string which is smaller in megnitude.
            // so now what can we do is we use the template of monotonoic stack.

            while (!stack.isEmpty() && stack.peek() > str.charAt(index) && k > 0) {
                stack.pop();
                k--;
            }
            index++;
        }

        // for cases like 9999 we have to just remove k character.
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        // as stack follows LIFO DSA there we need to reverse our string.

        sb.reverse();
        if (sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();

    }

}
