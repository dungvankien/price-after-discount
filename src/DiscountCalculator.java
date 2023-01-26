import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.math.BigDecimal;

public class DiscountCalculator {

    private static final BigDecimal DISCOUNT_RATE_SIMPLE_CUSTOMERS = new BigDecimal(0.9);
    public static final BigDecimal DISCOUNT_RATE_VALUABLE_CUSTOMERS = new BigDecimal(0.7);
    public static final BigDecimal DISCOUNT_RATE_MOST_VALUABLE_CUSTOMERS = new BigDecimal(0.5);

    public BigDecimal applyDiscountCalculator(BigDecimal price, AccountStatus accountStatus, int numberOfYearsRegisteredAccount) {
        BigDecimal priceAfterDiscount = new BigDecimal(0);
        BigDecimal discountPercentage = BigDecimal.valueOf((numberOfYearsRegisteredAccount > 5) ?
                5/100 : numberOfYearsRegisteredAccount/100);
        switch (accountStatus) {
            case NotRegistered:
                priceAfterDiscount = price;
                break;
            case SimpleCustomer:
                priceAfterDiscount = (new BigDecimal(1).subtract(discountPercentage)).multiply(DISCOUNT_RATE_SIMPLE_CUSTOMERS.multiply(price));
                break;
            case ValuableCustomer:
                priceAfterDiscount = (new BigDecimal(1).subtract(discountPercentage)).multiply(DISCOUNT_RATE_VALUABLE_CUSTOMERS.multiply(price));
                break;
            case MostValuableCustomer:
                priceAfterDiscount = (new BigDecimal(1).subtract(discountPercentage)).multiply(DISCOUNT_RATE_MOST_VALUABLE_CUSTOMERS.multiply(price));
                break;
            default:
                throw new NotImplementedException();
        }
        return priceAfterDiscount;
    }
}

