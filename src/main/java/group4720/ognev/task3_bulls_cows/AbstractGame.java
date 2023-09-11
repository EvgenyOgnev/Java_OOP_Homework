package group4720.ognev.task3_bulls_cows;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {

    Integer sizeWord;
    Integer maxTry;
    String word;
    GameStatus gameStatus = GameStatus.INIT;


    /**
     * @return слово для угадывания
     * @apiNote метод предзаполняет слово компьютера
     */
    public String generateWord() {
        List<String> alphabet = generateCharList();
        Random random = new Random();
        String result = "";
        for (int i = 0; i < sizeWord; i++) {
            int index = random.nextInt(alphabet.size());
            result = result.concat(alphabet.get(index));
            alphabet.remove(index);
        }
        return result;
    }

    abstract List<String> generateCharList();


    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        this.word = generateWord();
        gameStatus = GameStatus.START;
        System.out.println("подсказка: " + word);

    }

    @Override
    public Answer inputValue(String value) {
        maxTry--;
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == value.charAt(i)) {
                bulls++;
                cows++;
            } else {
                if (word.contains(Character.toString(value.charAt(i)))) cows++;
            }
        }
        if (word.length() == bulls) {
            gameStatus = GameStatus.WINNER;
        }
        if (maxTry == 0 && !gameStatus.equals(GameStatus.WINNER)) {
            gameStatus = GameStatus.LOSE;
        }

        return new Answer(value, bulls, cows);

    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }
}
