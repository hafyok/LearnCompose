package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())){
                ListItem(name = "Saitama", prof = "Hero")
                ListItem(name = "Genos", prof = "Hero")
                ListItem(name = "Bang", prof = "Hero")
                ListItem(name = "Boros", prof = "Alien")
                ListItem(name = "Tatsumaki", prof = "Hero")
                ListItem(name = "Sonic", prof = "Killer")
                ListItem(name = "Saitama", prof = "Hero")
                ListItem(name = "Saitama", prof = "Hero")
                ListItem(name = "Saitama", prof = "Hero")
                ListItem(name = "Saitama", prof = "Hero")
                ListItem(name = "Saitama", prof = "Hero")
                ListItem(name = "Saitama", prof = "Hero")
                ListItem(name = "Saitama", prof = "Hero")
                ListItem(name = "Saitama", prof = "Hero")
            }
        }
    }
}

@Composable
private fun ListItem(name: String, prof: String){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .pointerInput(Unit) {
              detectHorizontalDragGestures { change, dragAmount ->
                  Log.d("MyLog", "Long press $dragAmount")
              }
            },
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ){
        Box(){
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.saitama),
                    contentDescription = "text",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(modifier = Modifier.padding(start = 16.dp)) {
                    Text(text = name)
                    Text(text = prof)
                }
            }
        }
    }
}