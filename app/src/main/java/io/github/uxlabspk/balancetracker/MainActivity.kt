package io.github.uxlabspk.balancetracker

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.uxlabspk.balancetracker.ui.theme.BalanceTrackerTheme
import io.github.uxlabspk.balancetracker.views.IntroductionPage
import io.github.uxlabspk.balancetracker.views.components.PrimaryButton
import kotlin.math.log

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BalanceTrackerTheme {
                IntroductionPage()
            }
        }
    }
}