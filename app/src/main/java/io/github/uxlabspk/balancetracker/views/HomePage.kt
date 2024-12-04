package io.github.uxlabspk.balancetracker.views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.uxlabspk.balancetracker.ui.theme.GrayColor
import io.github.uxlabspk.balancetracker.ui.theme.GreenColor
import io.github.uxlabspk.balancetracker.ui.theme.Poppins_Font_Family
import io.github.uxlabspk.balancetracker.ui.theme.WhiteColor
import io.github.uxlabspk.balancetracker.ui.theme.YellowColor
import io.github.uxlabspk.balancetracker.views.components.ClientCardHome
import io.github.uxlabspk.balancetracker.views.components.TotalBalance


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomePage() {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = YellowColor,
                contentColor = WhiteColor,
                shape = RoundedCornerShape(50)
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add"
                )
            }
        }
    ) {
        Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize()
            .padding(20.dp)
    ) {
        TotalBalance(give = "$25,000", get = "$3000", send = "$30", receive = "$40", modifier = Modifier.padding(top = 10.dp)) {}

        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Recent Transactions",
                fontFamily = Poppins_Font_Family,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp
            )

            TextButton(
                onClick = {}
            ) {
                Text(
                    "Show More",
                    fontFamily = Poppins_Font_Family,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    color = GrayColor
                )
            }
        }

        LazyColumn {
            items(15) {
                ClientCardHome(name = "payment for person", date = "December 19, 2026", sendValue = "$32", receiveValue = "$00") {}
            }
        }
    }
    }

//    Column(
//        modifier = Modifier
//            .background(MaterialTheme.colorScheme.background)
//            .fillMaxSize()
//            .padding(20.dp)
//    ) {
//        TotalBalance(give = "$25,000", get = "$3000", send = "$30", receive = "$40", modifier = Modifier.padding(top = 10.dp)) {}
//
//        Row(
//            Modifier
//                .fillMaxWidth()
//                .padding(top = 20.dp),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text(
//                "Recent Transactions",
//                fontFamily = Poppins_Font_Family,
//                fontWeight = FontWeight.Medium,
//                fontSize = 14.sp
//            )
//
//            TextButton(
//                onClick = {}
//            ) {
//                Text(
//                    "Show More",
//                    fontFamily = Poppins_Font_Family,
//                    fontWeight = FontWeight.Medium,
//                    fontSize = 14.sp,
//                    color = GrayColor
//                )
//            }
//        }
//
//        LazyColumn {
//            items(15) {
//                ClientCardHome(name = "payment for person", date = "December 19, 2026", sendValue = "$32", receiveValue = "$00") {}
//            }
//        }
//    }
}


@Preview (showBackground = true, widthDp = 330, heightDp = 800)
@Composable
fun HomePagePreview() {
    HomePage()
}