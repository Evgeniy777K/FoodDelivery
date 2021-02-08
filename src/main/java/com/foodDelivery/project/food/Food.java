package com.foodDelivery.project.food;

public class Food {
    private String nameOfDish1;
    private String nameOfDish2;
    private String nameOfDish3;
    private int price;

    public Food(String nameOfDish1, String nameOfDish2, String nameOfDish3, int price) {
        this.nameOfDish1 = nameOfDish1;
        this.nameOfDish2 = nameOfDish2;
        this.nameOfDish3 = nameOfDish3;
        this.price = price;
    }

    public String getNameOfDish1() {
        return nameOfDish1;
    }

    public String getNameOfDish2() {
        return nameOfDish2;
    }

    public String getNameOfDish3() {
        return nameOfDish3;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "nameOfDish1='" + nameOfDish1 + '\'' +
                ", nameOfDish2='" + nameOfDish2 + '\'' +
                ", nameOfDish3='" + nameOfDish3 + '\'' +
                ", price=" + price +
                '}';
    }
}
