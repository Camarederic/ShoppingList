package com.example.shoppinglist.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.shoppinglist.domain.ShopItem
import com.example.shoppinglist.domain.ShopListRepository
import java.lang.RuntimeException

// 18) Создаем объект и реализуем репозиторий
object ShopListRepositoryImpl : ShopListRepository {

    // 43) Создаем объект LiveData
    val shopListLiveData = MutableLiveData<List<ShopItem>>()

    // 20) Создаем переменную, в которой будем хранить коллекцию элементов
    private val shopList = mutableListOf<ShopItem>()

    // 28) Создаем переменную, которая будет хранить id элементов
    private var autoIncrementId = 0

    // 19) Переопределяем все методы
    override fun addShopItem(shopItem: ShopItem) {
        // 29) Проверяем и устнавливаем у объекта id и увеличим значение на 1
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId
            autoIncrementId++
        }
        // 21) Добавляем элемент в список
        shopList.add(shopItem)
        // 46) Вызываем метод
        updateList()
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        // 22) Здесь удаляем элемент из коллекции
        shopList.remove(shopItem)
        // 47)
        updateList()
    }

    override fun editShopItem(shopItem: ShopItem) {
        // 25) Находим старый элемент и удаляем его
        val oldElement = getShopItem(shopItem.id)
        shopList.remove(oldElement)
        // 26) Вставляем новый элемент
        addShopItem(shopItem)

    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        // 24) Ищем элемент по id и возвращаем его
        return shopList.find {
            it.id == shopItemId
        } ?: throw RuntimeException("Element with id $shopItemId not found")
    }

    override fun getShopList(): LiveData<List<ShopItem>> { // 42) Добавляем LiveData
        // 23) Возвращаем копию данной коллекции
        return shopListLiveData  // 44) Меняем shopList.toList() на shopListLiveData
    }

    // 45) Создаем метод для обновления списка
    private fun updateList(){
        shopListLiveData.value = shopList.toList()
    }
}