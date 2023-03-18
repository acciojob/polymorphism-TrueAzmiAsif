package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y){
            return x*y;
        }
        public int product(int x, int y, int z){
            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }
    public static void main(String args[]){
        Product p=new Product();
        int a=p.product(5,7);
        int b=p.product(5,7,8);
        double c=p.product(5.5,6.5);
    }
}