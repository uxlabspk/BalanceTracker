package io.github.uxlabspk.balancetracker.ui.theme

import androidx.compose.ui.graphics.Color



val YellowColor = Color(0xFFFFAE00)
val RedColor = Color(0xFFFF1F00)
val GreenColor = Color(0xFF00B303)
val BorderColor = Color(0xFFEEEEEE)
val OffWhiteColor = Color(0xFFF7F7F7)
val GrayColor = Color(0xFF4E4E4E)
val LightTextColor = Color(0xFF444444)
val WhiteColor = Color(0xFFFFFFFF)
val bg_Dark = LightTextColor
val bg_Light = WhiteColor

sealed class ThemeColors(
    val bgColor: Color,
    val bgCard: Color,
    val text: Color
)  {
    data object Night: ThemeColors(
        bgColor = bg_Dark,
        bgCard = GrayColor,
        text = WhiteColor
    )
    data object Day: ThemeColors(
        bgColor = bg_Light,
        bgCard = OffWhiteColor,
        text = LightTextColor
    )
}