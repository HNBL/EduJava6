package Lab6_1;

class Client extends Human {

    String bank;

    public Client(String firstname, String lastname, String bank) {
        super(firstname, lastname);
        this.bank = bank;


    }
    public void displayInfo() {
        System.out.printf("\nИмя: %s, Фамилия: %s, Банк: %s", Name(), Famyli(), bank);
    }
}