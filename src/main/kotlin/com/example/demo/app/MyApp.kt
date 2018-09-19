package com.example.demo.app

import com.example.demo.view.MainView
import javafx.application.Application
import tornadofx.App
import java.nio.file.Paths

class MyApp: App(MainView::class, Styles::class)