package template.after;

import template.before.OrderResponseDto;

/**
 * author : citizen103
 */
public class ShoppingOrderService {

    private ShoppingMall shoppingMall;

    public OrderResponseDto order(ShoppingMallType type) {
        shoppingMall = ShoppingMallFactory.getInstance(type);
        return shoppingMall.order();
    }
}