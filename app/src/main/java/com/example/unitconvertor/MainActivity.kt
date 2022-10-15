package com.example.unitconvertor

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unitconvertor.ui.theme.UnitConvertorTheme
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConvertorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    UnitConv()
                }
            }
        }
    }
}

@Composable
fun UnitConv() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
        Text(
            text = "Unit Convertor",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 30.dp)
        )

        Button(onClick = { context.startActivity(Intent(context,DistanceActivity::class.java)) },
            modifier = Modifier.align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
        ) {
            Image(painter = painterResource(id = R.drawable.length),
                contentDescription ="Length image",
                modifier = Modifier.size(150.dp)
            )
        }
        Button(onClick = { context.startActivity(Intent(context,CurrencyActivity::class.java))},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(30.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
        ) {
            Image(painter = painterResource(id = R.drawable.rupee),
                contentDescription ="Rupee image",
                modifier = Modifier.size(150.dp)
            )
        }
        Button(onClick = {context.startActivity(Intent(context,TimeActivity2::class.java)) },
            modifier = Modifier.align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
        ) {
            Image(painter = painterResource(id = R.drawable.time),
                contentDescription ="Time image",
                modifier = Modifier.size(150.dp)
            )
        }
    }

}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UnitConvertorTheme {
        UnitConv()
    }
}