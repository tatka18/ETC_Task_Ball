package by.epamtc.task02.ball.run;

import by.epamtc.task02.ball.model.Ball;
import by.epamtc.task02.ball.model.Basket;
import by.epamtc.task02.ball.scaner.Scan;
import by.epamtc.task02.ball.service.BallService;
import by.epamtc.task02.ball.service.BasketService;
import by.epamtc.task02.ball.service.CommonService;
import by.epamtc.task02.ball.service.impl.BallServiceImpl;
import by.epamtc.task02.ball.service.impl.BasketServiceImpl;
import by.epamtc.task02.ball.service.impl.CommonServiceImpl;
import by.epamtc.task02.ball.util.StringConstants;

public class Run2 {
    public static void main(String[] args) {
        Scan scan = new Scan();

        Ball ball = new Ball();
        System.out.print(StringConstants.ballDiameter);
        ball.setDiameter(scan.doubleReadFromConsole());

        Basket basket = new Basket();
        System.out.print(StringConstants.basketBaseDiameter);
        basket.setDiameterOfBase(scan.doubleReadFromConsole());
        System.out.print(StringConstants.basketTopDiameter);
        basket.setDiameterOfTop(scan.doubleReadFromConsole());
        System.out.print(StringConstants.basketHeight);
        basket.setHeight(scan.doubleReadFromConsole());

        BallService ballService = new BallServiceImpl();
        ballService.ballVolume(ball);

        BasketService basketService = new BasketServiceImpl();
        basketService.basketVolume(basket);

        CommonService commonService = new CommonServiceImpl();
        commonService.cubeVolume(ball);
        int count = (int)commonService.ballCount(ball, basket);

        System.out.println(count);

    }
}

