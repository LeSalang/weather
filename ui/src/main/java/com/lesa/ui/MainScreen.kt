package com.lesa.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.lesa.uikit.Dimensions.dimen16
import com.lesa.uikit.Dimensions.dimen32
import com.lesa.uikit.Dimensions.dimen64
import com.lesa.uikit.Dimensions.dimen8
import com.lesa.uikit.WeatherTheme

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(dimen32),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding(dimen16)
    ) {
        Text(
            text = "City",
            style = WeatherTheme.typography.headlineSmall,
            textAlign = TextAlign.Center,
            color = WeatherTheme.colorScheme.primary,
        )
        CurrentWeatherBlock(modifier = Modifier.weight(1f))
        Spacer(modifier = Modifier.size(dimen64))
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            FutureWeatherBlock()
            FutureWeatherBlock()
        }
    }
}

@Composable
fun CurrentWeatherBlock(
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = "10.06.2024",
            style = WeatherTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            color = WeatherTheme.colorScheme.primary,
        )
        Spacer(modifier = Modifier.size(dimen8))
        Text(
            text = "+23 C",
            style = WeatherTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            color = WeatherTheme.colorScheme.primary,
        )
        Text(
            text = "Partly Cloudy",
            style = WeatherTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            color = WeatherTheme.colorScheme.primary,
        )
    }
}

@Composable
fun FutureWeatherBlock(
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = "10.06.2024",
            style = WeatherTheme.typography.titleSmall,
            textAlign = TextAlign.Center,
            color = WeatherTheme.colorScheme.primary,
        )
        Spacer(modifier = Modifier.size(dimen8))
        Text(
            text = "+23 C",
            style = WeatherTheme.typography.headlineSmall,
            textAlign = TextAlign.Center,
            color = WeatherTheme.colorScheme.primary,
        )
        Text(
            text = "Partly Cloudy",
            style = WeatherTheme.typography.titleSmall,
            textAlign = TextAlign.Center,
            color = WeatherTheme.colorScheme.primary,
        )
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    WeatherTheme {
        MainScreen()
    }
}
