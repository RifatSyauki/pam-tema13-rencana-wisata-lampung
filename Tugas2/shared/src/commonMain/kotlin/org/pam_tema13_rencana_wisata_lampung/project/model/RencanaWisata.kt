package org.pam_tema13_rencana_wisata_lampung.project.model

sealed class StatusRencana {
    data object Direncanakan : StatusRencana()
    data object Berlangsung : StatusRencana()
    data object Selesai : StatusRencana()
}

data class RencanaWisata(
    val id: Int,
    val judul: String,
    val tanggal: String,
    val destinasi: DestinasiWisata,
    val catatan: String? = null,
    val status: StatusRencana = StatusRencana.Direncanakan,
)
