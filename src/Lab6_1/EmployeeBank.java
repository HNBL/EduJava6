package Lab6_1;

class EmployeeBank extends Human {
    String workBank;

    public EmployeeBank(String firstname, String lastname, String f) {
        super(firstname, lastname);
        this.workBank = f;


    }

    public void displayInfo() {
        System.out.printf("\nИмя: %s, Фамилия: %s, Банк: %s", Name(), Famyli(), workBank);
    }

    public static void main(String[] args) {

        BankFace Egor = new Human("Егор", "Кудинов");
        Egor.displayInfo();
        BankFace Nadya = new Client("Надя", "Кудинова", "Тиньков");
        Nadya.displayInfo();
        BankFace Alex = new EmployeeBank("Александра", "Полухина", "Тиньков");
        Alex.displayInfo();

    }
}
