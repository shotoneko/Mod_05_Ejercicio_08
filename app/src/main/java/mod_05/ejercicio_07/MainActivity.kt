package mod_05.ejercicio_07

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
import mod_05.ejercicio_07.screens.HomeView
import mod_05.ejercicio_07.ui.theme.Ejercicio_07Theme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			Ejercicio_07Theme {
				Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
					HomeView(modifier = Modifier.padding(innerPadding))
				}
			}
		}
	}
}
