package com.airpods.battery.monitor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airpods.battery.monitor.ui.theme.AirPodsBatteryMonitorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AirPodsBatteryMonitorTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    var leftBattery by remember { mutableStateOf(0) }
    var rightBattery by remember { mutableStateOf(0) }
    var caseBattery by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "AirPods 电量监测",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        BatteryCard(
            title = "左耳",
            batteryLevel = leftBattery
        )
        
        Spacer(modifier = Modifier.height(8.dp))
        
        BatteryCard(
            title = "右耳",
            batteryLevel = rightBattery
        )
        
        Spacer(modifier = Modifier.height(8.dp))
        
        BatteryCard(
            title = "充电盒",
            batteryLevel = caseBattery
        )
    }
}

@Composable
fun BatteryCard(
    title: String,
    batteryLevel: Int
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.h6
            )
            Spacer(modifier = Modifier.height(8.dp))
            LinearProgressIndicator(
                progress = batteryLevel / 100f,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "$batteryLevel%",
                style = MaterialTheme.typography.body1
            )
        }
    }
} 