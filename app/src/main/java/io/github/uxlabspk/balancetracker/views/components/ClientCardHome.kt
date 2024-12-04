package io.github.uxlabspk.balancetracker.views.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.uxlabspk.balancetracker.R
import io.github.uxlabspk.balancetracker.ui.theme.GrayColor
import io.github.uxlabspk.balancetracker.ui.theme.GreenColor
import io.github.uxlabspk.balancetracker.ui.theme.LightGray
import io.github.uxlabspk.balancetracker.ui.theme.Poppins_Font_Family
import io.github.uxlabspk.balancetracker.ui.theme.RedColor
import io.github.uxlabspk.balancetracker.ui.theme.WhiteColor

@Composable
fun ClientCardHome(name: String, date: String, sendValue: String, receiveValue: String, onClick: () -> Unit) {
    Surface(
        color = LightGray,
        shape = RoundedCornerShape(8.dp),
        onClick = onClick,
        modifier = Modifier.padding(bottom = 10.dp)
    ) {
        Row(
            Modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    name,
                    fontFamily = Poppins_Font_Family,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Start,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                )

                Text(
                    date,
                    fontFamily = Poppins_Font_Family,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Start,
                    color = GrayColor

                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Surface(
                    modifier = Modifier.padding(end = 10.dp),
                    color = RedColor,
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Text(
                        receiveValue,
                        fontFamily = Poppins_Font_Family,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Start,
                        color = WhiteColor,
                        modifier = Modifier.padding(5.dp),
                    )
                }

                Surface(
                    color = GreenColor,
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Text(
                        sendValue,
                        fontFamily = Poppins_Font_Family,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Start,
                        color = WhiteColor,
                        modifier = Modifier.padding(5.dp),
                    )
                }
            }

        }

    }
}



@Composable
@Preview(showBackground = true, widthDp = 330, heightDp = 230)
fun PreviewClientCardHome() {
    ClientCardHome(name = "Hamza Waheed", date = "Nov 19, 2024", receiveValue = "$23", sendValue = "$21") { }
}
