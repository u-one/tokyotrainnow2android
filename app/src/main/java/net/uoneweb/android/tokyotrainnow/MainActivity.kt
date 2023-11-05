package net.uoneweb.android.tokyotrainnow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import net.uoneweb.android.tokyotrainnow.ui.theme.TokyoTrainNow2Theme

@OptIn(ExperimentalMaterial3Api::class)
@AndroidEntryPoint
class MainActivity  : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            Scaffold(
                bottomBar = {
                BottomAppBar(actions = {
                    IconButton(onClick = {
                        navController.navigate("railway")
                    }) {
                        Icon(Icons.Filled.List, contentDescription = null)
                    }
                    IconButton(onClick = {
                        navController.navigate("trains")
                    }) {
                        Icon(Icons.Filled.PlayArrow, contentDescription = null)
                    }
                })
            }) { contentPadding ->
                Box(modifier = Modifier.padding(contentPadding)) {
                    NavHost(navController = navController, startDestination = "railway") {
                        composable("railway") {
                            RailwayScreen(viewModel = hiltViewModel())
                        }
                        composable("trains") {
                            TrainsScreen(viewModel = hiltViewModel())
                        }
                    }
                }
            }
        }
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