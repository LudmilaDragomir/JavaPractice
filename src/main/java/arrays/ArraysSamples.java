import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysSamples {
    int noOfTestCases;

    List<Integer> getPositiveCumulativeSum (int[] arr) {
        List<Integer> cumulative = new ArrayList<>();
        for (int i =0; i<arr.length; i++){
            int prefix = 0;
            for(int j = 0; j <= i; j++) {
                prefix += arr[j];
            }
            if (prefix >0)
                cumulative.add(prefix);
        }
        return cumulative;
    }

    int[] getCumulativeSum (int[] arr) {
        int [] cumulative = new int[arr.length];
        for (int i =0; i<arr.length; i++){
            if(i>0){
                cumulative[i] = cumulative[i-1] + arr[i];
            }else {
                cumulative[i] = arr[i];
            }
        }
        return cumulative;
    }
    public static void main(String[] args) {
//        int[] myIntArray1 = new int[4];
        HashMap intArrays = new HashMap<>();
        List arrays = new ArrayList<int[]>();

        int[] myIntArray2 = new int[]{1, -2, 3, 4, -6};
        int[] myIntArray3 = new int[]{1, -1, -1, -1, 1};
        int[] myIntArray4 = new int[]{1, 3, 5, 7};
        arrays.add(myIntArray2);
        arrays.add(myIntArray3);
        arrays.add(myIntArray4);
        int[][] arrays2 = new int[][] { myIntArray2, myIntArray3, myIntArray4 }; // array of arrays
//        int[] myIntArray3 = {4, 6, 9};
//        int[][] num = new int[5][2];
//        num[0][0] = 5;
//        System.out.println();
//        int [] myIntArray4 = IntStream.range(0, 100).toArray(); // From 0 to 99
//        int [] myIntArray5 = IntStream.rangeClosed(0, 100).toArray(); // From 0 to 100
//        int [] myIntArray6 = IntStream.of(12,25,36,85,28,96,47).toArray(); // The order is preserved.
//        int [] myIntArray7 = IntStream.of(12,25,36,85,28,96,47).sorted().toArray(); // Sort
        //int [] cumulative = new int[4];

        ArraysSamples arrClass  = new ArraysSamples();

        for (int[] arr: arrays2){
            System.out.println(IntStream.of(arrClass.getCumulativeSum(arr)).mapToObj(Integer::toString)
                .collect(Collectors.joining(" ")));
            System.out.println(arrClass.getPositiveCumulativeSum(arr).toString());
        }
//        System.out.println(IntStream.of(cumulative).mapToObj(Integer::toString)
//                .collect(Collectors.joining(" ")));
    }
}


