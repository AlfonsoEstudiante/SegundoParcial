package com.example.segundoparcial_22180.Views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.segundoparcial_22180.ViewModels.InfoPersonajes
import com.example.segundoparcial_22180.R

@Composable
fun ElijePersonaje(navController: NavHostController) {

    val GamesViewModel = InfoPersonajes()

    Column (modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),) {

        Spacer(modifier = Modifier.height(10.dp))

        LazyColumn {
            items(GamesViewModel.getInfoPersonajes()) {

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview_List() {
    ElijePersonaje(navController = rememberNavController())
}