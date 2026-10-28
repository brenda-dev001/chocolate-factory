package com.example.factory_chocolate.ui.screens.chocolate

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonColors
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.factory_chocolate.ui.theme.Purple40
import com.example.factory_chocolate.ui.theme.Purple80
import com.example.factory_chocolate.ui.theme.Purple90
import org.w3c.dom.Text

@Composable
fun CreateChocolateScreen(
    onBackClick: () -> Unit
){

    var id by remember { mutableStateOf("") }
    var cocoa by remember { mutableStateOf("") }
    var value by remember { mutableStateOf("") }
    var customerCpf by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    val radioOptions = listOf("White", "Milk", "Mixed")
    var selectedOption by remember { mutableStateOf("Black") }
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()
        .background(color = Purple80).verticalScroll(scrollState)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(10.dp),
            contentAlignment = Alignment.Center
        ) {
            Button(
                onClick = {onBackClick()},
                modifier = Modifier.align(Alignment.CenterStart).size(48.dp),
                shape = CircleShape,
                contentPadding = PaddingValues(0.dp)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Go back",
                    tint = Purple80
                )
            }

            Text(
                text = "Create Chocolate",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Purple40,
                modifier = Modifier.align(Alignment.Center)
            )
        }

        Column(modifier = Modifier.fillMaxWidth()
            .padding(20.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                text = "Enter the chocolate's information.",
                fontSize = 17.sp,
                color = Purple40
            )
        }
        Column(modifier = Modifier.fillMaxWidth()
            .fillMaxHeight()
            .padding(20.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(modifier = Modifier.fillMaxWidth(0.9f)
                .height(58.dp)
                .padding(3.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Purple90,
                    unfocusedBorderColor = Color.Transparent,
                    focusedBorderColor = Purple40,
                    unfocusedPlaceholderColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                value = id,
                onValueChange = {id = it},
                placeholder = {Text(text = "ID")},
            )

            OutlinedTextField(modifier = Modifier.fillMaxWidth(0.9f)
                .height(58.dp)
                .padding(3.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Purple90,
                    unfocusedBorderColor = Color.Transparent,
                    focusedBorderColor = Purple40,
                    unfocusedPlaceholderColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                value = cocoa,
                onValueChange = {cocoa = it},
                placeholder = {Text(text = "Cocoa")},
            )

            OutlinedTextField(modifier = Modifier.fillMaxWidth(0.9f)
                .height(58.dp)
                .padding(3.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Purple90,
                    unfocusedBorderColor = Color.Transparent,
                    focusedBorderColor = Purple40,
                    unfocusedPlaceholderColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                value = value,
                onValueChange = {value = it},
                placeholder = {Text(text = "Value")},
            )

            OutlinedTextField(modifier = Modifier.fillMaxWidth(0.9f)
                .height(58.dp)
                .padding(3.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Purple90,
                    unfocusedBorderColor = Color.Transparent,
                    focusedBorderColor = Purple40,
                    unfocusedPlaceholderColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                value = customerCpf,
                onValueChange = {customerCpf = it},
                placeholder = {Text(text = "Customer cpf")},
            )

            Column(modifier = Modifier.fillMaxWidth(0.9f)
                .padding(10.dp),
                verticalArrangement = Arrangement.Center
            )
            {
                Text(modifier = Modifier.align(alignment = Alignment.Start),
                    text = "Enter the chocolate's information.",
                    fontSize = 16.sp,
                    color = Purple40
                )
            }

            Row(modifier = Modifier.fillMaxWidth(0.9f),
                horizontalArrangement = Arrangement.SpaceAround) {
                radioOptions.forEach { text ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = selectedOption == text,
                            onClick = {selectedOption = text},
                            colors = RadioButtonDefaults.colors(
                                selectedColor = Purple40,
                                unselectedColor = Purple40
                            )
                        )
                        Text(text = text, color = Purple40)
                    }
                }
            }

            Button(modifier = Modifier.align(alignment = Alignment.End)
                ,onClick = {}) {
                Text(text = "Create")
            }
        }
    }
}

@Preview
@Composable
private fun PreviewCreateChococolateScreen(){
    CreateChocolateScreen(onBackClick = {})
}