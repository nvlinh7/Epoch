package linh.nv7.epoch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import linh.nv7.epoch.ui.theme.MyTheme
import linh.nv7.epoch.viewmodel.MainViewModel
import linh.nv7.epoch.components.TimerScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    val viewModel: MainViewModel = viewModel()
    TimerScreen(viewModel)
}