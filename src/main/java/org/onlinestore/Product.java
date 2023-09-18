package org.onlinestore;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private long article;
    private int quantity;
    private int price;
    private String description;

    // Поменять цену продукта
    public final void changePriceOfProduct(int inputPrice) {
        this.price = inputPrice;
    }

    // Продажа товара
    public final void sellProduct(int qtyOfProduct) {
        this.quantity -= qtyOfProduct;
    }

    // Пополнение товара
    public final void updateProductQuantity(int qtyOfProduct) {
        this.quantity += qtyOfProduct;
    }
}