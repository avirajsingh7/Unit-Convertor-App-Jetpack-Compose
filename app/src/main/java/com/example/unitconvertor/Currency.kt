package com.example.unitconvertor

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unitconvertor.ui.theme.UnitConvertorTheme

class CurrencyActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConvertorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CurConv()
                }
            }
        }
    }
}


@Composable
fun CurConv(){

    val list_cur = listOf<String>("INR","Dollar","Euro","Dirham","Kuwait_Dinar","Yen","Russian_Ruble","South_Korea_Won","Australian_Dollar","Bangladeshi_Taka")
    var convertFrom = "Hour"
    var convertTo ="Hour"
    var final_text_cur by remember {
        mutableStateOf("")
    }
    Column( modifier = Modifier
        .padding(10.dp)
        .fillMaxSize()
    ) {
        Text(
            text = "Convert Form",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 16.dp)

        )
        convertFrom= MyContent(list_cur)
        Text(
            text = "Convert To",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 16.dp)

        )
        convertTo= MyContent(list_cur)
        var text by remember {
            mutableStateOf("0")
        }
        TextField(value = text, onValueChange ={ text=it},
            modifier = Modifier
                .padding(start = 19.dp, top = 15.dp)
                .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

            )
        Button(onClick = {
            final_text_cur="${Conv_cur(convertFrom,convertTo,text.toDouble())} $convertTo"
        },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 70.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
        ) {
            Text(text = "Calculate", fontSize = 20.sp)
        }
        Text(
            text = final_text_cur,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 60.dp)
                .padding(start = 16.dp)

        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    UnitConvertorTheme {
        TimeConv()
    }
}