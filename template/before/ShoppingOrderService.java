package template.before;

import template.after.ShoppingMallType;

/**
 * author : citizen103
 */
public class ShoppingOrderService {

    public OrderResponseDto order(ShoppingMallType type) {

        payment(type);

        decreaseStock();

        confirmOrder();

        return new OrderResponseDto();
    }

    private void payment(ShoppingMallType type) {

        if (type == ShoppingMallType.AUCTION) {
            // 옥션 결제 코드
        }

        if (type == ShoppingMallType.COUPANG) {
            // 쿠팡 결제 코드
        }

        if (type == ShoppingMallType.GMARKET) {
            // 지마켓 결제 코드
        }

    }

    private void decreaseStock() {

    }

    private void confirmOrder() {

    }
}