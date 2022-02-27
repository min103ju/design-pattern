package template.after;

/**
 * author : citizen103
 */
public class ShoppingMallFactory {

    public static ShoppingMall getInstance(ShoppingMallType type) {
        switch (type) {
            case AUCTION:
                return new AuctionOrder();
            case GMARKET :
                return new GmarketOrder();
            case COUPANG :
                return new CoupangOrder();
            default:
                throw new IllegalArgumentException("적합한 쇼핑몰이 아닙니다.");
        }
    }
}
