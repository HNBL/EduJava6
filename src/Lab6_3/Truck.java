package Lab6_3;

class Truck extends Car {
    int wheels;
    float maxWeight;

    public Truck(int w, String m, char c, float s, int k, float mW) {

        super(w, m, c, s, k);
        this.maxWeight = mW;

    }

    public void outMaxWeight() {
        System.out.printf("Максимальная грузоподьемность %s кг ", maxWeight);
    }

    public void newWheels(int w) {
        this.wheels = w;
        System.out.printf("Колличество коллес %s ", wheels);
    }

    public static void main(String[] args) {

        Car Car = new Car(2500, "Лады", 'K', 140, 5);
        Car.outPut();
        Truck Truck = new Truck(9050, "Камаза", 'c', 125, 15, 10000);
        Truck.outPut();
        Truck.newWheels(10);
        Truck.outMaxWeight();


    }

}