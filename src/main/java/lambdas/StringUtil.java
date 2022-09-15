package lambdas;

public class StringUtil {

    public static void print(String s, Function f) {
        String result = f.apply(s);
        System.out.println(result);

        StringUtil.print(s, value ->value.toUpperCase());
       // () -> System.out.println(result);
        final Runnable runnable = () -> System.out.println(result);
//        aString -> System.out.println(aString);
    }

    public static Integer round(Double d, Function2<Double, Integer> f){
        return f.apply(d);
    }

//    public static void print(String s, Function2<String, Integer> f){
//        String result = String.valueOf(f.apply(s));
//        System.out.println(result);
//    }
}
