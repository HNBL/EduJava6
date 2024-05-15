package Lab6_5;

import java.util.Scanner;

public class Parent {
    protected static Scanner scan = new Scanner(System.in);
    protected int Age;
    protected String Name;

    public void setAgeUser() {
        System.out.print("Введите возраст пользователя: ");
        this.Age = scan.nextInt();
        scan.nextLine();

    }

    public void setNameUser() {
        System.out.print("Введите имя пользователя: ");
        this.Name = scan.nextLine();
    }

    public String toString() {
        StringBuilder result = new StringBuilder(this.getClass().getSimpleName() + ":\n");
        result.append(String.format("Пользователь: %s\n", this.Name));
        result.append(String.format("Пользователь: %d", this.Age));
        return result.toString();
    }
}
