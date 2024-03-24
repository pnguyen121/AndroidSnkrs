package com.pnguyen121.snkrs.views.home

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.fragment.app.FragmentContainer
import com.pnguyen121.snkrs.Greeting
import com.pnguyen121.snkrs.ui.theme.SNKRSTheme

class HomeTabActivity : AppCompatActivity() {
    val homeFragment = HomeFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SNKRSTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background

                ) {
                    Greeting("SNKRS FAM")
                    FragmentContainer()
                }
            }
        }
    }

//    THIS SHIT IS WRONG BRUH

    @Composable
    fun FragmentContainer(){
        supportFragmentManager.beginTransaction()
            .add(android.R.id.content, homeFragment)
            .commit()
    }

}