import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        System.out.println(discountCalculator.applyDiscountCalculator(BigDecimal.valueOf(123), AccountStatus.SimpleCustomer,2023));
    }
}
