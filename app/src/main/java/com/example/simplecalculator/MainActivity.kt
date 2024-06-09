package com.example.simplecalculator

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.simplecalculator.ui.theme.SimpleCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var num1 by remember {
                mutableStateOf("0")
            }
            var num2 by remember {
                mutableStateOf("0")
            }
            Column {
                TextField(value = num1, onValueChange = {
                    num1 = it

                })
                TextField(value = num2, onValueChange = {
                    num2 = it
                })
                Button(onClick = {
                    var result = num1.toInt() + num2.toInt()
                    Toast.makeText(applicationContext, "$result", Toast.LENGTH_SHORT).show()
                }) {
                    Text(text = "Add")
                }
                Button(onClick = {
                    var sub = num1.toInt() - num2.toInt()
                    Toast.makeText(applicationContext, "$sub", Toast.LENGTH_SHORT).show()
                }) {
                    Text(text = "subtract")
                }
                Button(onClick = {
                    var div = num1.toInt() / num2.toInt()
                    Toast.makeText(applicationContext, "$div", Toast.LENGTH_SHORT).show()
                }) {
                    Text(text = "divide")
                }
                Button(onClick = {
                    var mul = num1.toInt() * num2.toInt()
                    Toast.makeText(applicationContext, "$mul", Toast.LENGTH_SHORT).show()
                }) {
                    Text(text = "multiply")
                }
            }
        }
    }
}

