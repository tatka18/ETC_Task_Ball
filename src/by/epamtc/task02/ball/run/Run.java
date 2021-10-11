package by.epamtc.task02.ball.run;

import by.epamtc.task02.ball.model.Ball;
import by.epamtc.task02.ball.model.Basket;
import by.epamtc.task02.ball.scaner.Scan;
import by.epamtc.task02.ball.util.StringConstants;

public class Run {
    public static void main(String[] args) {
        Scan scan = new Scan();

        Basket basket = new Basket();
        System.out.print(StringConstants.basketBaseDiameter);
        basket.setDiameterOfBase(scan.doubleReadFromConsole());
        System.out.print(StringConstants.basketTopDiameter);
        basket.setDiameterOfTop(scan.doubleReadFromConsole());
        System.out.print(StringConstants.basketHeight);
        basket.setHeight(scan.doubleReadFromConsole());

        basket.setBallsList(new Ball("blue", 3.0, 2.3));
        basket.setBallsList(new Ball("red", 2.0, 1.3));
        basket.setBallsList(new Ball("blue", 4.0, 2.8));
        basket.setBallsList(new Ball("white", 2.1, 1.1));
        basket.setBallsList(new Ball("blue", 4.0, 2.8));
        basket.setBallsList(new Ball("white", 2.1, 1.1));

        System.out.println("balls common weight: - " + basket.calculateBallsCommonWeight());
        System.out.println("how much blue balls? - " + basket.countBallsByColor("blue"));
        System.out.println("is basket full? - " + basket.isFullBasket());
        System.out.println("count ball - " + basket.getBallsList().size());
    }
}

