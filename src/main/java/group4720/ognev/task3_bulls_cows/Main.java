package group4720.ognev.task3_bulls_cows;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Game game = new AbstractGame() {
            @Override
            List<String> generateCharList() {
                return null;
            }
        };

        ArrayList<Answer> gameHistory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        game.setGameStatus(GameStatus.NULL);

        while (!game.getGameStatus().equals(GameStatus.END)) {
            System.out.println("---ДОБРО ПОЖАЛОВАТЬ НА ИГРУ БЫКИ-КОРОВЫ!---");
            System.out.println("Вы можете сыграть:");
            System.out.println("    1. На цифрах");
            System.out.println("    2. На русских буквах");
            System.out.println("    3. На английских буквах");
            System.out.println("    0. Выход из игры");
            System.out.print("Введите 1 или 2 или 3 или 0.\n>>> Ваш выбор:  ");
            String choiceGame = scanner.nextLine();
            if (choiceGame.equals("0")) {
                game.setGameStatus(GameStatus.END);

            } else if (choiceGame.equals("1")) {
                game = new GameNumber();
            } else if (choiceGame.equals("2")) {
                game = new RuGame();
            } else if (choiceGame.equals("3")) {
                game = new EnGame();
            }


            while (!game.getGameStatus().equals(GameStatus.NULL) && !game.getGameStatus().equals(GameStatus.END)) {
                int sizeWord1 = 0;
                int maxTry1 = 0;
                System.out.print("Введите количество загадываемых символов.\nВаш выбор:  ");
                sizeWord1 = Integer.parseInt(scanner.nextLine());
                System.out.print("Введите количество угадываний.\n>>> Ваш выбор:  ");
                maxTry1 = Integer.parseInt(scanner.nextLine());
                game.start(sizeWord1, maxTry1);

                System.out.print("0. Желаете выти из игры? Наберите: 0\n" +
                        "1. Хотите начать игру с начала? Наберите: 1\n" +
                        "2. Хотите начать с количество загаданных символов? Наберите: 2\n" +
                        "3. Желаете продолжить? Наберите: 3\n" +
                        ">>> Ваш выбор:  ");
                String actionSelection = scanner.nextLine();
                if (actionSelection.equals("0")) {
                    game.setGameStatus(GameStatus.END);
                } else if (actionSelection.equals("1")) {
                    game.setGameStatus(GameStatus.NULL);
                } else if (actionSelection.equals("2")) {
                    game.setGameStatus(GameStatus.INIT);
                }


                while (!game.getGameStatus().equals(GameStatus.NULL)
                        && !game.getGameStatus().equals(GameStatus.END)
                        && !game.getGameStatus().equals(GameStatus.WINNER)
                        && !game.getGameStatus().equals(GameStatus.LOSE)
                        && !game.getGameStatus().equals(GameStatus.INIT)) {

                    System.out.print("Введите " + sizeWord1 + " символов: ");
                    String scannerWord = scanner.nextLine();
                    Answer answer = game.inputValue(scannerWord);
                    gameHistory.add(answer);
                    System.out.println("   Результат = " + answer);
                    maxTry1--;
                    if (game.getGameStatus().equals(GameStatus.WINNER)) {
                        System.out.println("<<< Поздравляю, вы победитель! >>>");
                    } else if (game.getGameStatus().equals(GameStatus.LOSE)) {
                        System.out.println(">>> К сожалению, вы проиграли <<<");
                    } else {
                        System.out.println("У Вас, еще " + maxTry1 + " попытки.");
                    }

                }

            }
        }

        System.out.println("Желаете посмотреть историю игры? Наберите: 5\n" +
                "Если нет? Наберите: любой другой символ");
        String numGameHistory = scanner.nextLine();
        if (numGameHistory.equals("5")) {
            for (int i = 0; i < gameHistory.size(); i++) {
                System.out.println("<>  " + i + ". " + gameHistory.get(i).toString());
            }
        }

        System.out.println("Жаль, что вы покидаете нас! Но возвращайтесь скорей!");


    }
}

