package net.uoneweb.android.tokyotrainnow

import android.graphics.Color.parseColor
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.uoneweb.android.tokyotrainnow.entity.RailDirection
import net.uoneweb.android.tokyotrainnow.entity.RailwayStatus
import net.uoneweb.android.tokyotrainnow.entity.Section
import net.uoneweb.android.tokyotrainnow.entity.Sections
import net.uoneweb.android.tokyotrainnow.entity.Station
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
        items(railwayStatus.sections.sections) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp, 8.dp)) {
                when (it) {
                    is Section.Station -> Station(Color(railwayStatus.color),it)
                    is Section.InterStation -> InterStation(Color(railwayStatus.color), it)
                }

            }
        }
    }
}

@Composable
fun Station(lineColor: Color, section: Section.Station) {
    Row {
        Text(
            modifier = Modifier
                .width(100.dp)
                .align(Alignment.CenterVertically),
            text = section.title["ja"] ?: "")
        Line(Modifier.fillMaxHeight(), lineColor, section)
        Column {
            section.trains.forEach {
                TrainOnLine(train = it)
            }
        }
    }
}

@Composable
fun InterStation(lineColor: Color, section: Section.InterStation) {
    Row {
        Text(modifier = Modifier.width(100.dp), text = "|")
        Line(Modifier.fillMaxHeight(), lineColor, section)
        Column {
            section.trains.forEach {
                TrainOnLine(train = it)
            }
        }
    }
}

@Composable
fun TrainOnLine(train: Train) {
    Column(modifier = Modifier.padding(vertical = 0.dp)) {
        Text(text = train.trainNumber)
        Row {
            Text(text = (train.trainType.titles["ja"] ?: "") + " ")
            val text = train.destinationStation.map { it.titles["ja"] ?: ""}
                .joinToString("・") + "行"
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

@Preview
@Composable
fun TrainOnLinePreview() {
    Surface {
        TrainOnLine(train = createTrain())
    }
}

@Composable
fun Line(modifier : Modifier = Modifier, lineColor: Color, section: Section) {
    val width = 20.dp
    Box(modifier = modifier.fillMaxHeight()
        .width(width)
        .background(lineColor)) {
        if (section is Section.Station) {
            Box(modifier = Modifier
                .size(width)
                .clip(CircleShape)
                .background(Color.White)
                .align(Alignment.Center)
            )
        }

    }
}

@Preview(widthDp = 20, heightDp = 240)
@Composable
fun LinePreviewStation() {
    Surface {
        Line(
            lineColor = Color(parseColor("#CF3366")),
            section = Section.Station(
                stationId = "odpt.Station:Toei.Oedo.Tochomae",
                title = mapOf("ja" to "都庁前", "en" to "Tochomae"),
                trains = listOf()
            )
        )
    }
}

@Preview(widthDp = 20, heightDp = 240)
@Composable
fun LinePreviewSection() {
    Surface {
        Line(
            lineColor = Color(parseColor("#CF3366")),
            section = Section.InterStation(
                trains = listOf()
            )
        )
    }
}


@Preview(widthDp = 320)
@Composable
fun RailwayPreview() {
    Surface {
        Railway(railwayStatus = RailwayStatus(
            color = parseColor("#CF3366"),
            railwayTitle = mapOf("ja" to "大江戸線", "en" to "Oedo Line"),
            sections = Sections(listOf(
                Section.Station(
                    stationId = "odpt.Station:Toei.Oedo.Tochomae",
                    title = mapOf("ja" to "都庁前", "en" to "Tochomae"),
                    trains = listOf(
                        createTrain(),
                        createTrain()
                    )
                ),
                Section.InterStation(trains = listOf(
                    createTrain(),
                    createTrain()
                )),
                Section.Station(
                    stationId = "odpt.Station:Toei.Oedo.ShinjukuNishiguchi",
                    title = mapOf("ja" to "新宿西口", "en" to "ShinjukuNishiguchi"),
                    trains = listOf(createTrain())
                )),
            )
        ))
    }
}

fun createTrain() =
    Train(
        railDirection = RailDirection("odpt.RailDirection:OuterLoop", mapOf("ja" to "外回り")),
        trainType = TrainType("odpt.TrainType:Toei.Local", mapOf("ja" to "各駅停車")),
        trainNumber = "1427B",
        fromStation = Station("odpt.Station:Toei.Oedo.Tsukishima", mapOf("ja" to "月島")),
        toStation = Station("odpt.Station:Toei.Oedo.Kachidoki", mapOf("ja" to "勝どき")),
        destinationStation = listOf(Station("odpt.Station:Toei.Oedo.Hikarigaoka", mapOf("ja" to "光が丘"))),
        delay = 0,
        carComposition = 0
    )