package org.itstep.task05;

public class Money {
    private long hryvnia;
    private byte kopecks;
    public Money(){
        hryvnia = 0;
        kopecks = 0;
    }
    public Money(long hryvnia){
        this.hryvnia = hryvnia;
        kopecks = 0;
    }
    public Money(long hryvnia, byte kopecks){
        this.hryvnia = hryvnia;
        this.kopecks = kopecks;
    }

    public long getHryvnia() {
        return hryvnia;
    }

    public void setHryvnia(long hryvnia) {
        this.hryvnia = hryvnia;
    }

    public byte getKopecks() {
        return kopecks;
    }

    public void setKopecks(byte kopecks) {
        this.kopecks = kopecks;
    }

    public Money addition(Money money){
        long num1 = hryvnia;
        byte num2 = kopecks;
        long num3 = money.getHryvnia();
        byte num4 = money.getKopecks();
        long  sum1 = 0;
        byte  sum2 = 0;
        sum1 = num1+num3;
        sum2 = (byte)(num2+num4);

        money.setHryvnia(sum1);
        money.setKopecks(sum2);
        return money;
    }
    public Money subtraction(Money money){
        long num1 = hryvnia;
        byte num2 = kopecks;
        long num3 = money.getHryvnia();
        byte num4 = money.getKopecks();
        long  sum1 = 0;
        byte  sum2;
        sum1 = num1-num3;
        sum2 = (byte)(num2-num4);
        money.setHryvnia(sum1);
        money.setKopecks(sum2);
        return money;
    }
    public Money division(double value){
        Money money = new Money();
        money.setHryvnia(hryvnia);
        money.setKopecks(kopecks);
        long num1 = money.getHryvnia();
        byte num2 = money.getKopecks();
        num1 /=value;
        num2 /=value;
        money.setHryvnia(num1);
        money.setKopecks(num2);
        return money;
    }
    public Money multiplication(Money money){
        long num1 = hryvnia;
        byte num2 = kopecks;
        double value=money.getHryvnia();
        long  res1 = (long)(num1 * value);
        byte  res2 = (byte)(num2 * value);
        money.setHryvnia(res1);
        money.setKopecks(res2);
        return money;
    }
    public Money multiply(double value){
        Money money = new Money();
        money.setHryvnia(hryvnia);
        money.setKopecks(kopecks);
        long num1 = money.getHryvnia();
        byte num2 = money.getKopecks();
        num1 *=value;
        num2 *=value;
        money.setHryvnia(num1);
        money.setKopecks(num2);
        return money;
    }
    public boolean equals(Money money){
        boolean result =false;
        long num1 = money.getHryvnia();
        byte num2 = money.getKopecks();
        if(hryvnia==num1 && kopecks == num2){
            result = true;
        }
        return  result;
    }
    @Override
    public String toString() {
        return "Money{" +
                "hryvnia=" + hryvnia +
                ", kopecks=" + kopecks +
                '}';
    }
}
