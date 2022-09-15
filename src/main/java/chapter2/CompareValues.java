package chapter2;

import java.util.ArrayList;
import java.util.List;

public class CompareValues {
    public static void main(String[] args) {
        int x = 0;
        while (x++ < 10){}
//        String message = x > 10 ? "" :false;

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(14);
        for (int  x1 : list){
            System.out.print(x1 + ",");
            break;
        }


        int x2 = 5;
        System.out.println(1 > 2 ? 5 < 4 ? 10 : 8 : 7);
    }
}
