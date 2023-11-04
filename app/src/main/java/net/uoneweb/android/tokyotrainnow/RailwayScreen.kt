package net.uoneweb.android.tokyotrainnow

import android.graphics.Color.parseColor
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.uoneweb.android.tokyotrainnow.entity.Railway
import net.uoneweb.android.tokyotrainnow.entity.Section

@Composable
fun RailwayScreen(
    viewModel: RailwayViewModel
) {
    val railway = viewModel.railway.collectAsState(initial = null)
    railway.value?.let {
        Railway(railway = it)
    }
}

@Composable
fun Railway(modifier: Modifier = Modifier, railway: Railway) {
    LazyColumn {
        item {
            val color = Color(railway.color)
            Box(
                Modifier
                    .background(color)
                    .fillMaxWidth()
                    .padding(16.dp)) {
                Text(modifier = modifier, text = railway.railwayTitle["ja"] ?: "")
            }
        }
        items(railway.sections) {
            when(it) {
                is Section.Station -> Text(text = it.title["ja"] ?: "")
                is Section.InterStation -> Text(text = "-")
            }
        }
    }
}

@Preview(widthDp = 320)
@Composable
fun RailwayPreview() {
    Surface {
        Railway(railway = Railway(
            color = parseColor("#CF3366"),
            railwayTitle = mapOf("ja" to "大江戸線", "en" to "Oedo Line"),
            sections = listOf(
                Section.Station(
                    title = mapOf("ja" to "都庁前", "en" to "Tochomae")
                ),
                Section.InterStation(),
                Section.Station(
                    title = mapOf("ja" to "新宿西口", "en" to "ShinjukuNishiguchi")
                ),
            )
        ))
    }
}