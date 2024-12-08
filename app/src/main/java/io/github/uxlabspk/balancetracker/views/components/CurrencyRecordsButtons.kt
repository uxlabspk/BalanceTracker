package io.github.uxlabspk.balancetracker.views.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.uxlabspk.balancetracker.R
import io.github.uxlabspk.balancetracker.ui.theme.BorderColor
import io.github.uxlabspk.balancetracker.ui.theme.GrayColor
import io.github.uxlabspk.balancetracker.ui.theme.LightGray
import io.github.uxlabspk.balancetracker.ui.theme.Poppins_Font_Family

@Composable
fun CurrencyRecordsButtons() {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = LightGray
        ),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, BorderColor),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painterResource(R.drawable.ic_export),
                contentDescription = null,
                colorFilter = ColorFilter.tint(GrayColor),
                modifier = Modifier
                    .padding(end = 5.dp)
                    .width(20.dp))

            Text(
                "Generate Report",
                fontFamily = Poppins_Font_Family,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = GrayColor
            )
        }
    }
}