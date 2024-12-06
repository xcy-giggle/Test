package main.java;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("加法结果: " + calculator.add(10, 5));
        System.out.println("减法结果: " + calculator.subtract(10, 5));
        System.out.println("乘法结果: " + calculator.multiply(10, 5));
        System.out.println("除法结果: " + calculator.divide(10, 5));
        System.out.println("加法结果: " + calculator.add(20, 5));
        System.out.println("再次修改");
    }
}

