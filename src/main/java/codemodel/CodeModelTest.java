package codemodel;

import com.sun.codemodel.*;
import com.sun.codemodel.writer.SingleStreamCodeWriter;

import java.io.IOException;
import java.util.Arrays;

public class CodeModelTest {
    public static void main(String[] args) throws JClassAlreadyExistsException, IOException {

        //test(new String[] { "a", "b", "class"});
        JCodeModel codeModel = new JCodeModel();
        JPackage jpackage = codeModel._package("com.example");
        JDefinedClass jclass = jpackage._class("Example");

        JType genericType = codeModel.directClass("T");
        JMethod jmethod =
                jclass.method(JMod.PUBLIC | JMod.STATIC, genericType, "get");
        jmethod.generify("T", Number.class);
        JClass parameterType = codeModel.ref(Class.class).narrow(genericType);
        jmethod.param(parameterType, "type");

        jmethod.body()._return(JExpr.ref("null"));
        CodeWriter codeWriter = new SingleStreamCodeWriter(System.out);
        codeModel.build(codeWriter);
    }

    public static void test(String[] strings) {
        System.out.println(Arrays.toString(strings));
        }
}
