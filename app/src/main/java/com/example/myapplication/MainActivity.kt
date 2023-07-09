package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn (
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Gray)
            ){
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.saitama, "Saitama", "On the other hand, "+
                                "we denounce with righteous indignation and dislike men who are so "+
                                "beguiled and demoralized by the charms of pleasure of the moment, so"+
                                "blinded by desire, that they cannot foresee the pain and trouble that"+
                                " are bound to ensue; and equal blame belongs to those who fail in their"+
                                "duty through weakness of will, which is the same as saying through "+
                                "shrinking from toil and pain. These cases are perfectly simple and easy"+
                                "to distinguish. In a free hour, when our power of choice is untrammelled"+
                                " and when nothing prevents our being able to do what we like best, every"+
                                " pleasure is to be welcomed and every pain avoided."),
                        ItemRowModel(R.drawable.genos, "Genos", "On the other hand, "+
                            "we denounce with righteous indignation and dislike men who are so "+
                                    "beguiled and demoralized by the charms of pleasure of the moment, so"+
                                    "blinded by desire, that they cannot foresee the pain and trouble that"+
                                    " are bound to ensue; and equal blame belongs to those who fail in their"+
                                    "duty through weakness of will, which is the same as saying through "+
                                    "shrinking from toil and pain. These cases are perfectly simple and easy"+
                                    "to distinguish. In a free hour, when our power of choice is untrammelled"+
                                    " and when nothing prevents our being able to do what we like best, every"+
                                    " pleasure is to be welcomed and every pain avoided."),
                        ItemRowModel(R.drawable.bang, "Bang", "On the other hand, "+
                                "we denounce with righteous indignation and dislike men who are so "+
                                "beguiled and demoralized by the charms of pleasure of the moment, so"+
                                "blinded by desire, that they cannot foresee the pain and trouble that"+
                                " are bound to ensue; and equal blame belongs to those who fail in their"+
                                "duty through weakness of will, which is the same as saying through "+
                                "shrinking from toil and pain. These cases are perfectly simple and easy"+
                                "to distinguish. In a free hour, when our power of choice is untrammelled"+
                                " and when nothing prevents our being able to do what we like best, every"+
                                " pleasure is to be welcomed and every pain avoided."),
                        ItemRowModel(R.drawable.sonic, "Sonic", "On the other hand, "+
                                "we denounce with righteous indignation and dislike men who are so "+
                                "beguiled and demoralized by the charms of pleasure of the moment, so"+
                                "blinded by desire, that they cannot foresee the pain and trouble that"+
                                " are bound to ensue; and equal blame belongs to those who fail in their"+
                                "duty through weakness of will, which is the same as saying through "+
                                "shrinking from toil and pain. These cases are perfectly simple and easy"+
                                "to distinguish. In a free hour, when our power of choice is untrammelled"+
                                " and when nothing prevents our being able to do what we like best, every"+
                                " pleasure is to be welcomed and every pain avoided."),
                        ItemRowModel(R.drawable.king, "King", "On the other hand, "+
                                "we denounce with righteous indignation and dislike men who are so "+
                                "beguiled and demoralized by the charms of pleasure of the moment, so"+
                                "blinded by desire, that they cannot foresee the pain and trouble that"+
                                " are bound to ensue; and equal blame belongs to those who fail in their"+
                                "duty through weakness of will, which is the same as saying through "+
                                "shrinking from toil and pain. These cases are perfectly simple and easy"+
                                "to distinguish. In a free hour, when our power of choice is untrammelled"+
                                " and when nothing prevents our being able to do what we like best, every"+
                                " pleasure is to be welcomed and every pain avoided."),
                        ItemRowModel(R.drawable.garou, "Garou", "On the other hand, "+
                                "we denounce with righteous indignation and dislike men who are so "+
                                "beguiled and demoralized by the charms of pleasure of the moment, so"+
                                "blinded by desire, that they cannot foresee the pain and trouble that"+
                                " are bound to ensue; and equal blame belongs to those who fail in their"+
                                "duty through weakness of will, which is the same as saying through "+
                                "shrinking from toil and pain. These cases are perfectly simple and easy"+
                                "to distinguish. In a free hour, when our power of choice is untrammelled"+
                                " and when nothing prevents our being able to do what we like best, every"+
                                " pleasure is to be welcomed and every pain avoided."),
                        )
                ){_, item ->
                    ItemRow(item = item)
                }
            }
        }
    }
}
