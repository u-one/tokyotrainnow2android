package net.uoneweb.android.tokyotrainnow.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.uoneweb.android.tokyotrainnow.entity.RailwayStatus
import net.uoneweb.android.tokyotrainnow.entity.Section
import net.uoneweb.android.tokyotrainnow.entity.Sections
import net.uoneweb.android.tokyotrainnow.ui.Samples.ascending
import net.uoneweb.android.tokyotrainnow.ui.Samples.createTrain
import net.uoneweb.android.tokyotrainnow.ui.Samples.descending
import net.uoneweb.android.tokyotrainnow.ui.Samples.higashiShinjukuStation
import net.uoneweb.android.tokyotrainnow.ui.Samples.interStation
import net.uoneweb.android.tokyotrainnow.ui.Samples.shinjukuNishiguchiStation
import net.uoneweb.android.tokyotrainnow.ui.Samples.tochomaeStation

@Composable
fun Railway(modifier: Modifier = Modifier, padding: PaddingValues = PaddingValues(), railwayStatus: RailwayStatus) {
    LazyColumn(modifier = Modifier.fillMaxSize(), contentPadding = padding) {
        val color = Color(railwayStatus.color)
        item {
            Box(
                Modifier
                    .background(color)
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(modifier = modifier, text = railwayStatus.railwayTitle["ja"] ?: "")
            }
        }
        items(items = railwayStatus.sections.sections) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp, 0.dp)
            ) {
                when (it) {
                    is Section.Station -> Station(Color(railwayStatus.color), it)
                    is Section.InterStation -> InterStation(Color(railwayStatus.color), it)
                }

            }
        }
    }
}

@Composable
fun Station(lineColor: Color, section: Section.Station) {
    Row(modifier = Modifier.height(IntrinsicSize.Min)) {
        Text(
            modifier = Modifier
                .width(100.dp)
                .align(Alignment.CenterVertically),
            text = section.title["ja"] ?: "")
        Column(modifier = Modifier.width(150.dp)) {
            section.ascendingTrains.forEach {
                TrainOnLine(train = it)
            }
        }
        Line(
            Modifier
                .width(20.dp)
                .fillMaxHeight(), lineColor, section)
        Column(modifier = Modifier.width(150.dp)) {
            section.descendingTrains.forEach {
                TrainOnLine(train = it)
            }
        }
    }
}

@Composable
fun InterStation(lineColor: Color, section: Section.InterStation) {
    Row(modifier = Modifier.height(IntrinsicSize.Min)) {
        Text(modifier = Modifier.width(100.dp), text = "")
        Column(modifier = Modifier.width(150.dp)) {
            section.ascendingTrains.forEach {
                TrainOnLine(train = it)
            }
        }
        Line(
            Modifier
                .width(20.dp)
                .fillMaxHeight(), lineColor, section)
        Column(modifier = Modifier.width(150.dp)) {
            section.descendingTrains.forEach {
                TrainOnLine(train = it)
            }
        }
    }
}



@Preview(widthDp = 480)
@Composable
private fun RailwayPreview() {
    Surface {
        Railway(railwayStatus = RailwayStatus(
            color = android.graphics.Color.parseColor("#CF3366"),
            railwayTitle = mapOf("ja" to "大江戸線", "en" to "Oedo Line"),
            sections = Sections(
                ascending,
                descending,
                listOf(
                    tochomaeStation(mapOf(
                        ascending to listOf(
                            createTrain(ascending, "1427A"),
                        ),
                        descending to listOf(
                            createTrain(descending, "1427B")
                        ))),
                    interStation(mapOf(
                        ascending to listOf(
                            createTrain(ascending, "1428A"),
                        ),
                        descending to listOf(
                            createTrain(descending, "1428B")
                        ))),
                    shinjukuNishiguchiStation(mapOf(
                        ascending to listOf(
                            createTrain(ascending, "1429A")
                        ))),
                    interStation(),
                    higashiShinjukuStation()
                )
            )
        )
        )
    }
}

@Preview
@Composable
private fun StationPreview() {
    Surface {
        Station(
            lineColor = Color(android.graphics.Color.parseColor("#CF3366")),
            section = tochomaeStation(
                tracks = mapOf(ascending to listOf(
                    createTrain(ascending, "1427A"),
                    createTrain(ascending, "1428A"),
                ),
                    descending to listOf(
                        createTrain(descending, "1427B")
                    ))
            )
        )
    }
}

@Preview
@Composable
private fun InterStationPreview() {
    Surface {
        InterStation(
            lineColor = Color(android.graphics.Color.parseColor("#CF3366")),
            section = interStation(tracks = mapOf(
                ascending to listOf(
                    createTrain(ascending, "1427A"),
                    createTrain(ascending, "1428A"),
                ),
                descending to listOf(
                    createTrain(descending, "1427B")
                ))))
    }
}
