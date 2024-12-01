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
import io.github.uxlabspk.balancetracker.ui.theme.LightGray
import io.github.uxlabspk.balancetracker.ui.theme.Poppins_Font_Family

@Composable
fun ClientCardHome(give: String, get: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
    Surface(
        shadowElevation = 3.dp,
    ) {
        Row(
            modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .padding(10.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = give,
                    fontFamily = Poppins_Font_Family,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Start,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(vertical = 10.dp)
                )

                Text(
                    text = get,
                    fontFamily = Poppins_Font_Family,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Start,
                    color = Color.Black

                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(horizontal = 10.dp)
                ,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                AltButton (text = "1245",
                    type = "Receive",
                    modifier = Modifier
                        .width(80.dp)
                        .height(35.dp)

                ) {}
                AltButton (text = "2000",
                    type = "Send",
                    modifier = Modifier
                        .width(80.dp)
                        .height(35.dp)
                ) {}
            }

        }

    }
}



@Composable
@Preview(showBackground = true, widthDp = 330, heightDp = 230)
fun PreviewClientCardHome() {
    ClientCardHome(give = "Hamza Waheed", get = "Nov 19, 2024", modifier = Modifier) { }
}
