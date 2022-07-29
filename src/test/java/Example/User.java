package Example;

public class User {
    private int age;
    private String name;
    private int weight;
    private boolean sex;
    private String speciality;

    public User(int age, String name, int weight, boolean sex, String speciality) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.sex = sex;
        this.speciality = speciality;
    }

    public String toString() {
        return "your age is " + this.age + ", your name " + this.name + ", user weight " + this.weight + ", user orient " + this.sex + " user speciality " + this.speciality;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isSex() {
        return sex;
    }

    public String getSpeciality() {
        return speciality;
    }
}
