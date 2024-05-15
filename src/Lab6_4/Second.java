package Lab6_4;

import java.util.Random;

public class Second extends First {
    public int outNum() {

        return this.num;
    }

    public static void main(String[] args) {

        First firstTest = new First();
        Random rnd = new Random();
        firstTest.setNum(rnd.nextInt(100));
        System.out.println(firstTest.num);
    }

}

