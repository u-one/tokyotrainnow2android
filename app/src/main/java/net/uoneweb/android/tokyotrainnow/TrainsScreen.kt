package net.uoneweb.android.tokyotrainnow

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.uoneweb.android.tokyotrainnow.entity.RailDirection
import net.uoneweb.android.tokyotrainnow.entity.Station
import net.uoneweb.android.tokyotrainnow.entity.Train
import net.uoneweb.android.tokyotrainnow.entity.TrainType

@Composable
fun TrainsScreen(viewModel: TrainsViewModel) {
    val trains = viewModel.trains.collectAsState(initial = listOf())
    Trains(trains.value)
}

@Composable
fun Trains(trains: List<Train>) {
    LazyColumn {
        items(trains) {
            Train(train = it)
        }
    }
}

@Composable
fun Train(train: Train) {
    Box {
        Row {
            TrainNumber(train.trainNumber)
            TrainDirection(train.railDirection)
            TrainType(train.trainType)
            Destination(train.destinationStation)
            Section(train.fromStation, train.toStation)
        }
    }
}

@Composable
fun TrainNumber(trainNumber: String) {
    Text(modifier = Modifier.padding(8.dp, 8.dp), text = trainNumber)

}

@Composable
fun TrainDirection(direction: RailDirection) {
    Text(modifier = Modifier.padding(8.dp, 8.dp), text = direction.titles["ja"] ?: "")
}

@Composable
fun TrainType(trainType: TrainType) {
    Text(modifier = Modifier.padding(8.dp, 8.dp), text = trainType.titles["ja"] ?: "")
    /*
    AssistChip(onClick ={}, label = {
        Text(text = trainType.titles["ja"] ?: "")
    })
     */
}

@Composable
fun Destination(destination: List<Station>) {
    val text = destination
        .map {it.titles["ja"] ?: ""}
        .joinToString("・") + "行"
    Text(modifier = Modifier.padding(8.dp, 8.dp), text = text)
}

@Composable
fun Section(from: Station, to: Station) {
    val text = from.titles["ja"] + if (to != Station.Empty) {
        to.titles["ja"]?.let { " - $it" } ?: ""
    } else ""
    Text(modifier = Modifier.padding(8.dp, 8.dp), text = text)
}

@Preview(widthDp = 400)
@Composable
fun TrainInterStationPreview() {
    Surface {
        Train(
            trainInterStation()
        )
    }
}

@Preview(widthDp = 400)
@Composable
fun TrainOnStationPreview() {
    Surface {
        Train(
            trainOnStation()
        )
    }
}

@Preview(widthDp = 400)
@Composable
fun TrainsPreview() {
    Surface {
        Trains(listOf(trainInterStation(), trainInterStation(), trainInterStation()))
    }
}

private fun trainInterStation() : Train =
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

private fun trainOnStation() : Train =
    Train(
        railDirection = RailDirection("odpt.RailDirection:OuterLoop", mapOf("ja" to "外回り")),
        trainType = TrainType("odpt.TrainType:Toei.Local", mapOf("ja" to "各駅停車")),
        trainNumber = "1427B",
        fromStation = Station("odpt.Station:Toei.Oedo.Tsukishima", mapOf("ja" to "月島")),
        toStation = Station.Empty,
        destinationStation = listOf(Station("odpt.Station:Toei.Oedo.Hikarigaoka", mapOf("ja" to "光が丘"))),
        delay = 0,
        carComposition = 0
    )