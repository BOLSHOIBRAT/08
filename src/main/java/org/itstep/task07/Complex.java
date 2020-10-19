package org.itstep.task07;

public class Complex {
    private double real;
    private double imaginary;
    private Complex(){
        real = 0;
        imaginary = 0;
    }
    private Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public boolean equals(Complex complex){
        boolean result = false;
        double num1 = real;
        double num2 = imaginary;
        double num3 = complex.real;
        double num4 = complex.imaginary;
        if(num1==num3 && num2 == num4){
            result = true;
        }
        return result;
    }

    public Complex plus(Complex complex){
        double num1 = real;
        double num2 = imaginary;
        double num3 = complex.getReal();
        double num4 = complex.getImaginary();
        double sum1 = num1+num3;
        double sum2 = num2+num4;
        complex.real = sum1;
        complex.imaginary = sum2;
        return complex;
    }

    public Complex minus(Complex complex){
        double num1 = real;
        double num2 = imaginary;
        double num3 = complex.getReal();
        double num4 = complex.getImaginary();
        double sum1 = num1-num3;
        double sum2 = num2-num4;
        complex.setReal(sum1);
        complex.setImaginary(sum2);
        return complex;
    }


    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }
}
