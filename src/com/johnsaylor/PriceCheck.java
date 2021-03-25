package com.johnsaylor;

public class PriceCheck {
    public static void test(){
        String[] products = new String[]{"eggs", "milk", "cheese"};
        float[] productPrices = new float[]{(float) 2.89, (float) 3.29, (float) 5.79};
        String[] productsSold = new String[]{"eggs", "eggs", "cheese", "milk"};
        float[] soldPrice = new float[]{2.89f, 2.99f, 5.97f, 3.29f};

        System.out.println(priceCheck(products, productPrices, productsSold, soldPrice));
    }

    static int priceCheck(String[] products, float[] productPrices, String[] productsSold, float[] soldPrices){
        int result = 0;
        for (int i = 0; i < productsSold.length; i++) {
            int priceIndex = 0;
            while (!products[priceIndex].equals(productsSold[i])) {
                priceIndex++;
            }

            if (productPrices[priceIndex] != soldPrices[i]) {
                result++;
            }
        }
        return result;
    }
}
