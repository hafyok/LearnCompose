package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row (modifier = Modifier
                .background(Color.Gray).fillMaxWidth().fillMaxHeight(0.5f)){
                Column(
                    modifier = Modifier
                        .background(Color.Red).fillMaxWidth(0.5f).fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Chikara ga")
                    Text(text = "minagite")
                    Text(text = "kura")
                }

                Column(
                    modifier = Modifier
                        .background(Color.Blue).fillMaxHeight(0.5f),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.End
                ) {
                    Text(text = "Chikara ga")
                    Text(text = "minagite")
                    Text(text = "kura")
                }
            }


        }
    }
}

