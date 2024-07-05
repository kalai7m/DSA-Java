package Stack;

import java.util.Stack;

public class MonotonicStack {
    public static void main(String[] args) {
        int arr[]=new int[]{3,2,8,7,9,17,12};
        Stack<Integer> s=new Stack<>();
        int op[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]>arr[s.peek()]){
                op[s.peek()] = arr[i];
                s.pop();
            }
            s.push(i);
        }
        while(!s.isEmpty()) {
            op[s.peek()] = -1;
            s.pop();
        }
        for(int a: op){
            System.out.print(a+", ");
        }
    }
}
