package CH3;
import java.util.*;

public class Infix {
    protected String str;
    protected MyStack stack;
    protected HashMap<Character, Integer> inStackTable = new HashMap<Character, Integer>();
    protected HashMap<Character, Integer> outStackTable = new HashMap<Character, Integer>();

    public Infix(String str) {
        this.str = str;
        this.stack = new MyStack(str.length());

        inStackTable.put('^', 10);
        inStackTable.put('*', 9);
        inStackTable.put('/', 9);
        inStackTable.put('+', 8);
        inStackTable.put('-', 8);
        inStackTable.put('(', 0);
        outStackTable.put('^', 11);
        outStackTable.put('*', 9);
        outStackTable.put('/', 9);
        outStackTable.put('+', 8);
        outStackTable.put('-', 8);

    }

    public String getStr(){
        return str;
    }
    public void setStr(String str){
        this.str = str;
    }

    public String getPostFix(){
        stack.cleanStack();
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            char token = str.charAt(i);
            if(token == ' '){
                continue;
            }
            if((token >= 65 && token <= 90) || (token >= 97 && token <= 122) || (token >= 48 && token <= 57)){
                ans += token;
            }
            else if(stack.isEmpty() || token == '('){
                stack.push((int)token);
            }
            else if(token == ')'){
                char y = (char)stack.pop();
                while(y != '('){
                    ans += y;
                    y = (char)stack.pop();
                }
            }
            else{
                while(!stack.isEmpty() && outStackTable.get(token) <= inStackTable.get((char)(stack.peek()))){
                    ans += (char)stack.pop();
                }
                stack.push((char)(token));
            }
        }
        while(!(stack.isEmpty())){
            ans += (char)stack.pop();
        }
        return ans;
    }
}
