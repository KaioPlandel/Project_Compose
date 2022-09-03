package com.plandel.projectcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
        TabBar(text = "My Card", icon = painterResource(id = R.drawable.ic_baseline_add_24))
        Spacer(modifier = Modifier.height(30.dp))
        CardsSection(
            cards = listOf(
                Card("R$ 3,200", Color.LightGray),
                Card("R$ 2,250", Color.Blue),
                Card("R$ 33,200", Color.Cyan),
                Card("R$ 6,00", Color.Magenta),
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        ButtonSection()
        Spacer(modifier = Modifier.height(30.dp))
        TabSection()
        Spacer(modifier = Modifier.height(20.dp))
        CardBottomSection(Modifier,
        listOf(
            Product("Apple Store","450 $", painterResource(id = R.drawable.ic_baseline_chart)),
            Product("Apple Store","450 $", painterResource(id = R.drawable.ic_baseline_chart)),
            Product("Apple Store","450 $", painterResource(id = R.drawable.ic_baseline_chart))
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
            .padding(start = 20.dp)
    ) {
        items(cards.size) {
            Box(
                modifier = Modifier
                    .height(350.dp)
                    .width(260.dp)
                    .padding(horizontal = 6.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(color = cards[it].color)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp)

                ) {
                    Text(
                        text = cards[it].Text,
                        fontSize = 24.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 15.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "***3245", fontSize = 14.sp, color = Color.White)
                }
            }
        }
    }
}

@Composable
fun ButtonSection(
    modifier: Modifier = Modifier,
) {
    val colorT = Color(31, 31, 31)
    val colorTwo = Color(92, 133, 230)
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(65.dp)
                    .clip(CircleShape)
                    .background(colorTwo)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_add_24),
                    contentDescription = "add",
                    tint = Color.White,
                    modifier = Modifier
                        .align(Alignment.Center),
                )

            }
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Top up",
                color = Color.White,
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(65.dp)
                    .clip(CircleShape)
                    .background(colorT)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_sync_alt_24),
                    contentDescription = "add",
                    tint = Color.White,
                    modifier = Modifier
                        .align(Alignment.Center),
                )

            }
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Top up",
                color = Color.White,
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(65.dp)
                    .clip(CircleShape)
                    .background(colorT)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_chart),
                    contentDescription = "add",
                    tint = Color.White,
                    modifier = Modifier
                        .align(Alignment.Center),
                )

            }
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Top up",
                color = Color.White,
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun TabSection(
    modifier: Modifier = Modifier,
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier =
        modifier
            .fillMaxWidth()
            .padding(horizontal = 25.dp)
    ) {
        Text(
            text = "Today",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(start = 10.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_speaker_notes_24),
            tint = Color.White,
            contentDescription = null,
            modifier = Modifier.size(15.dp)
        )
    }
}

@Composable
fun CardBottomSection(
    modifier: Modifier = Modifier,
    products: List<Product>
) {
    val color = Color(31, 31, 31)
    LazyColumn(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        items(products.size) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .padding(bottom = 12.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(color)

            ) {
                Row(
                    modifier = Modifier.padding(start = 10.dp)
                ){
                    Box(
                        modifier = Modifier
                            .size(41.dp)
                            .clip(RoundedCornerShape(13.dp))
                            .background(Color.White)
                    ) {
                        Image(
                            painter = products[it].image,
                            contentDescription = products[it].name,
                            modifier = Modifier.align(
                                Alignment.Center
                            )
                        )
                    }
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = products[it].name,
                        fontSize = 18.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
                Text(text = products[it].price, fontSize = 18.sp, color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.padding(end = 10.dp))
            }
        }
    }
}

