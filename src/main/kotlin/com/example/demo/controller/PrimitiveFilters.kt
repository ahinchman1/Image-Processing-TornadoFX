package com.example.demo.controller

import javafx.scene.paint.Color
import tornadofx.*

// BLACK = 1
// WHITE = 0

class PrimitiveFilter: Controller() {

    fun or(a: Color, b: Color): Color {
        return if (a == Color.BLACK || b == Color.BLACK) {
            Color.BLACK
        } else Color.WHITE
    }

    fun and(a: Color, b: Color) : Color {
        var color = Color.WHITE
        if (a == Color.BLACK && b == Color.WHITE) {
            color = Color.BLACK
        }
        return color
    }

    fun not(color: Color) : Color {
        return if (color == Color.BLACK) Color.WHITE
        else Color.BLACK
    }

    fun equals(a: Color, b: Color): Color {
        return if ((a == Color.WHITE && b == Color.WHITE) || (a == Color.BLACK && b == Color.BLACK)) {
            Color.BLACK
        } else Color.WHITE
    }

}