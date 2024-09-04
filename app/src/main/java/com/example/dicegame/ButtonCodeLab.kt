package com.example.dicegame

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun DiceRollerApp(){
    DiceWithButtonAndImage()
}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier){
    var result by remember {
        mutableStateOf(1)
    }
    var diceIcon = R.drawable.dice_1

    when(result){
        1 -> diceIcon = R.drawable.dice_1
        2 -> diceIcon = R.drawable.dice_2
        3 -> diceIcon = R.drawable.dice_3
        4 -> diceIcon = R.drawable.dice_4
        5 -> diceIcon = R.drawable.dice_5
        6 -> diceIcon = R.drawable.dice_6
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Image(painter = painterResource(diceIcon), contentDescription = stringResource(R.string.dice))

        Spacer(modifier = Modifier.height(16.dp));

        Button(onClick = {
            result = (1..6).random()

        }) {

            Text(stringResource(id = R.string.roll))
        }
    }
}