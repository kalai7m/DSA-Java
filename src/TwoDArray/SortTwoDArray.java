package TwoDArray;

import java.util.*;

public class SortTwoDArray {
    public static void main(String[] args) {
//        int arr[][] = new int[][]{{5,7},{1,3},{9,10}};
//        int arr[][] = new int[][]{{5,7}};
//        int days = 10;
//        int c = 0;
//        int n = arr.length;
//        int arrOne[] = new int[]{4,1,2,3};
//        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));

        //1 2 3 4 5 1
//        List<List<Integer>> stud = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=0; i<n; i++){
//            int h = sc.nextInt();
//            int w = sc.nextInt();
//            List<Integer> e= Arrays.asList(h,w);
//            stud.add(e);
//        }
//        System.out.println(stud);
//        Collections.sort(stud, (a,b) -> b.get(1) != a.get(1) ? Integer.compare(a.get(1),b.get(1)) : Integer.compare(b.get(0),a.get(0)));
//        System.out.println(stud);

        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(1,2);
        mp.put(4,2);
        mp.put(2,2);
        for(Map.Entry<Integer, Integer> e : mp.entrySet()) {
            System.out.println(e.getKey()+" => "+e.getValue());
        }


    }
}
