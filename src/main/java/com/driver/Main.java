package com.driver;

public class Main {
    public static class Product{

        public  static int multiply(int x, int y) {return x*y;}
        public static  int multiply(int x, int y,int z) {return x*y*z;}
        public  static double multiply(double x, double y) {
            return x*y;
        }

        }

    public static void main(String[] args){
        Product p = new Product();
        p.multiply(3,5);
        p.multiply(3,2,6);
        p.multiply(3.2 ,4.5);

    }

}