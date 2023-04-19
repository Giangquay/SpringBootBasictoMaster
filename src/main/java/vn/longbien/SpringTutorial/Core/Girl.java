package vn.longbien.SpringTutorial.Core;

/*
   Hoan toan binh thuong
   Không được Spring quản lý
   Không đưa vào applicationContext
 */
public class Girl {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}