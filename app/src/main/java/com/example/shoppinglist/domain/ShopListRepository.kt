package com.example.shoppinglist.domain

// 7) Создаем интерфейс репозитория, где будут храниться методы
interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int):ShopItem

    fun getShopList():List<ShopItem>


}