package org.onlinestore;

import java.util.List;

public class OnlineStoreRunner {
    public static void main(String[] args) {
        User user = new User(
                "Иван",
                "Иванов",
                "Иванович",
                30,
                "ivanov@mymail.ru",
                0
        );

        Product lgPhone = new Product(
                "Samsung phone",
                1111111,
                10,
                12499,
                "Синий цвет. Чехол в комплекте"
        );

        Product samsungPhone = new Product(
                "LG phone",
                1111112,
                7,
                17499,
                "Красный цвет. Чехол в комплекте"
        );

        System.out.println(user);
        System.out.println(lgPhone);
        System.out.println(samsungPhone);
        System.out.println();

        Warehouse phoneShopWarehouse = new Warehouse(
                List.of(lgPhone, samsungPhone)
        );

        OnlineShop phoneShop = new OnlineShop(phoneShopWarehouse);
        phoneShop.showAllProductsForUser(user);
    }
}