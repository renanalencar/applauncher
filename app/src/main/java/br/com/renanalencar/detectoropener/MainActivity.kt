package br.com.renanalencar.detectoropener

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.renanalencar.detectoropener.ui.theme.DetectorOpenerTheme

class MainActivity : ComponentActivity() {
    private val targetPackageName = "br.com.renanalencar.detectlauncher"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DetectorOpenerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppLauncher(
                        onLaunchClick = { openOtherApp() }
                    )
                }
            }
        }
    }

    private fun openOtherApp() {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            setPackage(targetPackageName)
            putExtra("originName", "br.com.renanalencar.detectoropener")
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
        }
        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(this, "Erro ao abrir o app", Toast.LENGTH_LONG).show()
        }
    }
}
