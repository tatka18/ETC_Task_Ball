package by.epamtc.task02.ball.model;

public class Ball{
    private String color;
    private double diameter;
    private double weight;

    public Ball(){}

    public Ball(String color, double diameter, double weight) {
        this.color = color;
        this.diameter = diameter;
        this.weight = weight;
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

    public double calculateBallVolume(){
        return 4 * Math.PI * Math.pow(diameter / 2, 3) / (double) 3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        if (color == null) {
            if (ball.color != null)
                return false;
        }
        return Double.compare(ball.diameter, diameter) == 0 &&
                Double.compare(ball.weight, weight) == 0;
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
        return result;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + " color = " + color +
                ", diameter = " + diameter +
                ", weight = " + weight;
     }
}
