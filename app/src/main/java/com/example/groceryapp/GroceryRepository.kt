package com.example.groceryapp

import com.gtappdevelopers.grocerryapp.GroceryDatabase
import com.gtappdevelopers.grocerryapp.GroceryItems

class GroceryRepository(private val db: GroceryDatabase) {
    suspend fun insert(items: GroceryItems) = db.getGroceryDao().insert(items)
    suspend fun delete(items: GroceryItems) = db.getGroceryDao().delete(items)
    fun getAllItems() = db.getGroceryDao().getAllGroceryItems()
}