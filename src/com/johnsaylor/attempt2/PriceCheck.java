package com.johnsaylor.attempt2;

import java.util.Arrays;
import java.util.List;

public class PriceCheck {
    public static void test() {
        String[] products = new String[]{"eggs", "milk", "cheese"};
        Float[] productPrices = new Float[]{(float) 2.89, (float) 3.29, (float) 5.79};
        String[] productsSold = new String[]{"eggs", "eggs", "cheese", "milk"};
        Float[] soldPrice = new Float[]{2.89f, 2.99f, 5.97f, 3.29f};

        priceCheck(Arrays.asList(products), Arrays.asList(productPrices), Arrays.asList(productsSold), Arrays.asList(soldPrice));
    }

    static void priceCheck(List<String> product, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {

        int errors = 0;

        for (int i = 0; i < productSold.size(); i++) {
            int index = product.indexOf(productSold.get(i));

            if (!(productPrices.get(index).equals(soldPrice.get(i)))){
                errors++;
            };
        }

        System.out.println(errors);
    }

}
