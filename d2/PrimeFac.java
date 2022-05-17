package com.sanjay;

public class PrimeFac {
    public static void main(String[] args){
        int i= num();
        if(i>=2&&i<=100){
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    System.out.println(j);
                }
            }
        }
        else{
            System.out.println("Invalid Number");
        }
    }
    public static int num(){
        return 101;
    }
}
