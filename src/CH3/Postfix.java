package CH3;

public class Postfix {
    protected String str;
    protected MyStack stack;

    public Postfix(String str){
        this.str = str;
        this.stack = new MyStack(str.length());
    }

    public String getStr(){
        return str;
    }
    public void setStr(String str){
        this.str = str;
    }

    public int postfixEvaluation(){
        stack.cleanStack();
        for(int i = 0; i < str.length(); i++){
            char token = str.charAt(i);
            if(token == ' '){
                continue;
            }
            if(token >= 48 && token <= 57){
                stack.push(token - '0');
            }else{
                switch(token){
                    case '+':
                        stack.push(stack.pop()+ stack.pop());
                        break;
                    case '-':
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(b - a);
                        break;
                    case '*':
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case '/':
                        int c = stack.pop();
                        int d = stack.pop();
                        stack.push(d / c);
                        break;
                    case '^':
                        int e = stack.pop();
                        int f = stack.pop();
                        stack.push((int)Math.pow(f, e));
                        break;
                    default:
                        break;
                }
            }
        }
        return stack.pop();
    }

}
