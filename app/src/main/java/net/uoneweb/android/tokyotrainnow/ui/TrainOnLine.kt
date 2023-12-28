package net.uoneweb.android.tokyotrainnow.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.uoneweb.android.tokyotrainnow.entity.Train

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

@Preview
@Composable
fun TrainOnLinePreview() {
    Surface {
        TrainOnLine(train = Samples.createTrain(Samples.ascending, "1427B"))
    }
}
