package io.github.uxlabspk.balancetracker.views.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.uxlabspk.balancetracker.R
import io.github.uxlabspk.balancetracker.ui.theme.BorderColor
import io.github.uxlabspk.balancetracker.ui.theme.GreenColor
import io.github.uxlabspk.balancetracker.ui.theme.OffWhiteColor
import io.github.uxlabspk.balancetracker.ui.theme.Poppins_Font_Family
import io.github.uxlabspk.balancetracker.ui.theme.RedColor
import io.github.uxlabspk.balancetracker.ui.theme.WhiteColor
import io.github.uxlabspk.balancetracker.ui.theme.YellowColor

@Composable
fun AltButton(text: String, type: String, modifier: Modifier, onClick: () -> Unit) {
    var color: Color = WhiteColor
    var bgColor: Color = YellowColor
    var icon: ImageVector = Icons.Default.Check

    if (type == "Send") {
        color = WhiteColor
        bgColor = GreenColor
        icon = Icons.Default.KeyboardArrowUp
    } else if (type == "Receive") {
        color = WhiteColor
        bgColor = RedColor
        icon = Icons.Default.KeyboardArrowDown
    } else if (type == "Alt") {
        color = Color.Black
        bgColor = OffWhiteColor
        icon = Icons.Default.Clear
    }

    Button(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = bgColor
        ),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, BorderColor),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 2.dp
        )
    ) {
        Image(icon, contentDescription = null, colorFilter = ColorFilter.tint(color), modifier = Modifier.padding(end = 5.dp).width(20.dp))
        Text(
            text,
            fontFamily = Poppins_Font_Family,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            color = color
        )
    }
}


@Composable
@Preview(showBackground = true, widthDp = 300, heightDp = 700)
fun PreviewAltButton() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AltButton("Yes", "Send", Modifier) {

        }
    }
}