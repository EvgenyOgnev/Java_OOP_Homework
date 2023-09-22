package group4720.ognev.task5.controller;

import group4720.ognev.task5.data.ComplexNumber;
import group4720.ognev.task5.data.Logger;
import group4720.ognev.task5.data.RationalNumber;
import group4720.ognev.task5.view.CalculatorView;

public class CalculatorController {

    private CalculatorView view;

    private Logger logger;

    public CalculatorController() {
        view = new CalculatorView();
        logger = new Logger();
    }

    public void run() {

        boolean exit = false;

        while (!exit) {

            view.displayMenu();

            int choice = view.getMenuChoice();

            switch (choice) {
                case 1:
                    handleRationalNumbers();
                    break;
                case 2:
                    handleComplexNumbers();
                    break;
                case 0:
                    exit = true;
                    break;

                default:
                    System.out.println("Неверный выбор!");
                    break;
            }
        }
        view.displayExitMessage();
    }

    private void handleRationalNumbers() {
        boolean backToMenu = false;
        while (!backToMenu) {
            view.displayRationalMenu();
            int choice = view.getMenuChoice();
            switch (choice) {
                case 1:
                    handleRationalAddition();
                    break;
                case 2:
                    handleRationalSubtraction();
                    break;
                case 0:
                    backToMenu = true;
                    break;
                default:
                    System.out.println("Неверный выбор!");
                    break;
            }
        }
    }
    private void handleRationalAddition() {

        RationalNumber a = view.enterRationalNumber("Введите первое рациональное число: ");

        RationalNumber b = view.enterRationalNumber("Введите второе рациональное число: ");

        RationalNumber result = a.add(b);

        System.out.println(result.toString());

        logger.log("Сумма двух рациональных чисел: " + a + " and " + b + " Result: " + result.toString());

    }

    private void handleRationalSubtraction() {

        RationalNumber a = view.enterRationalNumber("Введите первое рациональное число: ");

        RationalNumber b = view.enterRationalNumber("Введите второе рациональное число: ");

        RationalNumber result = a.subtract(b);

        System.out.println(result.toString());

        logger.log("Разность двух рациональных чисел: " + a + " and " + b + " Result: " + result.toString());

    }


    private void handleComplexNumbers() {

        boolean backToMenu = false;
        while (!backToMenu) {
            view.displayComplexMenu();

            int choice = view.getMenuChoice();

            switch (choice) {
                case 1:
                    handleComplexAddition();
                    break;
                case 2:
                    handleComplexSubtraction();
                    break;
                case 0:
                    backToMenu = true;
                    break;
                default:
                    System.out.println("Неверный выбор!");
                    break;
            }
        }
    }

    private void handleComplexSubtraction() {
        ComplexNumber a = view.enterComplexNumber("Введите первое комплексное число: ");

        ComplexNumber b = view.enterComplexNumber("Введите второе комплексное число: ");

        ComplexNumber result = a.subtract(b);

        System.out.println(result.toString());

        logger.log("Разность двух комплексных чисел: " + a + " and " + b + " Result: " + result.toString());

    }

    private void handleComplexAddition() {
        ComplexNumber a = view.enterComplexNumber("Введите первое комплексное число: ");

        ComplexNumber b = view.enterComplexNumber("Введите второе комплексное число: ");

        ComplexNumber result = a.add(b);

        System.out.println(result.toString());

        logger.log("Сумма двух комплексных чисел: " + a + " and " + b + " Result: " + result.toString());

    }

}
