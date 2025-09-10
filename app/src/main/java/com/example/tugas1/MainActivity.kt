package com.example.tugas1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugas1.ui.theme.Tugas1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tugas1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun GreetingApp(modifier: Modifier = Modifier) {
    val namaMahasiswa = "Rifqi Cahyono"
    var message by remember { mutableStateOf("Tekan tombol di sini") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = message)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            message = "Halo $namaMahasiswa"
        }) {
            Text("Tekan")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tugas1Theme {
        GreetingApp()
    }
}
