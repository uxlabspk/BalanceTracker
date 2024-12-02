package io.github.uxlabspk.balancetracker.views.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SendReceiveBtn(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Surface(
        shadowElevation = 3.dp,
    ) {
        Row(
            modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            AltButton (text = "Receive",
                type = "Receive",
                modifier = Modifier
                    .width(130.dp)
                    .height(60.dp)

            ) {}

            AltButton (text = "Send",
                type = "Send",
                modifier = Modifier
                    .width(130.dp)
                    .height(60.dp)
            ) {}

        }

    }
}



@Composable
@Preview(showBackground = true, widthDp = 330, heightDp = 230)
fun PreviewSendReceiveBtn() {
    SendReceiveBtn(modifier = Modifier) { }
}
