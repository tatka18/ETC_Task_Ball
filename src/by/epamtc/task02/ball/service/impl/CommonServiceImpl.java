package by.epamtc.task02.ball.service.impl;

import by.epamtc.task02.ball.model.Ball;
import by.epamtc.task02.ball.model.Basket;
import by.epamtc.task02.ball.service.CommonService;

public class CommonServiceImpl implements CommonService {
    @Override
    public void cubeVolume(Ball ball) {
    }

    @Override
    public double ballCount(Ball ball, Basket basket) {
        return (int)(basket.getBasketVolume() / ball.getVolume());
    }
}
