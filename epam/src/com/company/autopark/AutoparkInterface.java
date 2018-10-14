package com.company.autopark;

import com.company.com.car.Car;

import java.util.ArrayList;

public interface AutoparkInterface {

    public ArrayList<Car> sortParkByFuel();

    public ArrayList<Car> findCar(String quary);

    public double CountPrice();

}
