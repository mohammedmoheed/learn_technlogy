package com.Arrays;
// means all character should present in array
public class panagram {
    public static void main(String[] args) {
        String a = "moheed";
        System.out.println(checkIfPangram(a));
    }

    static boolean checkIfPangram(String a) {
        if(a.length()<26)return false;
        String alpha="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<alpha.length();i++)
            if(a.indexOf(alpha.charAt(i))==-1)return false;
        return true;
    }
}
