package lambdas;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FunctionalInterface {
    // contains an abstract method
    // may contain static and default methods
//    String apply(String value);
}
