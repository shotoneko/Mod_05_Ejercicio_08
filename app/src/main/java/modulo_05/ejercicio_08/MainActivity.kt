package modulo_05.ejercicio_08

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import modulo_05.ejercicio_08.ui.theme.Ejercicio_08Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio_08Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeView(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

