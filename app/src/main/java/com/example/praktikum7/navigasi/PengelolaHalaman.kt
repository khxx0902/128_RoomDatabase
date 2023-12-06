package com.example.praktikum7.navigasi

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun SiswaApp(navController: NavHostController= rememberNavController()){
    HostNavigasi(navController = navController)
}

