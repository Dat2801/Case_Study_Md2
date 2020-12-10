package object;

import java.io.Serializable;
public class Person implements Serializable {
    private String name;
    private String village;
    private int age;
    private int idCard;

    public Person(){}

    public Person(String name, int age, int idCard) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Họ tên:" + name + "\n" +
                "Tuổi:" + age + "\n" +
                "Số chứng minh thư:" + idCard + "\n"
                ;
    }
}
