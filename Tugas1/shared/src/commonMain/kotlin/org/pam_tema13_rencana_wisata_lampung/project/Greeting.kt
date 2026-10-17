package org.pam_tema13_rencana_wisata_lampung.project

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return sayHello(platform.name)
    }
}