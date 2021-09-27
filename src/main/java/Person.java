public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double height;

    public Person(String firstName, String lastName, int age, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public double getPersonHeight() {
        return this.height;
    }

    public String fullName() {
        //thanks IntelliJ ;)
        return String.format("%s %s", this.firstName, this.lastName);
    }

    public int increaseAge() {
        return this.age += 1;
    }

    public double increaseHeight() {
        return this.height += 0.1;
    }

    public void increaseHeightWithAge() {
        increaseAge();
        increaseHeight();
    }
}
