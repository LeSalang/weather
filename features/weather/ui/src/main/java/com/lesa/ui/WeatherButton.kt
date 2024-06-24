package com.lesa.ui

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.lesa.uikit.WeatherTheme

@Composable
fun WeatherButton(
    onClick: () -> Unit,
    imageVector: ImageVector,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        colors = IconButtonColors(
            containerColor = WeatherTheme.colorScheme.surface,
            contentColor = WeatherTheme.colorScheme.primary,
            disabledContainerColor = WeatherTheme.colorScheme.surface,
            disabledContentColor = WeatherTheme.colorScheme.onSurface
        ),
        modifier = modifier
    ) {
        Icon(
            imageVector = imageVector,
            contentDescription = contentDescription,
        )
    }
}
