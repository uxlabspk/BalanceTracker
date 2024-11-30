package io.github.uxlabspk.balancetracker.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.uxlabspk.balancetracker.views.components.TopBar


@Composable
fun SignInPage() {



    Column(
        modifier = Modifier.background(MaterialTheme.colorScheme.background)
    ) {
        TopBar(text = "Sign In", modifier = Modifier) {}
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

        }
    }

}

@Composable
@Preview(showBackground = true, widthDp = 300, heightDp = 800)
fun SignInPagePreview() {
    SignInPage()
}