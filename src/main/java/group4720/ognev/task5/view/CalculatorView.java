package group4720.ognev.task5.view;

import group4720.ognev.task5.data.ComplexNumber;
import group4720.ognev.task5.data.RationalNumber;

import java.util.Scanner;

public class CalculatorView {

    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu(){
        System.out.println("--- Меню Калькулятора ---");
        System.out.println("   1. Рациональные числа");
        System.out.println("   2. Комплексные числа");
        System.out.println("   0. Выход");
        System.out.println();
        System.out.print(">>> Ваш выбор: ");
    }

    public int getMenuChoice() {
        return scanner.nextInt();
    }

    public void displayRationalMenu(){
        System.out.println("--- Меню Рациональные Числа ---");
        System.out.println("   1. Сложение");
        System.out.println("   2. Вычитание");
        System.out.println("   0. Вернуться в главное меню");
        System.out.println();
        System.out.print(">>> Ваш выбор: ");

    }

    public void displayComplexMenu(){
        System.out.println("--- Меню Комплексные Числа ---");
        System.out.println("   1. Сложение");
        System.out.println("   2. Вычитание");
        System.out.println("   0. Вернуться в главное меню");
        System.out.println();
        System.out.print(">>> Ваш выбор: ");

    }

    public RationalNumber enterRationalNumber(String numberNumber){
        System.out.println(numberNumber);
        System.out.print("Введите числитель числа: ");
        int numerator = scanner.nextInt();
        System.out.println();
        System.out.print("Введите знаменатель числа: ");
        int denominator = scanner.nextInt();
        return new RationalNumber(numerator, denominator);
    }


    public ComplexNumber enterComplexNumber(String numberNumber){
        System.out.println(numberNumber);
        System.out.print("Введите действительную часть: ");
        double real = scanner.nextInt();
        System.out.println();
        System.out.print("Введите мнимую часть: ");
        double imaginary = scanner.nextInt();
        return new ComplexNumber(real, imaginary);
    }


    public void displayExitMessage() {
        System.out.println("Выход...");
    }

}
