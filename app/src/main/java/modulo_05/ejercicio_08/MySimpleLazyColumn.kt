package modulo_05.ejercicio_08


import android.text.Layout
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import modulo_05.ejercicio_08.model.Book
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

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
    val bookTitleStyle = TextStyle(
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 20.sp,
    )

    Card(
        border = BorderStroke(1.dp, Color.Black), modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Column() {
            Row() {
                Image(
                    painter = painterResource(id = book.imageRes),
                    contentDescription = stringResource(id = R.string.image_description),
                    modifier = Modifier
                        .size(170.dp, 200.dp)
                        .padding(5.dp),
                    contentScale = ContentScale.Fit
                )

                ConstraintLayout(
                    modifier = Modifier.fillMaxSize()
                ) {
                    val (titulo, autor, año, divider) = createRefs()


                    Text(
                        text = book.title,
                        textAlign = TextAlign.Center,
                        style = bookTitleStyle,
                        modifier = Modifier.constrainAs(titulo) {
                            centerHorizontallyTo(parent)

                        }
                    )
                    HorizontalDivider(
                        color = Color.Black,
                        thickness = 1.dp,
                        modifier = Modifier
                            .constrainAs(divider) {
                                top.linkTo(titulo.bottom, margin = 4.dp)
                            })
                    Text(
                        text = "Author: ${book.author}",
                        modifier = Modifier.constrainAs(autor) {
                            top.linkTo(titulo.bottom, margin = 5.dp)
                        },
                        fontSize = 12.sp
                    )

                    Text(
                        text = "Year published: ${book.year.toString()}",
                        modifier = Modifier.constrainAs(año) {
                            top.linkTo(autor.bottom, margin = 110.dp)
                            end.linkTo(parent.end, margin = 4.dp)

                        },
                        fontSize = 10.sp
                    )


                }

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
        ), Book(
            title = "Kotlin Apprentice",
            author = "Catalina la Grande",
            year = 1720,
            imageRes = R.drawable.kotlin_aprentice
        ), Book(
            title = "Kotlin Coroutines",
            author = "Boris Yeltsin",
            year = 1992,
            imageRes = R.drawable.kotlin_coroutines
        ), Book(
            title = "Combine Asynchronous Programming with Swift",
            author = "Vladimir Putin",
            year = 2021,
            imageRes = R.drawable.combine
        ), Book(
            title = "Core Data With by Tutorials",
            author = "Pedro el Grande",
            year = 1670,
            imageRes = R.drawable.core_data
        ), Book(
            title = "Ios Apprentice",
            author = "Nicolas II",
            year = 1917,
            imageRes = R.drawable.ios_apprentice
        )

    )
}

