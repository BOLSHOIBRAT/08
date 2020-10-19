package org.itstep.task04;
/**
 * Задание 4
 * Создайте класс Дробь (Fraction).
 * <p>
 * Необходимо хранить в полях класса: числитель и знаменатель.
 * <p>
 * Реализуйте геттеры/сеттеры для полей класса.
 * <p>
 * Также создайте методы класса для выполнения арифметических операций:
 * - сложение (addition).
 * - вычитание (subtraction),
 * - умножение (multiplication),
 * - деление (division).
 * <p>
 * Методы должны принимать в качестве аргумента вторую дробь (Fraction) и
 * возвращать результат в виде дроби (Fraction).
 * <p>
 * Создайте два конструктора: по умолчанию, и с параметрами
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class Fraction {
    private int numerator;
    private int denominator;
    Fraction(){
        numerator = 0;
        denominator = 0;

    }
    Fraction (int numerator,int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction addition(Fraction fraction){
        int num1 = numerator;
        int num2 = denominator;
        int num3 = fraction.getNumerator();
        int num4 = fraction.getDenominator();
        int num5 = num1+num3;
        int num6 = num4;
        if(num5/num6!=0 && num6/num6 !=0) {
            num5/=num6;
            num6/=num6;
        }
        fraction.setNumerator(numerator = num5);
        fraction.setDenominator(denominator = num6);
        return fraction;
    }
    public Fraction subtraction(Fraction fraction) {
        int num1 = numerator;
        int num2 = denominator;
        int num3 = fraction.getNumerator();
        int num4 = fraction.getDenominator();
        int num5 = num1-num3;
        int num6 = num4;
        if(num5/num6!=0 && num6/num6 !=0) {
            num5/=num6;
            num6/=num6;
        }
        fraction.setNumerator(numerator = num5);
        fraction.setDenominator(denominator = num6);
        return fraction;
    }
    public Fraction multiplication(Fraction fraction){
        int num1 = numerator;
        int num2 = denominator;
        int num3 = fraction.getNumerator();
        int num4 = fraction.getDenominator();
        int num5 = num1*num3;
        int num6 = num2*num4;
        if(num5/num6!=0 && num6/num6 !=0) {
            num5/=num6;
            num6/=num6;
        }
        fraction.setNumerator(numerator = num5);
        fraction.setDenominator(denominator = num6);
        return fraction;
    }
    public Fraction division(Fraction fraction){
        int num1 = numerator;
        int num2 = denominator;
        int num3 = fraction.getNumerator();
        int num4 = fraction.getDenominator();
        int num5 = (num1*num4)/num2;
        int num6 = (num2*num3)/num2;
        fraction.setNumerator(numerator = num5);
        fraction.setDenominator(denominator = num6);
        return fraction;
    }
    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
