package net.uoneweb.android.tokyotrainnow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.hilt.android.AndroidEntryPoint
import net.uoneweb.android.odpt.Railway
import net.uoneweb.android.tokyotrainnow.ui.theme.TokyoTrainNow2Theme

@AndroidEntryPoint
class MainActivity  : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RailwayScreen()
        }
    }
}

@Composable
fun RailwayScreen(
    viewModel: RailwayViewModel = hiltViewModel()
) {
    val railway = viewModel.railway.collectAsState(initial = null)
    railway.value?.let {
        Railway(railway = it)
    }
}

@Composable
fun Railway(modifier: Modifier = Modifier, railway: Railway) {
    Text(modifier = modifier, text = railway.title)
}

@Preview
@Composable
fun RailwayPreview() {
    Surface {
        Railway(railway = Railway(title = "都営大江戸線"))
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TokyoTrainNow2Theme {
        Greeting("Android")
    }
}