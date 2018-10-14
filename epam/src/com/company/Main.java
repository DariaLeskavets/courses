package com.company;

import com.company.autopark.*;
import com.company.com.car.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        A car1 = new A("Audi", "black", 65.80, 14);
        B car2 = new B("Nissan", "red", 20.56, 13);
        C car3 = new C("Reno", "blue", 15.80, 10);
        D car4 = new D("BMW", "black", 45.67, 16);
        E car5 = new E("KIL", "pink", 13.45, 9);
        F car6 = new F("Nissan", "black", 17.57, 14);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        Autopark autopark = new Autopark(cars);

        autopark.Print(cars);
        autopark.sortParkByFuel();
        autopark.Print(cars);
        double price = autopark.CountPrice();
        System.out.println("The price of autopark: " + price);
        autopark.Print(autopark.findCar("Nissan"));
        autopark.Print(autopark.findCar("Reno", "black"));
        autopark.Print(autopark.findCar("KIL", "black", 20));
    }


}
