package template.after;

import template.before.OrderResponseDto;

/**
 * author : citizen103
 */
public interface ShoppingMall {

    default OrderResponseDto order() {
        payment();
        decreaseStock();
        confirmOrder();

        return new OrderResponseDto();
    }

    void payment();

    default void decreaseStock() {
        // 재고 차감 로직
    }
    
    default void confirmOrder() {
        // 주문 완료 로직
    }
}
