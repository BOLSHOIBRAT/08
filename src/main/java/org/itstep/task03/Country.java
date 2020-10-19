package org.itstep.task03;
import java.util.Arrays;
import org.itstep.task02.City;
/**
 * Задание 3
 * <p>
 * Создайте класс «Страна» (Country).
 * <p>
 * Необходимо хранить в полях класса:
 * - название страны (name),
 * - название континента (continent),
 * - телефонный код страны (code),
 * - название столицы (capital - класс City),
 * - города страны (cities - массив City).
 * <p>
 * Реализуйте методы класса для ввода данных, вывода
 * данных, реализуйте доступ к отдельным полям через
 * методы класса.
 * <p>
 * Добавить метод addCity для добавления нового города (города хранятся в массиве cities)
 * <p>
 * Метод getInhabitants должен возвращать количество жителей во всех городах страны (перебрать все города
 * в массиве cities и получить сумму жителей всех городов)

 * В этом классе должен быть агрегирован класс Города (City) из предыдущей задачи.
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class Country{
    private String name;
    private String continent;
    private String code;
    private City capital;
    private City[]cities;
    public Country(){
        cities = new City[0];

    }
    public Country(String name, String continent, String code, City capital){
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public void addCity(City city){
        cities = Arrays.copyOf(cities,cities.length+1);
        cities[cities.length-1] = city;
        System.out.println(cities.length);
    }
    public int getInhabitants(){
        City array_sum_inhabitants = new City();
        int sum = 0;
        for (int i = 0; i < cities.length; i++) {
            array_sum_inhabitants = cities[i];
            sum += array_sum_inhabitants.getInhabitants();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", code='" + code + '\'' +
                ", capital=" + capital +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }
}