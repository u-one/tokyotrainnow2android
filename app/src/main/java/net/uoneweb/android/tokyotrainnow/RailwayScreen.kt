package net.uoneweb.android.tokyotrainnow

import android.graphics.Color.parseColor
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.uoneweb.android.tokyotrainnow.entity.RailDirection
import net.uoneweb.android.tokyotrainnow.entity.RailwayStatus
import net.uoneweb.android.tokyotrainnow.entity.Section
import net.uoneweb.android.tokyotrainnow.entity.Sections
import net.uoneweb.android.tokyotrainnow.entity.Station
import net.uoneweb.android.tokyotrainnow.entity.Tracks
import net.uoneweb.android.tokyotrainnow.entity.Train
import net.uoneweb.android.tokyotrainnow.entity.TrainType

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
        Line(Modifier.width(20.dp).fillMaxHeight(), lineColor, section)
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
        Line(Modifier.width(20.dp).fillMaxHeight(), lineColor, section)
        Column(modifier = Modifier.width(150.dp)) {
            section.descendingTrains.forEach {
                TrainOnLine(train = it)
            }
        }
    }
}

@Composable
fun Line(modifier : Modifier = Modifier, lineColor: Color, section: Section) {
    Canvas(modifier = modifier) {
        drawRect(color = lineColor)
        if (section is Section.Station) {
            drawCircle(color = Color.White, radius = size.width / 3)
        }
    }
}

@Composable
fun TrainOnLine(train: Train) {
    Column(modifier = Modifier.padding(vertical = 8.dp)) {
        Text(text = train.trainNumber)
        Row {
            Text(text = (train.trainType.titles["ja"] ?: "") + " ")
            val text = train.destinationStation
                .joinToString("・"){ it.titles["ja"] ?: ""} + "行"
            Text(text = text)
        }
        Row {
            Text(text = train.fromStation.titles["ja"] ?: "")
            val toStation = train.toStation.titles["ja"]
            if (toStation != null) {
                Text(text = "→")
                Text(text = toStation)
            }
        }
    }
}

@Preview(widthDp = 480)
@Composable
fun RailwayPreview() {
    Surface {
        Railway(railwayStatus = RailwayStatus(
            color = parseColor("#CF3366"),
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
            )))
    }
}

@Preview
@Composable
private fun StationPreview() {
    Surface {
        Station(
            lineColor = Color(parseColor("#CF3366")),
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
fun InterStationPreview() {
    Surface {
        InterStation(
            lineColor = Color(parseColor("#CF3366")),
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

@Preview
@Composable
fun TrainOnLinePreview() {
    Surface {
        TrainOnLine(train = createTrain(ascending, "1427B"))
    }
}

@Preview(widthDp = 20, heightDp = 100)
@Composable
fun LinePreviewStation() {
    Surface {
        Line(
            lineColor = Color(parseColor("#CF3366")),
            section = tochomaeStation()
        )
    }
}

@Preview(widthDp = 20, heightDp = 100)
@Composable
fun LinePreviewSection() {
    Surface {
        Line(
            lineColor = Color(parseColor("#CF3366")),
            section = interStation()
        )
    }
}

private val ascending = RailDirection("odpt.RailDirection:OuterLoop", mapOf("ja" to "外回り"))
private val descending = RailDirection("odpt.RailDirection:InnerLoop", mapOf("ja" to "内回り"))

private fun createTrain(direction: RailDirection, trainNumber: String) =
    Train(
        railDirection = direction,
        trainType = TrainType("odpt.TrainType:Toei.Local", mapOf("ja" to "各駅停車")),
        trainNumber = trainNumber,
        fromStation = Station("odpt.Station:Toei.Oedo.Tsukishima", mapOf("ja" to "月島")),
        toStation = Station("odpt.Station:Toei.Oedo.Kachidoki", mapOf("ja" to "勝どき")),
        destinationStation = listOf(Station("odpt.Station:Toei.Oedo.Hikarigaoka", mapOf("ja" to "光が丘"))),
        delay = 0,
        carComposition = 0
    )

private fun interStation(tracks : Map<RailDirection, List<Train>> = mapOf()) : Section.InterStation {
    return Section.InterStation(
        Tracks(
        ascendingDirection = ascending,
        descendingDirection = descending,
        tracks = tracks
        )
    )
}

private fun tochomaeStation(tracks : Map<RailDirection, List<Train>> = mapOf()) : Section.Station{
    return Section.Station(
        stationId = "odpt.Station:Toei.Oedo.Tochomae",
        title = mapOf("ja" to "都庁前", "en" to "Tochomae"),
        tracks = Tracks(
        tracks = tracks,
        ascendingDirection = ascending,
        descendingDirection = descending,
        )
    )
}

private fun shinjukuNishiguchiStation(tracks : Map<RailDirection, List<Train>> = mapOf()) : Section.Station{
    return Section.Station(
        stationId = "odpt.Station:Toei.Oedo.ShinjukuNishiguchi",
        title = mapOf("ja" to "新宿西口", "en" to "ShinjukuNishiguchi"),
        tracks = Tracks(
        tracks = tracks,
        ascendingDirection = ascending,
        descendingDirection = descending,
        )
    )
}

private fun higashiShinjukuStation(tracks : Map<RailDirection, List<Train>> = mapOf()) : Section.Station{
    return Section.Station(
        stationId = "odpt.Station:Toei.Oedo.HigashiShinjuku",
        title = mapOf("ja" to "東新宿", "en" to "Higashi-shinjuku"),
        tracks = Tracks(
        tracks = tracks,
        ascendingDirection = ascending,
        descendingDirection = descending,
        )
    )
}
