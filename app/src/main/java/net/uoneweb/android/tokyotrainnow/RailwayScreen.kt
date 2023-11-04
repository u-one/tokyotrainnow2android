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
import net.uoneweb.android.tokyotrainnow.entity.RailwayStatus
import net.uoneweb.android.tokyotrainnow.entity.Section

@Composable
fun RailwayScreen(
    viewModel: RailwayViewModel
) {
    val railway = viewModel.railwayStatus.collectAsState(initial = null)
    railway.value?.let {
        Railway(railwayStatus = it)
    }
}

@Composable
fun Railway(modifier: Modifier = Modifier, railwayStatus: RailwayStatus) {
    LazyColumn {
        item {
            val color = Color(railwayStatus.color)
            Box(
                Modifier
                    .background(color)
                    .fillMaxWidth()
                    .padding(16.dp)) {
                Text(modifier = modifier, text = railwayStatus.railwayTitle["ja"] ?: "")
            }
        }
        items(railwayStatus.sections) {
            Box(modifier = Modifier.fillMaxWidth().padding(16.dp, 8.dp)) {
                when (it) {
                    is Section.Station -> Text(text = it.title["ja"] ?: "")
                    is Section.InterStation -> Text(text = "|")
                }
            }
        }
    }
}

@Preview(widthDp = 320)
@Composable
fun RailwayPreview() {
    Surface {
        Railway(railwayStatus = RailwayStatus(
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