package br.com.renanalencar.detectoropener

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AppLauncher(onLaunchClick: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = onLaunchClick,
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Abrir App Externo")
        }
    }
}
