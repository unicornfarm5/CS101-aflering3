package com.example.myapplication.CS101.aflevering3

open class Product(
    val name:String,
    private var quantity: Int //så man kun kan update qly ved at bruge add/remove fun
) {
    fun addToAmountInStock(addAmount: Int) {
        println("$addAmount items added to $name")
        quantity+=addAmount
    }

    fun removeToAmountInStock(removeAmount:Int) {
        println("$removeAmount items removed from $name")
        quantity-=removeAmount
    }


    //metchod to show number of the product in stock
    fun disPlayIncventory(): String {
        return "$name: we have $quantity in stock"
    }

    override fun toString(): String {
        return "Product(name='$name', quantity=$quantity)"
    }
}
