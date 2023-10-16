package com.chaitanya.composeintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chaitanya.composeintro.ui.theme.ComposeIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeIntroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    GreetingImage(message = stringResource(R.string.happy_birthday_android), from = "Chaitanya")
//                    ExerciseScreen()
//                    TaskCompleted()
//                    ComposeQuadrant()
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFB7F1D1))
            .padding(98.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        val image = painterResource(id = R.drawable.android_logo)
        Box(modifier = modifier.background(Color.Black)){
            Image(
                painter = image,
                contentDescription = "Image"
            )
        }

        Text(
            text = "Chaitanya",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp),
        )
        Text(
            text = "Nice Work",
            fontSize = 16.sp
        )

    }
    Column(modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
        ){
        Column(
            modifier = modifier.padding(16.dp)
        ) {
            CardBottom(icon = painterResource(id = R.drawable.ic_call_24), text = "+911234567890")
            CardBottom(icon = painterResource(id = R.drawable.ic_share_24), text = "@AndroidDev")
            CardBottom(icon = painterResource(id = R.drawable.ic_email_24), text = "androiddev@gmail.com")
        }
    }


}

@Composable
fun CardBottom(icon: Painter,text : String, modifier: Modifier = Modifier){
    Row(
        modifier = modifier.padding(8.dp)
    ) {
        Icon(painter = icon, contentDescription = "icon")
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .padding(start = 8.dp)
                .wrapContentWidth()
        )
    }

}



@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
    ) {
        Column(
            modifier = modifier.weight(1f)
        ){
            Column(
                modifier = modifier
                    .weight(1f)
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Text composable",
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .padding( bottom = 16.dp)
                )
                Text(
                    text = "Displays text and follows the recommended Material Design guidelines.\n",
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                modifier = modifier
                    .weight(1f)
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Row composable",
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .padding( bottom = 16.dp)
                )
                Text(
                    text = "A layout composable that places its children in a horizontal sequence.",
                    textAlign = TextAlign.Justify
                )
            }

        }
        Column(
            modifier = modifier.weight(1f)
        ) {
            Column(
                modifier = modifier
                    .weight(1f)
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Image composable",
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .padding( bottom = 16.dp)
                )
                Text(
                    text = "Creates a composable that lays out and draws a given Painter class object.",
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                modifier = modifier
                    .weight(1f)
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Column composable",
                    fontWeight = FontWeight.Bold,
                    modifier = modifier
                        .padding( bottom = 16.dp)
                )
                Text(
                    text = "A layout composable that places its children in a vertical sequence.",
                    textAlign = TextAlign.Justify
                )
            }
        }

    }
}

@Composable
fun TaskCompleted(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        val image = painterResource(id = R.drawable.ic_task_completed)
        Image(
            painter = image,
            contentDescription = "Image"
        )
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = "Nice Work",
            fontSize = 16.sp
        )

    }
}

@Composable
fun ExerciseScreen(modifier: Modifier = Modifier){
    Column (
        modifier = modifier,

    ){
        val image = painterResource(id = R.drawable.bg_compose_background)
        Image(
            painter = image,
            contentDescription = "Image",
            modifier = modifier.fillMaxWidth()
        )
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
            )
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            modifier = modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }

}

@Composable
fun GreetingText(message : String,from: String,modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "from $from",
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
                .background(Color.Blue)
        )
    }
}
@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = "image",
            contentScale = ContentScale.Crop,
            alpha = 0.5F,
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        )
    }

}

@Preview(showBackground = false)
@Composable
fun Preview() {
    ComposeIntroTheme {
//        GreetingImage("Happy Birthday Android!", "Chaitanya")
//        ExerciseScreen()
//        TaskCompleted()
//        ComposeQuadrant()
        BusinessCard()
    }

}
