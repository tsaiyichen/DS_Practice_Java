package CH3;

public class CheckParentheses {
    protected String str;
    protected MyStack stack;

    public CheckParentheses(String str){
        this.str = str;
        stack = new MyStack(str.length());
    }

    public String getStr(){
        return str;
    }
    public void setStr(String str){
        this.str = str;
    }

    public boolean isValid(int c){
        if(c == 1){
            stack.cleanStack();
            for(int i = 0; i < str.length(); i++){
                char x = str.charAt(i);
                if(str.charAt(i) == '('){
                    stack.push((int)x);
                }else{
                    if(stack.isEmpty()){
                        return false;
                    }else{
                        stack.pop();
                    }
                }
            }
            return stack.isEmpty();
        }
        else{
            stack.cleanStack();
            for(int i = 0; i < str.length(); i++){
                char x = str.charAt(i);
                if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                    stack.push((int)x);
                }else{
                    if(stack.isEmpty()){
                        return false;
                    }else{
                        char y = (char)stack.pop();
                        if(!((y == '(' && x == ')') || (y == '{' && x == '}') || (y == '[' && x == ']'))){
                            return false;
                        }
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
