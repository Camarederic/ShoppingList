package com.example.shoppinglist.domain

// 5) Создаем класс, который удвляет элементы из списка с одним методом
class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) { // 10) Добавляем репозиторий

    fun deleteShopItem(shopItem: ShopItem) {
        // 11) Теперь у репозитория вызываем метод
        shopListRepository.deleteShopItem(shopItem)
    }
}