package com.company.autopark;

import com.company.com.car.Car;

import java.util.ArrayList;

public class Autopark implements AutoparkInterface {

    private ArrayList<Car> autopark;

    public ArrayList<Car> getAutopark() {
        return autopark;
    }

    public void setAutopark(ArrayList<Car> autopark) {
        this.autopark = autopark;
    }

    public Autopark(ArrayList<Car> autopark) {
        this.autopark = autopark;
    }

    public ArrayList<Car> sortParkByFuel() {
        for (int i = this.autopark.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (this.autopark.get(j).getFuelCons() > this.autopark.get(j + 1).getFuelCons()) {
                    Car fuel = this.autopark.get(j);
                    this.autopark.set(j, this.autopark.get(j + 1));
                    this.autopark.set(j + 1, fuel);
                }
            }
        }
        return this.autopark;
    }

    public ArrayList<Car> findCar(String model){
        ArrayList<Car> result = new ArrayList<>();
        try {
            for (Car a : this.autopark) {
                 if (a.getModel().contains(model))
                    result.add(a);
            }
            return result;
        } catch (NumberFormatException e){
            System.out.println(e);
        } finally {
            return result;
        }
    }

    public ArrayList<Car> findCar(String model, String color){
        ArrayList<Car> result = new ArrayList<>();
        try {
            for (Car a : this.autopark) {
                if (a.getModel().contains(model) && a.getColor().contains(color))
                    result.add(a);
            }
            return result;
        } catch (NumberFormatException e){
            System.out.println(e);
        } finally {
            return result;
        }
    }

    public ArrayList<Car> findCar(String model, String color, double price){
        ArrayList<Car> result = new ArrayList<>();
        try {
            for (Car a : this.autopark) {
                if (a.getModel().contains(model) && a.getColor().contains(color) && Double.toString(a.getPrice()).contains(Double.toString(price)))
                    result.add(a);
            }
            return result;
        } catch (NumberFormatException e){
            System.out.println(e);
        } finally {
            return result;
        }
    }

    public double CountPrice(){
        double price = 0;
        for(Car a : autopark){
            price += a.getPrice();
        }
        return price;
    }

    public static void Print(ArrayList<Car> pol){
        for(Car a : pol){
            System.out.println(a);
        }
        System.out.println();
    }
}
