package org.pam_tema13_rencana_wisata_lampung.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform