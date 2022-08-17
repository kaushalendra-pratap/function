package com.sunglowsys;

public class FunctionOverloding {
    //multiple function with the same name but deffrent parameter
    public static int sum(int a,int b) {
            return a+b;
        }
        public static int sum(int a,int b,int c){
        return a+b+c;
        }

    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(8,3,8));

    }
    }

