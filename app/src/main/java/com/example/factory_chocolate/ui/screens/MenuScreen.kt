package com.example.factory_chocolate.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.factory_chocolate.ui.theme.Purple40
import com.example.factory_chocolate.ui.theme.Purple80

@Composable
fun MenuScreen(){

    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()
        .background(Purple80).verticalScroll(scrollState)

    ) {
        Column(modifier = Modifier
            .align(alignment = Alignment.CenterHorizontally)
            .padding(top = 30.dp, bottom = 30.dp)
        ) {
            Text(text = "Chocolate factory",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Purple40)
        }

        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly)
        {
            Text(modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                .padding(bottom = 20.dp
                ),
                text = "Customer menu",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Purple40
            )
            Column(modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(bottom = 15.dp)
            ) {
                Button(modifier = Modifier.fillMaxWidth(0.7f).height(40.dp),
                    onClick = {

                    }) {
                    Text(text = "Create customer", color = Purple80, fontSize = 17.sp)
                }
            }

            Column(modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(bottom = 15.dp)
            ) {
                Button(modifier = Modifier.fillMaxWidth(0.7f).height(40.dp),
                    onClick = {

                    }) {
                    Text(text = "List customers", color = Purple80, fontSize = 17.sp)
                }
            }

            Column(modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(bottom = 15.dp)
            ) {
                Button(modifier = Modifier.fillMaxWidth(0.7f).height(40.dp),
                    onClick = {

                    }) {
                    Text(text = "Update customer", color = Purple80, fontSize = 17.sp)
                }
            }

            Column(modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(bottom = 20.dp)
            ) {
                Button(modifier = Modifier.fillMaxWidth(0.7f).height(40.dp),
                    onClick = {

                    }) {
                    Text(text = "Remove customer", color = Purple80, fontSize = 17.sp)
                }
            }
            Text(modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                .padding(bottom = 20.dp),
                text = "Chocolate menu", fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Purple40
            )

            Column(modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(bottom = 20.dp)
            ) {
                Button(modifier = Modifier.fillMaxWidth(0.7f).height(40.dp),
                    onClick = {

                    }) {
                    Text(text = "Create chocolate", color = Purple80, fontSize = 17.sp)
                }
            }

            Column(modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(bottom = 20.dp)
            ) {
                Button(modifier = Modifier.fillMaxWidth(0.7f).height(40.dp),
                    onClick = {

                    }) {
                    Text(text = "List chocolates", color = Purple80, fontSize = 17.sp)
                }
            }

            Column(modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(bottom = 20.dp)
            ) {
                Button(modifier = Modifier.fillMaxWidth(0.7f).height(40.dp),
                    onClick = {

                    }) {
                    Text(text = "Update chocolate", color = Purple80, fontSize = 17.sp)
                }
            }

            Column(modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(bottom = 20.dp)
            ) {
                Button(modifier = Modifier.fillMaxWidth(0.7f).height(40.dp),
                    onClick = {

                    }) {
                    Text(text = "Remove chocolate", color = Purple80, fontSize = 17.sp)
                }
            }
        }
    }
}

@Preview
@Composable
private fun MenuScreenPreview(){
    MenuScreen()
}