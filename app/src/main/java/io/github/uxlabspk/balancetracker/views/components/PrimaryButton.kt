package io.github.uxlabspk.balancetracker.views.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.uxlabspk.balancetracker.ui.theme.Poppins_Font_Family
import io.github.uxlabspk.balancetracker.ui.theme.WhiteColor
import io.github.uxlabspk.balancetracker.ui.theme.YellowColor

@Composable
fun PrimaryButton(text: String, modifier: Modifier, onClick: ()-> Unit) {
    Button(
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = YellowColor,
            contentColor = WhiteColor
        ),
        shape = RoundedCornerShape(8.dp),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 2.dp
        ),
        onClick = onClick
    ) {
        Text(
            text,
            fontFamily = Poppins_Font_Family,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp
        )
    }
    
}