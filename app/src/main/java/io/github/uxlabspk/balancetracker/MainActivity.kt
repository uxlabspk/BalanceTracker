package io.github.uxlabspk.balancetracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import io.github.uxlabspk.balancetracker.ui.theme.BalanceTrackerTheme
import io.github.uxlabspk.balancetracker.views.IntroductionPage
import io.github.uxlabspk.balancetracker.views.SignInPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BalanceTrackerTheme {
                SignInPage()
            }
        }
    }
}