package org.pam_tema13_rencana_wisata_lampung.project

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Rencana Wisata Lampung",
    ) {
        App()
    }
}
