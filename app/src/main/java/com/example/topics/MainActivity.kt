package com.example.topics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.topics.datasource.Datasource
import com.example.topics.model.Topic
import com.example.topics.ui.theme.TopicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TopicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TopicApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun TopicApp(modifier: Modifier = Modifier) {
    val layoutDirection = LocalLayoutDirection.current
    val coursesOfRow = Datasource.loadTopicsForRow()

    Surface(
        modifier = modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(
                start = WindowInsets.safeDrawing
                    .asPaddingValues()
                    .calculateStartPadding(layoutDirection = layoutDirection),
                end = WindowInsets.safeDrawing
                    .asPaddingValues()
                    .calculateEndPadding(layoutDirection = layoutDirection)
            )
    ) {
        TopicListOfRows(courses = coursesOfRow)
    }
}

@Composable
fun TopicListOfRows(courses: List<List<Topic>>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(items = courses) { courses ->
            val firstCourse = courses.first()
            val secondCourse = courses.last()

            Row(modifier = modifier) {
                TopicCard(
                    course = firstCourse,
                    modifier = modifier
                        .fillMaxWidth(0.5F)
                )

                TopicCard(
                    course = secondCourse,
                    modifier = modifier
                        .fillMaxWidth()
                )
            }
        }
    }
}
// @Composable
//fun TopicApp(modifier: Modifier = Modifier) {
//    val courses = Datasource.loadTopicsForRow()
//
//    LazyColumn(modifier = modifier) {
//        items(items = courses) { twoCourses ->
//            Row(modifier = modifier) {
//                twoCourses.forEachIndexed { index, course ->
//                    TopicCard(course = course)
//                    when (index) {
//                        0 -> TopicCard(
//                            course = course,
//                            modifier = modifier
//                                .padding(start = 8.dp)
//                                .fillMaxWidth(0.5F)
//                        )
//
//                        else -> TopicCard(
//                            course = course,
//                            modifier = modifier
//                                .padding(end = 8.dp)
//                                .fillMaxWidth()
//                        )
//                    }
//                }
//            }
//        }
//    }
//}

@Composable
fun TopicCard(course: Topic, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 2.dp)
    ) {
        Row(
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier
        ) {
            Image(
                painter = painterResource(id = course.topicImageResourceId),
                contentDescription = stringResource(id = course.topicNameResourceId)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(
                    text = stringResource(id = course.topicNameResourceId),
                    style = MaterialTheme.typography.bodyMedium
                )

                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier) {
                    Icon(
                        painter = painterResource(id = course.topicDecorativeIconResourceId),
                        contentDescription = null
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Text(
                        text = course.numberOfCoursesInTopic.toString(),
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TopicAppPreview() {
    TopicsTheme {
        TopicApp(modifier = Modifier.padding())
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TopicCardPreview() {
    TopicsTheme {
        TopicCard(
            course = Topic(
                topicImageResourceId = R.drawable.architecture,
                topicNameResourceId = R.string.architecture,
                numberOfCoursesInTopic = 58
            ),
            modifier = Modifier
                .padding(start = 8.dp)
                .fillMaxWidth(0.5F)
        )
    }
}