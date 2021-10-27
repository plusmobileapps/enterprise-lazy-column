package com.plusmobileapps.enterpriselazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.plusmobileapps.enterpriselazycolumn.ui.theme.EnterpriseLazyColumnTheme
import com.plusmobileapps.ui.EnterpriseLazyColumn

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EnterpriseLazyColumnTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold(
                        topBar = {
                            TopAppBar {
                                Text("Enterprise LazyColumn")
                            }
                        }
                    ) {
                        EnterpriseLazyColumn(flow = viewModel.state)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EnterpriseLazyColumnTheme {
        Greeting("Android")
    }
}