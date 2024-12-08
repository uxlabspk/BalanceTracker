package io.github.uxlabspk.balancetracker.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.uxlabspk.balancetracker.R
import io.github.uxlabspk.balancetracker.ui.theme.BorderColor
import io.github.uxlabspk.balancetracker.ui.theme.GrayColor
import io.github.uxlabspk.balancetracker.ui.theme.LightGray
import io.github.uxlabspk.balancetracker.ui.theme.Poppins_Font_Family
import io.github.uxlabspk.balancetracker.views.components.AltButton
import io.github.uxlabspk.balancetracker.views.components.CurrencyRecordsButtons
import io.github.uxlabspk.balancetracker.views.components.ProfileActionButton

@Composable
fun StatsPage() {
    Column(
        Modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize()
    ) {
        Column(
            Modifier.padding(20.dp).fillMaxSize(9/10f)
        ) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth(),
                color = LightGray,
                shape = RoundedCornerShape(8.dp),
                onClick = {}
            ) {
                Column(
                    modifier = Modifier.padding(12.dp)
                ) {
                    Text(
                        "Name",
                        fontFamily = Poppins_Font_Family,
                        fontWeight = FontWeight.Medium,
                        fontSize = 24.sp,
                    )
                    Text(
                        "Name",
                        fontFamily = Poppins_Font_Family,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        color = GrayColor
                    )
                }
            }

            CurrencyRecordsButtons()




        }

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
}

@Composable
@Preview(showBackground = true, widthDp = 300, heightDp = 700)
fun StatsPagePreview() {
    StatsPage()
}