package org.itstep.task06;
/**
 * Задание
 * Описать  базовый  класс  MainString  (Строка).
 * <p>
 * Обязательные поля класса:
 * - массив символов (chars);
 * - значение типа int хранит длину строки в символах (len).
 * <p>
 * Реализовать  обязательные  методы  следующего  назначения:
 * - конструктор без параметров;
 * - конструктор, принимающий в качестве параметра строковый литерал;
 * - конструктор, принимающий в качестве параметра символ и длину строки;
 * - метод получения длины строки (length());
 * - метод очистки строки (делает строку пустой) (clear());
 * - метод конкатенации (соединяет две строки типа MainString) (concat);
 * - метод поиска символа в строке (indexOf()).
 * - метод toString(), который возвращает строковое представление объекта
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class MainString {
    private char []chars;
    private int len;
    public MainString() {
        len=0;
    }
    public MainString(char[]chars){
        this.chars=chars;
    }
    public MainString(char[]chars,int len){
        this.chars=chars;
        this.len=len;
    }

    public char[] getChars() {
        return chars;
    }

    public void setChars(char[] chars) {
        this.chars = chars;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int length(){
        int num=0;
        num = chars.length;
        return num;
    }
    public void clear(){
        chars=new char[0];
    }

    public void concat (MainString mainString){
        int size1,size2, nsize;
        size1 = chars.length;
        char[] temp;
        temp = mainString.getChars();
        size2 = temp.length;
        nsize=size1+size2;
        char[]mass = new char[nsize];
        for (int i = 0; i < nsize; i++) {
            if(i<=size1){
                mass[i]=chars[i];
            }
            if(i>=size1){
                mass[i]=temp[i-size1];
            }
        }
    }
}
