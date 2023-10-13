package com.my.greetingcard3.android

import android.icu.text.DisplayContext
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.my.greetingcard3.Greeting

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color



class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView( R.layout.layout_splash_start )
        val content2 = contentResolver;
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        button1.text = "Sedaj gumb A"
        button2.text = "Sedaj gumb B"


/*
        setContent {
            MyApplicationTheme {
                Surface ( //true, onClick = (" ") -> { Unit }
                    modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray //MaterialTheme.colors.background
                ) {

                    var phrases by remember {
                        mutableStateOf(
                            listOf(
                                "Loading",
                                "Hello World App"
                            )
                        )
                    }

                    GreetingView(phrases)
                }
            }
*/

//            v: View = Inflater.inflate(R.layout.layout_splash_start)


        }
}

@Composable
fun GreetingView(phrases: List<String>) {
    LazyColumn(
        contentPadding = PaddingValues(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(phrases) {
            phrase ->
            Text(phrase)
            Divider()
            Button(onClick = {  /*TODO*/ }) {
                Text("Gumb1")
            }
            Divider()
        }
    }
}

@Preview (showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView(listOf("Hello, Android!"))
    }
}
