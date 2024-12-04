package io.github.uxlabspk.balancetracker.views

import android.widget.Switch
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
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
import io.github.uxlabspk.balancetracker.ui.theme.YellowColor
import io.github.uxlabspk.balancetracker.views.components.ProfileActionButton

@Composable
fun ProfilePage() {
    var isChecked by remember { mutableStateOf(false) }

    Column(
        Modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(20.dp)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                Icons.Default.AccountCircle,
                modifier = Modifier
                    .size(120.dp, 120.dp),
                contentDescription = null
            )
            Text(
                "Muhammad Naveed",
                fontFamily = Poppins_Font_Family,
                fontWeight = FontWeight.Medium,
                fontSize = 24.sp,
                color = MaterialTheme.colorScheme.onPrimary
            )
            Text(
                "naveed@codehuntspk.com",
                fontFamily = Poppins_Font_Family,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onPrimary
            )
        }

        ProfileActionButton(
            title = "Edit Profile",
            icon = R.drawable.ic_edit,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .height(48.dp)
        ) {}

        ProfileActionButton(
            title = "Add Clients",
            icon = R.drawable.ic_add,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .height(48.dp)
        ) {}

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .height(48.dp),
            onClick = {  },
            colors = ButtonDefaults.buttonColors(
                containerColor = LightGray
            ),
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(1.dp, BorderColor),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    "Sync Online",
                    fontFamily = Poppins_Font_Family,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    color = GrayColor
                )

                Switch(
                    checked = isChecked,
                    onCheckedChange = { isChecked = it },
                    modifier = Modifier.scale(0.7f),
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = YellowColor,
                        uncheckedThumbColor = YellowColor,
                        uncheckedBorderColor = BorderColor,
                        checkedBorderColor = YellowColor,
                    )
                )
            }
        }

        ProfileActionButton(
            title = "Export Report",
            icon = R.drawable.ic_export,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .height(48.dp)
        ) {}

        ProfileActionButton(
            title = "Sign Out",
            icon = R.drawable.ic_logout,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .height(48.dp)
        ) {}

        ProfileActionButton(
            title = "Delete Account",
            icon = R.drawable.ic_trash,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .height(48.dp)
        ) {}
    }
}

@Composable
@Preview(showBackground = true, widthDp = 330, heightDp = 880)
fun ProfilePagePreview() {
    ProfilePage()
}