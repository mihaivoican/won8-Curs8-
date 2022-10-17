package homework11;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final String hairColour;

    public Person(String name, int age, String hairColour) {
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public String hairColour() {
        return hairColour;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Person) obj;
        return Objects.equals(this.name, that.name) &&
                this.age == that.age &&
                Objects.equals(this.hairColour, that.hairColour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hairColour);
    }

    @Override
    public String toString() {
        return "Person[" +
                "name=" + name + ", " +
                "age=" + age + ", " +
                "hairColour=" + hairColour + ']';
    }


}
