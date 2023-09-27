package com.example.attpam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.attpam.ui.theme.AttPAMTheme
import components.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AttPAMTheme {
                val darkMode = remember { mutableStateOf(false) }
                AttPAMTheme(darkTheme = darkMode.value) { // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        Content(darkMode = darkMode)
                    }
                }
            }
        }
    }

    @Composable
    fun Content(darkMode: MutableState<Boolean>) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            BotonNormal()
            Space()
            BotonNormal2()
            Space()
            BotonTexto()
            Space()
            BotonOutline()
            Space()
            BotonIcono()
            Space()
            BotonSwitch()
            Space()
            DarkMode(darkMode = darkMode)
            Space()
            FloatingAction()

        }

    }
}