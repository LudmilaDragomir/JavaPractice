package com.reader;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world from IntelliJ");
        File x = new File("myFile.txt");
        File y = new File("myFile.txt");

        System.out.println(x == y);
        System.out.println(x.equals(y));
        // comment
    }
}
