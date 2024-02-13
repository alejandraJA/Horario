package com.ale.horarios.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ale.horarios.ui.custom.component.TextCustom
import com.ale.horarios.ui.theme.AppTheme

@Composable
fun SetWeekDays() = Row {
    val modifier = Modifier
        .weight(1f)
        .padding(all = 4.dp)
    TextCustom(text = "D", modifier = modifier, textAlign = TextAlign.Center)
    TextCustom(text = "L", modifier = modifier, textAlign = TextAlign.Center)
    TextCustom(text = "M", modifier = modifier, textAlign = TextAlign.Center)
    TextCustom(text = "M", modifier = modifier, textAlign = TextAlign.Center)
    TextCustom(text = "J", modifier = modifier, textAlign = TextAlign.Center)
    TextCustom(text = "V", modifier = modifier, textAlign = TextAlign.Center)
    TextCustom(text = "S", modifier = modifier, textAlign = TextAlign.Center)
}

@Preview(backgroundColor = 0xFFFFFFFF, showBackground = true)
@Composable
private fun SetWeekDaysPreview() {
    AppTheme(useDarkTheme = true) {
        Column(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
            SetWeekDays()
        }
    }
}