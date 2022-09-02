package com.plandel.projectcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MenuApp() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(top = 20.dp)
    ) {
        TabBar(text = "My Card", icon = painterResource(id = R.drawable.ic_baseline_close_24))
        Spacer(modifier = Modifier.height(30.dp))
        CardsSection(cards = listOf(
            Card("R$ 3,200", Color.LightGray),
            Card("R$ 2,250", Color.Blue),
            Card("R$ 33,200", Color.Cyan),
            Card("R$ 6,00", Color.Magenta),
        ))
    }

}

@Composable
fun TabBar(
    modifier: Modifier = Modifier,
    text: String,
    icon: Painter
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .padding(horizontal = 20.dp)
            .fillMaxWidth()
    ) {
        Text(text = text, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 24.sp)
        Image(painter = icon, contentDescription = null)
    }
}

@Composable
fun CardsSection(
    modifier: Modifier = Modifier,
    cards: List<Card>
) {
    LazyRow(
        modifier = modifier
            .fillMaxWidth()
    ) {
        items(cards.size) {
            Box(
                modifier = Modifier
                    .height(290.dp)
                    .width(220.dp)
                    .padding(horizontal = 10.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(color = cards[it].color)
            ) {
                Text(text = cards[it].Text, fontSize = 16.sp, modifier = Modifier.align(Alignment.CenterStart) )
            }
        }
    }
}

