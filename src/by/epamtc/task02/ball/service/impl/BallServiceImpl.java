package by.epamtc.task02.ball.service.impl;

import by.epamtc.task02.ball.model.Ball;
import by.epamtc.task02.ball.service.BallService;

public class BallServiceImpl implements BallService {
    @Override
    public void ballVolume(Ball ball) {
        ball.setVolume(4 / (double) 3 * Math.PI * radius(ball));
    }

    private double radius(Ball ball){
        return ball.getDiameter() / 2;
    }

}
