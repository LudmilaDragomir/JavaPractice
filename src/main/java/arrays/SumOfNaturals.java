public class SumOfNaturals {

    public static void main(String[] args) {
        System.out.println(sumOfNaturals(44721));
    }

    static int sumOfNaturals(int n) {

//        int MOD = 1_000_000_007;
//        long sum = (((long) n * (n + 1)) / 2)%MOD; // Computing (n * (n + 1)) / 2 using long
//        return (int) sum; // Return the result modulo MOD as an integer

        int sum = 0;
        int M = 1_000_000_007;
        //Formula for Sum of Natural Numbers:1n = [n(n+1)]/2, in which n is a natural number.
        return  (int)(((long) (n % M) * ((n + 1) % M) /2) % M);
      //  for(int i = n; i>=0; i--){
      //  for(int i = 0; i<=n; i++){
      //      System.out.println(sum + " --- " + i);
       //     sum+=i;
      //  }

        //return sum%M;
    }

}
