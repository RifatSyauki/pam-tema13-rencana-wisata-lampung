package org.pam_tema13_rencana_wisata_lampung.project

class JVMPlatform: Platform {
    override val name: String = "Desktop (Java ${System.getProperty("java.version")})"
}

actual fun getPlatform(): Platform = JVMPlatform()
