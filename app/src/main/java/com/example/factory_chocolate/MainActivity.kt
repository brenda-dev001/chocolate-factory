package com.example.factory_chocolate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.factory_chocolate.data.database.DataBaseHelper
import com.example.factory_chocolate.ui.navegation.AppNavegation
import com.example.factory_chocolate.ui.screens.customer.CreateCustomerScreen
import com.example.factory_chocolate.ui.screens.customer.DeleteCustomerScreen
import com.example.factory_chocolate.ui.screens.customer.ListCustomersScreen
import com.example.factory_chocolate.ui.screens.MenuScreen
import com.example.factory_chocolate.ui.screens.customer.UpdateCustomerScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val db = DataBaseHelper(this)

        setContent {
            AppNavegation(db)
        }
    }
}

