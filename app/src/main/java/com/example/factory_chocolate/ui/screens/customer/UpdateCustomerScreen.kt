package com.example.factory_chocolate.ui.screens.customer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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

@Composable
fun UpdateCustomerScreen(
    onBackClick: () -> Unit
){

    var cpf by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }

    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()
        .background(color = Purple80)
        .verticalScroll(scrollState)
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
                text = "Update customer",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Purple40,
                modifier = Modifier.align(Alignment.Center)
            )
        }

        Column(modifier = Modifier.fillMaxWidth()
            .padding(start = 24.dp, 20.dp, bottom = 10.dp),
        ) {
            Text(
                text = "Enter the customer's CPF.",
                fontSize = 17.sp,
                color = Purple40
            )
        }
        Box(modifier = Modifier.fillMaxWidth()
            .fillMaxHeight()
            .padding(start = 30.dp, end = 5.dp),
            contentAlignment = Alignment.Center
        ) {
            OutlinedTextField(modifier = Modifier.fillMaxWidth(0.7f)
                .height(58.dp)
                .padding(3.dp)
                .align(Alignment.CenterStart),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Purple90,
                    unfocusedBorderColor = Color.Transparent,
                    focusedBorderColor = Purple40,
                    unfocusedPlaceholderColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                value = cpf,
                onValueChange = {cpf = it},
                placeholder = {Text(text = "CPF")},
            )

            Button(modifier = Modifier.align(Alignment.CenterEnd),
                onClick = {}
            ) {
                Text(text = "Search")
            }
        }
        Column(modifier = Modifier.fillMaxWidth()
            .padding(20.dp)
        ) {
            Text(modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                text = "Enter the changes. Leave the fields that will not be changed blank.",
                fontSize = 17.sp,
                color = Purple40
            )
        }

        Column(modifier = Modifier.fillMaxWidth()
            .fillMaxHeight()
            .padding(10.dp),
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
                value = name,
                onValueChange = {name = it},
                placeholder = {Text(text = "Name")},
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
                value = email,
                onValueChange = {email = it},
                placeholder = {Text(text = "Email")},
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
                value = phone,
                onValueChange = {phone = it},
                placeholder = {Text(text = "Phone")},
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
                value = age,
                onValueChange = {age = it},
                placeholder = {Text(text = "Age")},
            )

            Button(modifier = Modifier.align(alignment = Alignment.End)
                ,onClick = {}) {
                Text(text = "Update")
            }
        }
    }
}

@Preview
@Composable
private fun PreviewUpdateCustomerScreen(){
    UpdateCustomerScreen(onBackClick = {})
}

