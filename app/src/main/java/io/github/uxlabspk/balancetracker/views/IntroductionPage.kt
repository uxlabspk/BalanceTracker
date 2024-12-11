package io.github.uxlabspk.balancetracker.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import io.github.uxlabspk.balancetracker.R
import io.github.uxlabspk.balancetracker.ui.theme.Poppins_Font_Family
import io.github.uxlabspk.balancetracker.views.components.PrimaryButton

@Composable
fun IntroductionPage(
    navController: NavController
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(20.dp)

    ) {
        Image(
            modifier = Modifier.padding(top = 30.dp),
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onPrimary),
            painter = painterResource(id = R.drawable.ic_wallet),
            contentDescription = null
        )

        Text("Balance Tracker", fontFamily = Poppins_Font_Family, fontWeight = FontWeight.Medium, fontSize = 24.sp, color = MaterialTheme.colorScheme.onPrimary)
        Text("Track your balance effortlessly, empowering smarter spending and saving decisions!", textAlign = TextAlign.Center, fontFamily = Poppins_Font_Family, fontWeight = FontWeight.Normal, fontSize = 14.sp, modifier = Modifier.padding(top = 6.dp), color = MaterialTheme.colorScheme.onPrimary)

        PrimaryButton(text = "Get Started", modifier = Modifier
            .padding(top = 100.dp)
            .width(215.dp)
            .height(46.dp)) { navController.navigate("signin") }
    }
}