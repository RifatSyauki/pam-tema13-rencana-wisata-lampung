package org.pam_tema13_rencana_wisata_lampung.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.surface)
                .safeContentPadding()
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            Text(
                text = "RENCANA PERJALANAN",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.primary,
            )
            Text(
                text = "Rencana Wisata Lampung",
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Jelajahi keindahan Lampung dan rencanakan perjalananmu.",
                style = MaterialTheme.typography.bodyLarge,
            )
            Surface(
                shape = MaterialTheme.shapes.medium,
                color = MaterialTheme.colorScheme.secondaryContainer,
            ) {
                Text(
                    text = "Platform: ${getPlatform().name}",
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp),
                    style = MaterialTheme.typography.labelLarge,
                )
            }
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    Text("Tentang", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.SemiBold)
                    Text("Anggota kelompok", style = MaterialTheme.typography.labelLarge)

                    Text("Syuhada Rantisi (Ketua)", style = MaterialTheme.typography.bodyLarge)
                    Text("NIM: 122140092", style = MaterialTheme.typography.bodyMedium)

                    Text("M. Rif'at Syauki", style = MaterialTheme.typography.bodyLarge)
                    Text("NIM: 124140138", style = MaterialTheme.typography.bodyMedium)

                    Text("Akhdan Arif Prayoga", style = MaterialTheme.typography.bodyLarge)
                    Text("NIM: 122140099", style = MaterialTheme.typography.bodyMedium)
                }
            }
        }
    }
}
