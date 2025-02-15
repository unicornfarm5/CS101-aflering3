package com.example.myapplication.CS101.aflevering3

open class Article(
    var author: String,
    var title: String
) {
    //to string så det ser nice ud
    override fun toString(): String {
        return "Article(author='$author', title='$title')"
    }
}

