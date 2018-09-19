package com.example.demo.view

import com.example.demo.controller.Filters
import com.example.demo.controller.PrimitiveFilter
import javafx.scene.image.Image
import javafx.scene.image.PixelReader
import javafx.scene.image.PixelWriter
import javafx.scene.image.WritableImage
import javafx.scene.paint.Color
import tornadofx.*

class MainView : View("Two images for a new one!") {

    private val img1 = Image("/images/pixeldrawing.png")
    private val img2 = Image("/images/this_is_sparta.jpg")
    private val wImg1 = WritableImage(img1.pixelReader, img1.width.toInt(), img1.height.toInt())
    private val wImg2 = WritableImage(img2.pixelReader, img2.width.toInt(), img2.height.toInt())

    private val filter: Filters by inject()

    override val root = borderpane {
        center {
            hbox {
                stackpane {
                    imageview(filter.horizontalEdge(wImg1.pixelReader))
                }
            }
        }
    }
}
