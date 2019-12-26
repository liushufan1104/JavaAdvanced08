package com.example.lib;
import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Bank cppBank = new Bank(Integer.parseInt(scanner.next()),Integer.parseInt(scanner.next()));
    }
}