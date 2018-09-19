package com.example.demo.aspect

import javafx.scene.image.PixelReader


class Memoize<in A, out B>(private val f: (A) -> B) : (A) -> B {
    private val values = mutableMapOf<A, B>()
    override fun invoke(x: A): B {
        return values.getOrPut(x) { f(x) }
    }
}