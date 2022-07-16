package com.example.shoppinglist.domain

// 4) Создаем класс, который добавляет элементы в список с одним метод
class AddShopItemUseCase(private val shopListRepository: ShopListRepository) { // 8) Добавляем репозиторий

    fun addShopItem(shopItem: ShopItem) {

        // 9) Теперь у репозитория вызываем метод
        shopListRepository.addShopItem(shopItem)
    }
}