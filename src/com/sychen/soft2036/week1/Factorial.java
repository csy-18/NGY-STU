package com.sychen.soft2036.week1;

/**
 * @ClassName factorial
 * @Description TODO
 * @Author msi
 * @Date 2020/10/5
 **/
public class Factorial {
    public static void main(String[] args) {
        int n = 5 ;
        int result = 1;
        for ( int i = 1;i<=n;i++){
            result=result*i;

        }
        System.out.println(result);
    }

}
