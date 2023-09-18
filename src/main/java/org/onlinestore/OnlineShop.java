package org.onlinestore;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OnlineShop {
    private Warehouse warehouse;

    // Показать ассортимент пользователю
    public void showAllProductsForUser(User user) {
        System.out.println(
                "Здравствуйте, " +
                        user.getFirstName() + " " +
                        user.getMiddleName() + ". Наш ассортимент:");
        for (Product product: getWarehouse().getProducts()) {
            System.out.println(product);
        }
    }
}