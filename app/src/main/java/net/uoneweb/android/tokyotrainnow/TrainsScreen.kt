package net.uoneweb.android.tokyotrainnow

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.uoneweb.android.tokyotrainnow.entity.Train

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
        Text(text = train.trainNumber)
    }
}

@Preview(widthDp = 320)
@Composable
fun TrainPreview() {
    Surface {
        Train(
            Train(
                railDirection = "odpt.RailDirection:OuterLoop",
                trainType = "odpt.TrainType:Toei.Local",
                trainNumber = "1427B",
                fromStation = "odpt.Station:Toei.Oedo.Tsukishima",
                toStation = "odpt.Station:Toei.Oedo.Kachidoki",
                destinationStation = listOf("odpt.Station:Toei.Oedo.Hikarigaoka"),
                delay = 0,
                carComposition = 0
            )
        )
    }
}



@Preview(widthDp = 320)
@Composable
fun TrainsPreview() {
    Surface {
        Trains(listOf(Train()))
    }
}