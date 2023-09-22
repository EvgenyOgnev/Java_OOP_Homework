package group4720.ognev.task5.data;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public ComplexNumber add(ComplexNumber other) {

        double resultReal = this.real + other.real;

        double resultImaginary = this.imaginary + other.imaginary;

        return new ComplexNumber(resultReal, resultImaginary);

    }



    public ComplexNumber subtract(ComplexNumber other) {

        double resultReal = this.real - other.real;

        double resultImaginary = this.imaginary - other.imaginary;

        return new ComplexNumber(resultReal, resultImaginary);

    }



}
