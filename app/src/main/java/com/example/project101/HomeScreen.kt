package com.example.project101


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeScreen : AppCompatActivity() {

    private lateinit var currentFragment : Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, currentFragment).commit()

        val bottomNav : BottomNavigationView = findViewById(R.id.fragmentContainerView)

        //setup with nav_controller
        bottomNav.setupWithNavController (navController)

        //setting the nav listener in the bottom navigation
       bottomNav.setOnNavigationItemReselectedListener { navController}
    }

    //create navigation listener function

    val navController = BottomNavigationView.OnNavigationItemReselectedListener {
        when(
            it.itemId
        ){
            R.id.home -> {
                currentFragment = HomeFragment()
            }

            R.id.deal -> {
                currentFragment = DealsFragment()
            }

            R.id.profile -> {
                currentFragment = ProfileFragment()
            }
        }
    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, currentFragment).commit()
        true
    }

}

