package com.example.IceCool.calculator;

public class Flavors {

    private int raspberrySlushy;
    private int cocoCoffee;
    private int nuttyFruit;
    private int pistachioDelight;

    public Flavors() {
        this.raspberrySlushy = raspberrySlushy;
        this.cocoCoffee = cocoCoffee;
        this.nuttyFruit = nuttyFruit;
        this.pistachioDelight = pistachioDelight;
    }

    public int getRaspberrySlushy() {
        return raspberrySlushy;
    }

    public void setRaspberrySlushy(int raspberrySlushy) {
        this.raspberrySlushy = raspberrySlushy;
    }

    public int getCocoCoffee() {
        return cocoCoffee;
    }

    public void setCocoCoffee(int cocoCoffee) {
        this.cocoCoffee = cocoCoffee;
    }

    public int getNuttyFruit() {
        return nuttyFruit;
    }

    public void setNuttyFruit(int nuttyFruit) {
        this.nuttyFruit = nuttyFruit;
    }

    public int getPistachioDelight() {
        return pistachioDelight;
    }

    public void setPistachioDelight(int pistachioDelight) {
        this.pistachioDelight = pistachioDelight;
    }

    @Override
    public String toString() {
        return "Flavors{" +
                "raspberrySlushy=" + raspberrySlushy +
                ", cocoCoffee=" + cocoCoffee +
                ", nuttyFruit=" + nuttyFruit +
                ", pistachioDelight=" + pistachioDelight +
                '}';
    }
}
