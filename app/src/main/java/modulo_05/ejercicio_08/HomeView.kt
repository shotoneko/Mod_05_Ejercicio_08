package modulo_05.ejercicio_08


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import mod_05.ejercicio_07.MainTextField
import mod_05.ejercicio_07.MyButton
import mod_05.ejercicio_07.MyText

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(modifier: Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.app_name),
                        color = colorResource(id = R.color.colorOnPrimary),
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()

                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),

                )
        }
    ) {
        ContentHomeView(it)
    }
}


@Composable
fun ContentHomeView(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .padding(10.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var nombre by remember { mutableStateOf("") }
        var mostrarImagen by remember { mutableStateOf(false) }

        MyText(stringResource(id = R.string.welcome))
        Spacer(modifier = Modifier.padding(10.dp))

        MainTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = stringResource(id = R.string.tf_nombre)
        )
        Spacer(modifier = Modifier.padding(10.dp))

        MyButton(
            text = if (mostrarImagen) stringResource(id = R.string.btn_ocultar)
            else stringResource(id = R.string.btn_mostrar),
            onClick = { mostrarImagen = !mostrarImagen }
        )

        if (mostrarImagen) {
            MySimpleLazyColumn()
        }

    }
}