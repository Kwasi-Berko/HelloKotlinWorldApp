package com.example.helloandroidworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helloandroidworld.ui.theme.HelloAndroidWorldTheme
import java.security.spec.EllipticCurve

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloAndroidWorldTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    // the surface container is used here to select a background color with the color parameter
    Surface(color = Color.Cyan) {

        // using the font style and font Weight to modifier the text style along with the use of the padding modifier to create a padding of 24dp space around the text
        Text(text = "Hi, my name is $name!", modifier = Modifier.padding(all = 24.dp) ,fontStyle = FontStyle.Italic, fontWeight = FontWeight(800))

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloAndroidWorldTheme {
        Greeting("Kwasi")
    }
}