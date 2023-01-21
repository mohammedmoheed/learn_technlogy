package com.funcions;
import java.util.*;
public class variable_length_arg {
    public static void main(String[] args) {
        fun("mohammed","moheed",3,4,5);
    }

    static void fun(String a, String b, int ...v) {
        System.out.println(a+b+ Arrays.toString(v));
    }
}
