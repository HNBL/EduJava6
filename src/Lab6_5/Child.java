package Lab6_5;

public class Child extends Parent{

    @Override
    public void setNameUser(){
        System.out.print("Введите имя пользователя-наследника: ");
        this.Name = scan.nextLine();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(this.getClass().getSimpleName() + ":\n");
        result.append(String.format("Пользователь-наследник: %s\n", this.Name));
        result.append(String.format("Пользователь-наследник: %d", this.Age));
        return result.toString();
    }

    public static void main(String[] args) {
        Parent sp = new Parent();
        sp.setAgeUser();
        sp.setNameUser();
        System.out.println(sp);

        Child sс = new Child();
        sс.setAgeUser();
        sс.setNameUser();
        System.out.println(sс);

    }


}
