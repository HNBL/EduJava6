package Lab6_1;

public class Human implements BankFace {
    String firstName;
    String lastName;

    public String Name() {
        return firstName;
    }

    public String Famyli() {
        return lastName;
    }

    public void displayInfo() {
        System.out.printf("Имя: %s, Файмилия: %s", firstName, lastName);
    }

    Human(String n, String f) {
        this.lastName = f;
        this.firstName = n;

    }
}