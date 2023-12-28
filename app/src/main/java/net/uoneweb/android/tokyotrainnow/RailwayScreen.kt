package net.uoneweb.android.tokyotrainnow

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.uoneweb.android.tokyotrainnow.entity.Railway
import net.uoneweb.android.tokyotrainnow.entity.Train
import net.uoneweb.android.tokyotrainnow.ui.Railway

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun RailwayScreen(
    viewModel: RailwayViewModel
) {
    val railway = viewModel.railwayStatus.collectAsState(initial = null)
    Scaffold(topBar = {
        // RailwaySelector()
    }) { innerPadding ->
        railway.value?.let { railwayStatus ->
            Railway(
                modifier = Modifier.consumeWindowInsets(innerPadding),
                padding = innerPadding,
                railwayStatus = railwayStatus
            )
        }
    }
}

@Preview
@Composable
private fun RailwayScreenPreview() {
    val viewModel = RailwayViewModel(repository)

    Surface {
        RailwayScreen(viewModel)
    }
}

private val repository = object : RailwayRepository {
        override suspend fun getRailway(railway: String): Railway {
            return Railway()
        }

        override suspend fun getTrains(railway: String): List<Train> {
            return listOf()
        }
    }
