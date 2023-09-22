package group4720.ognev.task5.data;

public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public RationalNumber add(RationalNumber other) {

        int resultNumerator = this.numerator * other.denominator + other.numerator * this.denominator;

        int resultDenominator = this.denominator * other.denominator;

        return new RationalNumber(resultNumerator, resultDenominator);

    }



    public RationalNumber subtract(RationalNumber other) {

        int resultNumerator = this.numerator * other.denominator - other.numerator * this.denominator;

        int resultDenominator = this.denominator * other.denominator;

        return new RationalNumber(resultNumerator, resultDenominator);

    }


}
