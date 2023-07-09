package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRow (
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Gray)
            ){
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.saitama, "Saitama"),
                        ItemRowModel(R.drawable.genos, "Genos"),
                        ItemRowModel(R.drawable.bang, "Bang"),
                        ItemRowModel(R.drawable.sonic, "Sonic"),
                        ItemRowModel(R.drawable.king, "King"),
                        ItemRowModel(R.drawable.garou, "Garou")
                        )
                ){_, item ->
                    ItemRow(item = item)
                }
            }
        }
    }
}
//LazyRow то же, что и LazyColumn, но соответственно в строку, а не столбец
