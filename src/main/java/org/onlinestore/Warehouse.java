package org.onlinestore;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Warehouse {
    private List<Product> products;

    // Добавить продукт на склад
    private void addProductToWarehouse(Product product) {
        getProducts().add(product);
    }

    // Удалить продукт со склада
    private void deleteProductFromWarehouse(Product product) {
        getProducts().remove(product);
    }

    // Количество позиций на складе
    private int getQuantityOfProductsInWarehouse() {
        return getProducts().size();
    }

    // Общая стоимость ассортимента на складе
    private int getTotalSumOfAllProductInWarehouse() {
        int sumOfProducts = 0;
        for (Product product: getProducts()) {
            sumOfProducts += product.getPrice() * product.getQuantity();
        }

        return sumOfProducts;
    }
}
