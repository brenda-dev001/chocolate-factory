package com.example.factory_chocolate.ui.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.factory_chocolate.ui.screens.MenuScreen
import com.example.factory_chocolate.ui.screens.chocolate.CreateChocolateScreen
import com.example.factory_chocolate.ui.screens.chocolate.ListChocolatesScreen
import com.example.factory_chocolate.ui.screens.customer.CreateCustomerScreen
import com.example.factory_chocolate.ui.screens.customer.DeleteCustomerScreen
import com.example.factory_chocolate.ui.screens.customer.ListCustomersScreen
import com.example.factory_chocolate.ui.screens.customer.UpdateCustomerScreen

@Composable
fun AppNavegation(){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ){
        composable (Routes.HOME){
            MenuScreen(
                onCreateCustomerClick = {
                    navController.navigate(Routes.CREATE_CUSTOMER)
                },
                onListCustomerClick = {
                    navController.navigate(Routes.LIST_CUSTOMERS)
                },
                onUpdateCustomerClick = {
                    navController.navigate(Routes.UPDATE_CUSTOMER)
                },
                onDeleteCustomerClick = {
                    navController.navigate(Routes.DELETE_CUSTOMER)
                },
                onCreateChocolateClick = {
                    navController.navigate(Routes.CREATE_CHOCOLATE)
                },
                onListChocolatesClick = {
                    navController.navigate(Routes.LIST_CHOCOLATES)
                },
                onUpdateChocolateClick = {
                    navController.navigate(Routes.UPDATE_CHOCOLATE)
                }
            )
        }

        composable (Routes.CREATE_CUSTOMER){
            CreateCustomerScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable(Routes.LIST_CUSTOMERS){
            ListCustomersScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable(Routes.UPDATE_CUSTOMER){
            UpdateCustomerScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable(Routes.DELETE_CUSTOMER){
            DeleteCustomerScreen(onBackClick = {
                navController.popBackStack()
            })
        }

        composable(Routes.CREATE_CHOCOLATE){
            CreateChocolateScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable(Routes.LIST_CHOCOLATES){
            ListChocolatesScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable(Routes.UPDATE_CHOCOLATE){
            UpdateCustomerScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

    }
}