package com.example.contacts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { ContactListScreen() }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ContactListScreen() {
    // generate 100 contacts
    val contacts = remember { generateContacts(100) }
    val grouped = remember(contacts) { contacts.groupBy { it.first().uppercaseChar() } }

    val listState = rememberLazyListState()
    val scope = rememberCoroutineScope()

    // show FAB after 10 items
    val showFab by remember {
        derivedStateOf { listState.firstVisibleItemIndex > 10 }
    }

    Box(Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            state = listState,
            contentPadding = PaddingValues(bottom = 80.dp)
        ) {
            grouped.toSortedMap().forEach { (letter, names) ->
                stickyHeader {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .background(Color(0xFFEFEFEF))
                            .padding(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Text(text = letter.toString(), fontWeight = FontWeight.Bold)
                    }
                }
                items(names) { name ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 10.dp)
                    ) {
                        Text(text = name)
                    }
                }
            }
        }

        if (showFab) {
            FloatingActionButton(
                onClick = { scope.launch { listState.animateScrollToItem(0) } },
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp)
            ) {
                Text("Top")
            }
        }
    }
}

private fun generateContacts(n: Int): List<String> {
    val result = mutableListOf<String>()
    var idx = 1
    outer@ for (c in 'A'..'Z') {
        repeat(5) { 
            result += "$c Contact $idx"
            idx++
            if (result.size >= n) return result
        }
    }
    return result
}