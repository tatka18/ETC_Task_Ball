package by.epamtc.task02.ball.model;

import java.io.Serializable;
import java.util.Objects;

public class Basket implements Serializable {
    private String color;
    private String material;
    private double height;
    private double diameterOfBase;
    private double diameterOfTop;
    private double weight;
    private double basketVolume;

    public Basket() {
    }

    public Basket(String color, String material, double height, double diameterOfBase, double diameterOfTop, double weight, double basketVolume) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.diameterOfBase = diameterOfBase;
        this.diameterOfTop = diameterOfTop;
        this.weight = weight;
        this.basketVolume = basketVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDiameterOfBase() {
        return diameterOfBase;
    }

    public void setDiameterOfBase(double diameterOfBase) {
        this.diameterOfBase = diameterOfBase;
    }

    public double getDiameterOfTop() {
        return diameterOfTop;
    }

    public void setDiameterOfTop(double diameterOfTop) {
        this.diameterOfTop = diameterOfTop;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBasketVolume() {
        return basketVolume;
    }

    public void setBasketVolume(double basketVolume) {
        this.basketVolume = basketVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Double.compare(basket.height, height) == 0 &&
                Double.compare(basket.diameterOfBase, diameterOfBase) == 0 &&
                Double.compare(basket.diameterOfTop, diameterOfTop) == 0 &&
                Double.compare(basket.weight, weight) == 0 &&
                Double.compare(basket.basketVolume, basketVolume) == 0 &&
                Objects.equals(color, basket.color) &&
                Objects.equals(material, basket.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, material, height, diameterOfBase, diameterOfTop, weight, basketVolume);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " color='" + color +
                ", material='" + material +
                ", height='" + height +
                ", diameterOfBase='" + diameterOfBase +
                ", diameterOfTop='" + diameterOfTop +
                ", volume=" + basketVolume +
                ", weight=" + weight;
    }
}
