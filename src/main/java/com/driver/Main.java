package com.driver;
import java.util.Scanner;
public class Main {
    public static class Product{

        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y,int z) {
            return x*y*z;
        }
        public  double product(double x, double y) {return x*y;}

        }

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        Product p = new Product();
        p.product(3,5);
        p.product(3,2,6);
        p.product(3.2 ,4.5);

    }

}