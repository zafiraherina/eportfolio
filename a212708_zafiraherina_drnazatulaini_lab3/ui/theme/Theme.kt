package com.example.a212708_zafiraherina_drnazatulaini_lab3.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color

private val TerraLightColors = lightColorScheme(
    primary = Green40,
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Green90,
    onPrimaryContainer = Green10,
    secondary = DarkGreen40,
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = DarkGreen90,
    onSecondaryContainer = DarkGreen10,
    background = Beige99,
    onBackground = Green10,
    surface = Beige90,
    onSurface = Green10,
    error = ErrorRed20,
    onError = Color(0xFFFFFFFF)
)

private val TerraDarkColors = darkColorScheme(
    primary = Green80,
    onPrimary = Green20,
    primaryContainer = Green30,
    onPrimaryContainer = Green90,
    secondary = DarkGreen80,
    onSecondary = DarkGreen20,
    secondaryContainer = DarkGreen30,
    onSecondaryContainer = DarkGreen90,
    background = Green10,
    onBackground = Green90,
    surface = DarkGreen10,
    onSurface = DarkGreen90,
    error = ErrorRed80,
    onError = ErrorRed20
)

private val TerraTypography = Typography(
    headlineLarge = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    titleMedium = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodySmall = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)

@Composable
fun TerraTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) TerraDarkColors else TerraLightColors

    MaterialTheme(
        colorScheme = colorScheme,
        typography = TerraTypography,
        content = content
    )
}