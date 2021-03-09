package dev.oceanbit.ultralistview

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.oceanbit.ultralistview.ui.theme.UltraListViewTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UltraListViewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.primary
                ) {
                    Surface(
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        UltraItemsScreen()
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UltraListViewTheme {
        UltraItemsScreen()
    }
}