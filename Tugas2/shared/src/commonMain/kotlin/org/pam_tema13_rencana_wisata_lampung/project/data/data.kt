package org.pam_tema13_rencana_wisata_lampung.project.data
import org.pam_tema13_rencana_wisata_lampung.project.model.DestinasiWisata
import org.pam_tema13_rencana_wisata_lampung.project.model.RencanaWisata
import org.pam_tema13_rencana_wisata_lampung.project.model.StatusRencana

object DummyData{
    val daftarDestinasi = listOf(
        DestinasiWisata(
            id = 1,
            namaLokasi = "Pantai Tanjung Setia",
            deskripsi = "Pantai dengan ombak besar yang terkenal " +
                    "sebagai destinasi surfing di Lampung Barat.",
            fotoUrl = null
        ),

        DestinasiWisata(
            id = 2,
            namaLokasi = "Pulau Pahawang",
            deskripsi = "Pulau dengan keindahan bawah laut, " +
                    "terumbu karang, dan aktivitas snorkeling.",
            fotoUrl = null
        ),

        DestinasiWisata(
            id = 3,
            namaLokasi = "Taman Nasional Way Kambas",
            deskripsi = "Kawasan konservasi gajah Sumatera " +
                    "dan berbagai satwa liar lainnya.",
            fotoUrl = null
        ),
    )

    val daftarRencana = listOf(
        RencanaWisata(
            id = 1,
            judul = "Liburan ke Way Kambas.",
            tanggal = "2026-12-10",
            destinasi = daftarDestinasi[3],
            catatan = "-",
            status = StatusRencana.Berlangsung
        ),

        RencanaWisata(
            id = 2,
            judul = "Snorkeling ke Pulau Pahawang.",
            tanggal = "2026-12-15",
            destinasi = daftarDestinasi[2],
            catatan = "Jangan lupa beli alat snorkeling.",
            status = StatusRencana.Direncanakan
        ),

        RencanaWisata(
            id = 3,
            judul = "Liburan ke Pantai Tanjung Setia.",
            tanggal = "2025-06-09",
            destinasi = daftarDestinasi[1],
            catatan = "Jangan lupa bawa tikar.",
            status = StatusRencana.Selesai
        )
    )
}