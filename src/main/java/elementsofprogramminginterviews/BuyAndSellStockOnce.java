package elementsofprogramminginterviews;

import java.util.Arrays;
import java.util.List;

public class BuyAndSellStockOnce {

    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(310.0, 315.0, 275.0, 295.0, 260.0, 270.0, 290.0, 230.0, 255.0, 250.0);
        System.out.println(computeMaxProfit(prices));
    }

    public static double computeMaxProfit(List<Double> prices) {
        double minPrice = Double.MAX_VALUE, maxProfit = 0.0;
        for (Double price : prices) {
            maxProfit = Math.max(maxProfit, price - minPrice);
            minPrice = Math.min(minPrice, price);
        }
        return maxProfit;
    }
}
