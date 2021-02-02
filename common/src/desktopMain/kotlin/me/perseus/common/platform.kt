package me.perseus.common

import com.ystract.services.YoutubeService

actual fun getPlatformName(): String {
    return "Desktop"
}

actual fun doGood() {
    val list = YoutubeService().fromPlaylist("OLAK5uy_krx7gQcGv4WVzMCNnomWxtXIdp1IWen68")
    list.forEach {
        println(it.file())
    }
}