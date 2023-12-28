package net.uoneweb.android.tokyotrainnow.ui

import androidx.compose.foundation.Canvas
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import net.uoneweb.android.tokyotrainnow.entity.Section
import net.uoneweb.android.tokyotrainnow.ui.Samples.interStation
import net.uoneweb.android.tokyotrainnow.ui.Samples.tochomaeStation

@Composable
fun Line(modifier : Modifier = Modifier, lineColor: Color, section: Section) {
    Canvas(modifier = modifier) {
        drawRect(color = lineColor)
        if (section is Section.Station) {
            drawCircle(color = Color.White, radius = size.width / 3)
        }
    }
}

@Preview(widthDp = 20, heightDp = 100)
@Composable
private fun LinePreviewStation() {
    Surface {
        Line(
            lineColor = Color(android.graphics.Color.parseColor("#CF3366")),
            section = tochomaeStation()
        )
    }
}

@Preview(widthDp = 20, heightDp = 100)
@Composable
private fun LinePreviewSection() {
    Surface {
        Line(
            lineColor = Color(android.graphics.Color.parseColor("#CF3366")),
            section = interStation()
        )
    }
}
