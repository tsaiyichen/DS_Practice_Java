package CH3;

public class ch3StackMain {
    public static void main(String[] args) {

        //Stack operation
        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        //infix postFix transformation
        Infix infix = new Infix("((A + B) * C - (D - E) ^ (F + G))");
        System.out.printf("infix: %s = postfix: %s\n", infix.getStr(), infix.getPostFix());
        infix.setStr("(a + b) / c * (d - e)");
        System.out.printf("infix: %s = postfix: %s\n", infix.getStr(), infix.getPostFix());
        infix.setStr("(a/(c * (b + d))) / (e - a) * c");
        System.out.printf("infix: %s = postfix: %s\n", infix.getStr(), infix.getPostFix());
        infix.setStr("9 - 1 * 2 - (6 + 2)");
        System.out.printf("infix: %s = postfix: %s\n", infix.getStr(), infix.getPostFix());

        //postfix evaluation
        Postfix postfix = new Postfix(infix.getPostFix());
        System.out.printf("postfix %s evaluation: %d\n", postfix.getStr(), postfix.postfixEvaluation());
        postfix.setStr("8 6 + 9 2 - / 5 * 7 +");
        System.out.printf("postfix %s evaluation: %d\n", postfix.getStr(), postfix.postfixEvaluation());
        postfix.setStr("4 3 - 5 6 3 / + *");
        System.out.printf("postfix %s evaluation: %d\n", postfix.getStr(), postfix.postfixEvaluation());

        //Compiler Parsing
        CheckParentheses parentheses = new CheckParentheses("((())");
        System.out.printf("%s is %b valid\n", parentheses.getStr(), parentheses.isValid(1));
        parentheses.setStr("((())))");
        System.out.printf("%s is %b valid\n", parentheses.getStr(), parentheses.isValid(1));
        parentheses.setStr("(())()(())");
        System.out.printf("%s is %b valid\n", parentheses.getStr(), parentheses.isValid(1));
        parentheses.setStr("(())()(()))");
        System.out.printf("%s is %b valid\n", parentheses.getStr(), parentheses.isValid(1));
        parentheses.setStr("(){}[]");
        System.out.printf("%s is %b valid\n", parentheses.getStr(), parentheses.isValid(2));
        parentheses.setStr("({[]}");
        System.out.printf("%s is %b valid\n", parentheses.getStr(), parentheses.isValid(2));
        parentheses.setStr("({)}");
        System.out.printf("%s is %b valid\n", parentheses.getStr(), parentheses.isValid(2));
        parentheses.setStr("([]}");
        System.out.printf("%s is %b valid\n", parentheses.getStr(), parentheses.isValid(2));
        System.out.printf("abcba is %b a palindrome.\n", isPalindrome("abcba"));
        System.out.printf("abba is %b a palindrome.\n", isPalindrome("abba"));
        System.out.printf("abccby is %b a palindrome.\n", isPalindrome("abccby"));
        System.out.printf("abcib is %b a palindrome.\n", isPalindrome("abcib"));

        //Shared Array for two Stack
        SharedStack array = new SharedStack(5);
        array.push(1, 1);
        array.push(1, 2);
        array.push(1, 3);
        array.push(2, 500);
        array.push(2, 600);
        array.push(2, 700);
        System.out.println(array.pop(1));
        System.out.println(array.pop(1));
        System.out.println(array.pop(2));
        array.push(2, 700);
        System.out.println(array.pop(1));
        System.out.println(array.pop(1));
        System.out.println(array.pop(2));
    }


    public static boolean isPalindrome(String s) {
        MyStack stack = new MyStack(s.length());
        for(int i = 0; i < s.length(); i++) {
            int n = s.length();
            if(i < (n / 2)){
                stack.push(s.charAt(i));
            }
            else if(n % 2 != 0 && i == (n / 2)){
                continue;
            }else{
                char x = s.charAt(i);
                char y = (char)stack.pop();
                if(x != y) return false;
            }
        }
        return true;
    }

}
