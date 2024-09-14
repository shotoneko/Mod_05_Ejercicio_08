package modulo_05.ejercicio_08

import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import modulo_05.ejercicio_08.model.Book


@Composable
fun MySimpleLazyColumn() {
    LazyColumn {
        items(getBooks()) { book ->
            CardBook(book = book)
        }
    }
}

@Composable
fun CardBook(book: Book) {
    Card(
        border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier
            .width(200.dp)
            .padding(10.dp)
    ) {
        Row() {
            Image(
                painter = painterResource(id = book.imageRes),
                contentDescription = stringResource(id = R.string.image_description),
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = book.title)
                Text(text = book.author)
                Text(text = book.year.toString())
            }

        }

    }
}

fun getBooks(): List<Book> {
    return listOf(
        Book(
            title = "Advanced Architecture Android",
            author = "Alejandro III",
            year = 1890,
            imageRes = R.drawable.advanced_architecture_android
        ),
        Book(
            title = "Kotlin Apprentice",
            author = "Catalina la Grande",
            year = 1720,
            imageRes = R.drawable.kotlin_aprentice
        ),
        Book(
            title = "Kotlin Coroutines",
            author = "Boris Yeslsin",
            year = 1992,
            imageRes = R.drawable.kotlin_coroutines
        ),
        Book(
            title = "Combine Asynchronous Programming with Swift",
            author = "Vladimir Putin",
            year = 2021,
            imageRes = R.drawable.combine
        ),
        Book(
            title = "Core Data With by Tutorials",
            author = "Pedro el Grande",
            year = 1670,
            imageRes = R.drawable.core_data
        ),
        Book(
            title = "Ios Apprentice",
            author = "Nicolas II",
            year = 1917,
            imageRes = R.drawable.ios_apprentice
        )

    )
}

