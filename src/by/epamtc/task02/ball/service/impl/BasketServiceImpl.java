package by.epamtc.task02.ball.service.impl;


import by.epamtc.task02.ball.model.Basket;
import by.epamtc.task02.ball.service.BasketService;

public class BasketServiceImpl implements BasketService {
    @Override
    public void basketVolume(Basket basket) {
        double baseRadius = baseRadius(basket);
        double topRadius = topRadius(basket);
        double volume = 1 / (double) 3 * basket.getHeight()
                * (baseRadius + topRadius + Math.sqrt(baseRadius * topRadius));
        basket.setBasketVolume(volume);
    }
    private double baseRadius(Basket basket){
        return basket.getDiameterOfBase() / 2;
    }
    private double topRadius(Basket basket){
        return basket.getDiameterOfTop() / 2;
    }

}
