package net.uoneweb.android.tokyotrainnow.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import net.uoneweb.android.tokyotrainnow.entity.Railway


@Composable
fun RailwaySelector(
    modifier: Modifier = Modifier,
    railways: List<Railway>,
    current: Railway
) {
    var expanded by remember { mutableStateOf(false) }
    RailwaySelector(modifier, expanded, { expanded = it }, railways, current)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun RailwaySelector(
    modifier: Modifier = Modifier,
    expanded: Boolean = false,
    onExpandedChange: (Boolean) -> Unit = { },
    railways: List<Railway>,
    current: Railway,
) {
    ExposedDropdownMenuBox(
        modifier = modifier,
        expanded = expanded,
        onExpandedChange = onExpandedChange)
    {
        TextField(
            modifier = Modifier
                .menuAnchor()
                .fillMaxWidth(),
            readOnly = true,
            value = current.railwayTitle["ja"] ?: "",
            onValueChange = {  },
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
            colors = ExposedDropdownMenuDefaults.textFieldColors(
                unfocusedContainerColor = Color(current.color)
            )
        )
        ExposedDropdownMenu(expanded = expanded, onDismissRequest = { onExpandedChange(false) }) {
            railways.forEach {
                DropdownMenuItem(
                    text = { Text(text = it.railwayTitle["ja"] ?: "") },
                    onClick = {  },
                    colors = MenuDefaults.itemColors(textColor = Color(it.color))
                )
            }
        }
    }
}

@Preview
@Composable
private fun RailwaySelectorPreview() {
    Surface {
        RailwaySelector(
            railways = listOf(),
            current = oedoLine
        )
    }
}

@Preview(heightDp = 200)
@Composable
private fun RailwaySelectorExpandedPreview() {
    Surface {
        RailwaySelector(
            expanded = true,
            railways = listOf(oedoLine, asakusaLine, mitaLine, shinjukuLine),
            current = oedoLine
        )
    }
}

private val oedoLine = Railway(
    color = android.graphics.Color.parseColor("#CF3366"),
    railwayTitle = mapOf("ja" to "大江戸線", "en" to "Oedo Line")
    )
private val asakusaLine = Railway(
    color = android.graphics.Color.parseColor("#FF535F"),
    railwayTitle = mapOf("ja" to "浅草線", "en" to "Asakusa Line")
)
private val mitaLine = Railway(
    color = android.graphics.Color.parseColor("#0067B0"),
    railwayTitle = mapOf("ja" to "三田線", "en" to "Mita Line")
)
private val shinjukuLine = Railway(
    color = android.graphics.Color.parseColor("#9FB01C"),
    railwayTitle = mapOf("ja" to "新宿線", "en" to "Shinjuku Line")
)
