package com.swancodes.fragmentnote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHost =
            supportFragmentManager.findFragmentById(R.id.navHost_fragment) as NavHostFragment
        val navCon = navHost.navController
        appBarConfiguration = AppBarConfiguration(navCon.graph)
        setupActionBarWithNavController(navCon, appBarConfiguration)
    }

        override fun onSupportNavigateUp(): Boolean {
            val navCon = findNavController(R.id.navHost_fragment)
            return navCon.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
        }
    }