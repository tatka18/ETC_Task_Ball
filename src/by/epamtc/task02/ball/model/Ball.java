package by.epamtc.task02.ball.model;

import java.io.Serializable;
import java.util.Objects;

public class Ball implements Serializable{
    private String color;
    private double diameter;
    private double weight;
    private double volume;

    public Ball(){}

    public Ball(double volume) {
        this.volume = volume;
    }

    public Ball(String color, double diameter, double weight, double volume) {
        this.color = color;
        this.diameter = diameter;
        this.weight = weight;
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Double.compare(ball.diameter, diameter) == 0 &&
                Double.compare(ball.weight, weight) == 0 &&
                Double.compare(ball.volume, volume) == 0 &&
                Objects.equals(color, ball.color);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        long temp;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        temp = Double.doubleToLongBits(diameter);
        result = prime * result + (int)(temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(volume);
        result = prime * result + (int)(temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + " color = " + color +
                ", diameter = " + diameter +
                ", volume = " + volume +
                ", weight = " + weight;
     }
}
