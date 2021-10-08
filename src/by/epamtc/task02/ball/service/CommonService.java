package by.epamtc.task02.ball.service;

import by.epamtc.task02.ball.model.Ball;
import by.epamtc.task02.ball.model.Basket;

public interface CommonService {
    void cubeVolume(Ball ball);

    double ballCount(Ball ball, Basket basket);

}
