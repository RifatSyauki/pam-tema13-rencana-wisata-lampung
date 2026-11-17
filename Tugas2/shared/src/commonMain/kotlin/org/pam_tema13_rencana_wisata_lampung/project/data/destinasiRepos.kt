package org.pam_tema13_rencana_wisata_lampung.project.data

import kotlinx.coroutines.delay
import org.pam_tema13_rencana_wisata_lampung.project.model.DestinasiWisata
import org.pam_tema13_rencana_wisata_lampung.project.data.DummyData

class DestinasiRepos {
    suspend fun getDestinasi(): List<DestinasiWisata>{
        delay(2000)
        return DummyData.daftarDestinasi
    }
}