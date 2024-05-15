package Lab6_3;

public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;
    public int korobka;


    public void outPut () {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed + " Коробка передач - " + korobka);
    }

    public Car (int w, String m,char c, float s,int k) {

        weight = w;
        model = m;
        color = c;
        speed = s;
        korobka = k;


    }

    public Car () {}
}