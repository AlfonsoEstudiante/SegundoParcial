package com.example.segundoparcial_22180.Views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.segundoparcial_22180.Models.Personaje

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardPersonajes(navController: NavHostController, person: Personaje, color: Color) {

    Card(
        colors = CardDefaults.cardColors(containerColor = color),
        onClick = {
            navController.navigate("InfoPersonajes" +
            "/")
        }){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 20.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = person.),
                contentDescription = "AlumnPic",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(100.dp)
            )

            Spacer(modifier = Modifier.width(18.dp))

            Column {
                Text(
                    text = "${alumn.id} | ${alumn.name}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = alumn.mail,
                    color = Color(0xFFD4A73C),
                    fontSize = 11.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = alumn.career,
                    fontSize = 11.sp
                )
            }
        }
    }
}