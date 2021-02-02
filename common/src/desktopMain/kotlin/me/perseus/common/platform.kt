package me.perseus.common

import com.ystract.services.YoutubeService

actual fun getPlatformName(): String {
    return "Desktop"
}

actual fun doGood() {
    YoutubeService().fromPlaylistAsync("OLAK5uy_krx7gQcGv4WVzMCNnomWxtXIdp1IWen68")?.thenApply { list ->
        list.forEach {
            println(it.file())
        }
    }
}