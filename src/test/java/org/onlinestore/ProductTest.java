package org.onlinestore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {
    private final Product lgPhone = new Product(
            "Samsung phone",
            1111111,
            10,
            12499,
            "Синий цвет. Чехол в комплекте"
    );

    @Test
    void changePriceOfProduct() {
        Product changedPriceLGPhone = new Product(
                "Samsung phone",
                1111111,
                10,
                9999,
                "Синий цвет. Чехол в комплекте"
        );

        lgPhone.changePriceOfProduct(9999);

        assertEquals(lgPhone, changedPriceLGPhone);
    }

    @Test
    void sellProduct() {
        lgPhone.sellProduct(1);
        assertEquals(lgPhone.getQuantity(), 9);
    }

    @Test
    void updateProductQuantity() {
        lgPhone.updateProductQuantity(5);
        assertEquals(lgPhone.getQuantity(), 15);
    }
}