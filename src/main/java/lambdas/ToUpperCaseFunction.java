package lambdas;

public class ToUpperCaseFunction implements Function {
    @Override
    public String apply(String value) {
        return value.toUpperCase();
    }

    public void displayText() {
        String aString = "Some Text";
        StringUtil.print(aString, new ToUpperCaseFunction());

        class ToUpperCaseFunction2 implements Function { //inner class for functions
            public String apply(String value) {
                return value.toUpperCase();
            }
        }
        StringUtil.print(aString, new ToUpperCaseFunction2());
    }
    public void displayText2() {
        String aString = "Some Text";
        StringUtil.print(aString,
                new Function() {
                    @Override
                    public String apply(String value) {
                        return value.toUpperCase();
                    }
                });
    }

    public void displayText3() {
        String aString = "Some Text";
        StringUtil.print(aString, value -> value.toUpperCase());
    }
}
