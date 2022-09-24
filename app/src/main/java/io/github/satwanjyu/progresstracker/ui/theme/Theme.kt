package io.github.satwanjyu.progresstracker.ui.theme

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun ProgressTrackerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            (view.context as Activity).window.statusBarColor = colorScheme.primary.toArgb()
            ViewCompat.getWindowInsetsController(view)?.isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

@Preview(showBackground = true, heightDp = 1100)
@Composable
fun ColorPalette() {
    ProgressTrackerTheme {
        Column {
            ColorPaletteItem(
                name = "Primary",
                color = MaterialTheme.colorScheme.primary,
                textColor = MaterialTheme.colorScheme.onPrimary
            )
            ColorPaletteItem(
                name = "onPrimary",
                color = MaterialTheme.colorScheme.onPrimary,
                textColor = MaterialTheme.colorScheme.primary
            )
            ColorPaletteItem(
                name = "primaryContainer",
                color = MaterialTheme.colorScheme.primaryContainer,
                textColor = MaterialTheme.colorScheme.onPrimaryContainer
            )
            ColorPaletteItem(
                name = "onPrimaryContainer",
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                textColor = MaterialTheme.colorScheme.primaryContainer
            )
            ColorPaletteItem(
                name = "inversePrimary",
                color = MaterialTheme.colorScheme.inversePrimary,
                textColor = MaterialTheme.colorScheme.onPrimary
            )
            ColorPaletteItem(
                name = "Secondary",
                color = MaterialTheme.colorScheme.secondary,
                textColor = MaterialTheme.colorScheme.onSecondary
            )
            ColorPaletteItem(
                name = "onSecondary",
                color = MaterialTheme.colorScheme.onSecondary,
                textColor = MaterialTheme.colorScheme.secondary
            )
            ColorPaletteItem(
                name = "secondaryContainer",
                color = MaterialTheme.colorScheme.secondaryContainer,
                textColor = MaterialTheme.colorScheme.onSecondaryContainer
            )
            ColorPaletteItem(
                name = "onSecondaryContainer",
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                textColor = MaterialTheme.colorScheme.secondaryContainer
            )
            ColorPaletteItem(
                name = "tertiary",
                color = MaterialTheme.colorScheme.tertiary,
                textColor = MaterialTheme.colorScheme.onTertiary
            )
            ColorPaletteItem(
                name = "onTertiary",
                color = MaterialTheme.colorScheme.onTertiary,
                textColor = MaterialTheme.colorScheme.tertiary
            )
            ColorPaletteItem(
                name = "tertiaryContainer",
                color = MaterialTheme.colorScheme.tertiaryContainer,
                textColor = MaterialTheme.colorScheme.onTertiaryContainer
            )
            ColorPaletteItem(
                name = "onTertiaryContainer",
                color = MaterialTheme.colorScheme.onTertiaryContainer,
                textColor = MaterialTheme.colorScheme.tertiaryContainer
            )
            ColorPaletteItem(
                name = "background",
                color = MaterialTheme.colorScheme.background,
                textColor = MaterialTheme.colorScheme.onBackground
            )
            ColorPaletteItem(
                name = "onBackground",
                color = MaterialTheme.colorScheme.onBackground,
                textColor = MaterialTheme.colorScheme.background
            )
            ColorPaletteItem(
                name = "surface",
                color = MaterialTheme.colorScheme.surface,
                textColor = MaterialTheme.colorScheme.onSurface
            )
            ColorPaletteItem(
                name = "onSurface",
                color = MaterialTheme.colorScheme.onSurface,
                textColor = MaterialTheme.colorScheme.surface
            )
            ColorPaletteItem(
                name = "surfaceVariant",
                color = MaterialTheme.colorScheme.surfaceVariant,
                textColor = MaterialTheme.colorScheme.onSurfaceVariant
            )
            ColorPaletteItem(
                name = "onSurfaceVariant",
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                textColor = MaterialTheme.colorScheme.surfaceVariant
            )
            ColorPaletteItem(
                name = "surfaceTint",
                color = MaterialTheme.colorScheme.surfaceTint,
                textColor = MaterialTheme.colorScheme.surface
            )
            ColorPaletteItem(
                name = "inverseSurface",
                color = MaterialTheme.colorScheme.inverseSurface,
                textColor = MaterialTheme.colorScheme.inverseOnSurface
            )
            ColorPaletteItem(
                name = "inverseOnSurface",
                color = MaterialTheme.colorScheme.inverseOnSurface,
                textColor = MaterialTheme.colorScheme.inverseSurface
            )
            ColorPaletteItem(
                name = "error",
                color = MaterialTheme.colorScheme.error,
                textColor = MaterialTheme.colorScheme.onError
            )
            ColorPaletteItem(
                name = "onError",
                color = MaterialTheme.colorScheme.onError,
                textColor = MaterialTheme.colorScheme.error
            )
            ColorPaletteItem(
                name = "errorContainer",
                color = MaterialTheme.colorScheme.errorContainer,
                textColor = MaterialTheme.colorScheme.onErrorContainer
            )
            ColorPaletteItem(
                name = "onErrorContainer",
                color = MaterialTheme.colorScheme.onErrorContainer,
                textColor = MaterialTheme.colorScheme.errorContainer
            )
            ColorPaletteItem(
                name = "outline",
                color = MaterialTheme.colorScheme.outline,
                textColor = MaterialTheme.colorScheme.surface
            )
            ColorPaletteItem(
                name = "outlineVariant",
                color = MaterialTheme.colorScheme.outlineVariant,
                textColor = MaterialTheme.colorScheme.surface
            )
            ColorPaletteItem(
                name = "scrim",
                color = MaterialTheme.colorScheme.scrim,
                textColor = MaterialTheme.colorScheme.surface
            )
        }
    }
}

@Composable
fun ColorPaletteItem(name: String, color: Color, textColor: Color) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color),
    ) {
        Text(
            name,
            modifier = Modifier.padding(start = 8.dp),
            style = MaterialTheme.typography.headlineMedium.copy(color = textColor)
        )
    }
}
