package by.epamtc.task02.ball.model;

import java.util.ArrayList;
import java.util.List;

public class Basket{
    private String color;
    private double height;
    private double diameterOfBase;
    private double diameterOfTop;
    private double weight;

    private final List<Ball> ballsList = new ArrayList<>();

    public Basket() {
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

    public List<Ball> getBallsList (){
        return ballsList;
    }

    public void setBallsList(Ball ball){
        if(!isBasketOverload()){
            ballsList.add(ball);
        }
    }

    public double calculateBasketVolume(){
        return Math.PI * height
                * Math.pow(calculateRadius(diameterOfBase), 2)
                + calculateRadius(diameterOfBase) * calculateRadius(diameterOfTop)
                + Math.pow(calculateRadius(diameterOfTop), 2)
                / (double) 3;
    }

    public double calculateBallsCommonVolume(){
        double volumeCommonBalls = 0;
        for (Ball ball : ballsList){
            volumeCommonBalls += ball.calculateBallVolume();
        }
        return volumeCommonBalls;
    }

    public double calculateBallsCommonWeight(){
        double volumeCommonBalls = 0;
        for (Ball ball : ballsList){
            volumeCommonBalls += ball.getWeight();
        }
        return volumeCommonBalls;
    }

    public int countBallsByColor(String color){
        int countByColor = 0;
        for (Ball ball : ballsList){
            if (ball.getColor().equals(color)){
                countByColor ++;
            }
        }
        return countByColor;
    }

    public boolean isFullBasket(){
        return calculateBasketVolume() <= calculateBallsCommonVolume();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        if (color == null) {
            if (basket.color != null)
                return false;
        }
        return Double.compare(basket.height, height) == 0 &&
                Double.compare(basket.diameterOfBase, diameterOfBase) == 0 &&
                Double.compare(basket.diameterOfTop, diameterOfTop) == 0 &&
                Double.compare(basket.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        long temp;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        temp = Double.doubleToLongBits(height);
        result = prime * result + (int)(temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(diameterOfBase);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(diameterOfTop);
        result = prime * result + (int)(temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = prime * result + (int)(temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " color='" + color +
                ", height='" + height +
                ", diameterOfBase='" + diameterOfBase +
                ", diameterOfTop='" + diameterOfTop +
                ", weight=" + weight;
    }

    private double calculateRadius(double diameter){
        return diameter / 2;
    }
    private boolean isBasketOverload(){
        return calculateBasketVolume() < calculateBallsCommonVolume();
    }
}
