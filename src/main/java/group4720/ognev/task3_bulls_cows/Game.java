package group4720.ognev.task3_bulls_cows;

public interface Game {

    void start(Integer sizeWord, Integer maxTry);

    Answer inputValue(String value);

    GameStatus getGameStatus();

    void setGameStatus(GameStatus gameStatus); // todo: delet ??? удалить если не понадобиться
}
