package Stack;

import java.util.Stack;

public class CircularMonotonic {

    public static void main(String[] args) {
        int arr[]=new int[]{1,3,2,1,9,5};
        Stack<Integer> s=new Stack<>();
        int op[]=new int[arr.length];
        int j=-1;
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]>arr[s.peek()]){
                op[s.peek()] = arr[i];
                s.pop();
            }
            if(!s.isEmpty() && j==-1) j=i;
            s.push(i);
        }

        if(!s.isEmpty()) {
            int max=s.peek();
            for ( int i=0;i<=j;i++) {
                if(arr[i]>arr[s.peek()]){
                    max=arr[i];
                    op[s.peek()]=arr[i];
                    s.pop();
                }
            }
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
