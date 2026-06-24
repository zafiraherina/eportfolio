package com.example.a212708_zafiraherina_drnazatulaini_lab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TerraHomeScreen()
        }
    }

}

@Composable
fun TerraHomeScreen() {

    var searchText by remember { mutableStateOf("") }
    var displayText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE8F5E9))
            .padding(16.dp)
    ) {

        // HEADER
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "Terra",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2E7D32)
            )

            Image(
                painter = painterResource(id = R.drawable.ic_profile),
                contentDescription = "Profile",
                modifier = Modifier.size(32.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // SEARCH FIELD
        Column {

            Text(
                text = "Search",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(8.dp))

            BasicTextField(
                value = searchText,
                onValueChange = { searchText = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(12.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                displayText = searchText
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Search")
        }

        Spacer(modifier = Modifier.height(12.dp))


        Text(
            text = displayText,
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        // IMPACT SECTION
        Column {

            Text(
                text = "Your Impact",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1B5E20)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "🌳 128 Trees Planted", fontSize = 16.sp)
            Text(text = "🌍 320 kg CO₂ Reduced", fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(20.dp))

        // QUICK ACTIONS
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            QuickActionItem(R.drawable.ic_forest, "Forest")
            QuickActionItem(R.drawable.ic_animal, "Wildlife")
            QuickActionItem(R.drawable.ic_tips, "Tips")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Donate to Plant Trees")
        }

        Spacer(modifier = Modifier.height(20.dp))

        // BANNER
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.forest_banner),
                contentDescription = "Forest",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            Text(
                text = "Protect Life on Land",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(16.dp)
            )
        }
    }

}

@Composable
fun QuickActionItem(icon: Int, label: String) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = icon),
            contentDescription = label,
            modifier = Modifier.size(40.dp)
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = label,
            fontSize = 14.sp
        )
    }

}

@Preview(showBackground = true)
@Composable
fun Preview() {
    TerraHomeScreen()
}