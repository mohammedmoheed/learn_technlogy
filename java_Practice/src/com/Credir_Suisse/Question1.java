package com.Credir_Suisse;

public class Question1 {
    public static int solution(int n)
    {
        int mid1 = n/3;
        int mid2 = n/3;
        if(1*mid1 + 2*mid2 == n)
            return mid1+mid2;
        mid1++;
        if(1*mid1 + 2*mid2 == n)
            return mid1+mid2;
        mid1--;
        mid2++;
        if(1*mid1 + 2*mid2 == n)
            return mid1+mid2;
        mid1++;


        return -1;

    }


    public static void main(String args[] ) throws Exception {
        System.out.println(solution(32));
    }


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n=Integer.parseInt(br.readLine());
//        int answer=solution(n);
//        System.out.println(answer);
//
//    }

}
