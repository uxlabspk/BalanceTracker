package io.github.uxlabspk.balancetracker.views.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.uxlabspk.balancetracker.ui.theme.Poppins_Font_Family

@Composable
fun TopBar(give: String, get: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
    Surface(
        modifier = modifier

            .fillMaxWidth(),
        shadowElevation = 3.dp,
        color = Color.Gray,
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier
                .fillMaxWidth(1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .padding(22.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = give,
                    fontFamily = Poppins_Font_Family,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Start,
                    color = Color.Black
                )

                Text(
                    text = get,
                    fontFamily = Poppins_Font_Family,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Start,
                    color = Color.Black
                )
            }
            IconButton(onClick = onClick, modifier = Modifier.padding(end = 16.dp)) {
                Icon(
                    Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                    contentDescription = "go back icon",

                )
            }
        }

    }
}



@Composable
@Preview(showBackground = true, widthDp = 330, heightDp = 230)
fun PreviewIntroductionPage() {
    TopBar(give = "ksdl", get = "lkjsd", modifier = Modifier) { }
}
