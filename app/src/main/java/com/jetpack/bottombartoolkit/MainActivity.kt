package com.jetpack.bottombartoolkit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.jetpack.bottombartoolkit.ui.theme.BottombarToolkitTheme
import com.jetpack.bottombartoolkit.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottombarToolkitTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = {
                                    Text(
                                        text = "BottomBar Toolkit",
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center
                                    )
                                }
                            )
                        },
                        content = {

                        },
                        bottomBar = {
                            BottomAppBar(
                                cutoutShape = CutCornerShape(30),
                                content = {
                                    BottomNavigation {
                                        BottomNavigationItem(
                                            selected = true,
                                            onClick = { /*TODO*/ },
                                            icon = {
                                                Icon(Icons.Filled.Home, contentDescription = "home")
                                            },
                                            label = { Text(text = "Home") },
                                            alwaysShowLabel = true
                                        )

                                        BottomNavigationItem(
                                            selected = false,
                                            onClick = { /*TODO*/ },
                                            icon = {
                                                Icon(Icons.Filled.Settings, contentDescription = "setting")
                                            },
                                            label = {
                                                Text(text = "Setting")
                                            },
                                            alwaysShowLabel = false
                                        )
                                    }
                                }
                            )
                        },
                        floatingActionButton = {
                            FloatingActionButton(
                                onClick = { /*TODO*/ },
                                shape = RoundedCornerShape(50),
                                backgroundColor = Teal200
                            ) {
                                Icon(Icons.Filled.Add, tint = Color.White, contentDescription = "Add")
                            }
                        },
                        isFloatingActionButtonDocked = true,
                        floatingActionButtonPosition = FabPosition.Center
                    )
                }
            }
        }
    }
}


















