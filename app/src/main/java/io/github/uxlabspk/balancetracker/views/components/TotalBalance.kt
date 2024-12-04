package io.github.uxlabspk.balancetracker.views.components

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material.icons.automirrored.filled.ExitToApp
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.uxlabspk.balancetracker.R
import io.github.uxlabspk.balancetracker.ui.theme.BorderColor
import io.github.uxlabspk.balancetracker.ui.theme.LightGray
import io.github.uxlabspk.balancetracker.ui.theme.OffWhiteColor
import io.github.uxlabspk.balancetracker.ui.theme.Poppins_Font_Family

@Composable
fun TotalBalance(give: String, get: String, send: String, receive: String, modifier: Modifier = Modifier, onStatsClick: () -> Unit) {
    Surface(
        modifier = modifier
            .fillMaxWidth(),
        color = LightGray,
        border = BorderStroke(1.dp, BorderColor),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            Modifier.padding(20.dp)
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier,
//                        .padding(vertical = 10.dp),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = give,
                        fontFamily = Poppins_Font_Family,
                        fontSize = 32.sp,
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
                        color = Color.DarkGray

                    )
                }
                IconButton(onClick = onStatsClick) {
                    Icon(
                        painter = painterResource(R.drawable.ic_stats),
                        contentDescription = "go back icon",

                        )
                }
            }

            Row(
                modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                AltButton (
                    receive,
                    type = "Receive",
                    modifier = Modifier

                ) {

                }

                AltButton (
                    send,
                    type = "Send",
                    modifier = Modifier
                ) {

                }

            }
        }
    }
}



@Composable
@Preview(showBackground = true, widthDp = 330, heightDp = 230)
fun PreviewTotalBalance() {
    TotalBalance(give = "$25,000", get = "$3000", send = "$30", receive = "$40") {}
}
