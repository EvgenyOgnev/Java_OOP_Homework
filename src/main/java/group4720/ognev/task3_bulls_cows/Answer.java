package group4720.ognev.task3_bulls_cows;

public class Answer {

    private String userInput;
    private Integer bull;
    private Integer cow;

    public Answer(String userInput, Integer bull, Integer cow) {
        this.userInput = userInput;
        this.bull = bull;
        this.cow = cow;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public Integer getBull() {
        return bull;
    }

    public void setBull(Integer bull) {
        this.bull = bull;
    }

    public Integer getCow() {
        return cow;
    }

    public void setCow(Integer cow) {
        this.cow = cow;
    }

    @Override
    public String toString() {
        return "{" +
                "Введенные символы='" + userInput + '\'' +
                ", Быки=" + bull +
                ", Коровы=" + cow +
                '}';
    }
}
