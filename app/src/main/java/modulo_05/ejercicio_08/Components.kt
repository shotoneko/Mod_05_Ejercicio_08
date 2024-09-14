package mod_05.ejercicio_07

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import modulo_05.ejercicio_08.R

@Composable
fun MyText(
	text : String
) {
	Text(
		text = text,
		fontStyle = FontStyle.Italic,
		color = colorResource(id = R.color.colorPrimary),
		fontSize = 30.sp,
		fontWeight = FontWeight.Bold,
		textAlign = TextAlign.Center,
		style = TextStyle(
			lineHeight = 35.0.sp
		)

	)
}
@Composable
fun MainTextField(
	value: String,
	onValueChange: (String) -> Unit,
	label: String
) {
	OutlinedTextField(
		value = value,
		onValueChange = onValueChange,
		label = { Text(text = label) },
		keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
		modifier = Modifier
			.fillMaxWidth()
			.padding(horizontal = 30.dp)
	)
}
@Composable
fun MyButton(
	text: String,
	onClick: () -> Unit

) {
	Button(
		onClick = onClick,
		colors = ButtonDefaults.buttonColors(
			contentColor = Color.White,
			containerColor = colorResource(id = R.color.colorPrimary)
		)
	){
		Text(
			text = text,
			fontSize = 17.sp,
			fontWeight = FontWeight.Bold
		)

	}
}