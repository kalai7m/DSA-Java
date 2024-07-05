package Stack;

public class Stack {
    static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String op: operations){
            switch(op.charAt(0)) {
                case '+':
                    ++x;
                    break;
                case '-':
                    --x;
                    break;
            }
            switch(op.charAt(2)) {
                case '+':
                    x++;
                    break;
                case '-':
                    x--;
                    break;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"++X","--X"}));
    }
}
