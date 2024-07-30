package com.example.topics.datasource

import com.example.topics.R
import com.example.topics.model.Topic

object Datasource {
    fun loadTopics(): List<Topic> {
        return listOf(
            Topic(
                topicImageResourceId = R.drawable.architecture,
                topicNameResourceId = R.string.architecture,
                numberOfCoursesInTopic = 58
            ),
            Topic(
                topicImageResourceId = R.drawable.automotive,
                topicNameResourceId = R.string.automotive,
                numberOfCoursesInTopic = 30
            ),
            Topic(
                topicImageResourceId = R.drawable.biology,
                topicNameResourceId = R.string.biology,
                numberOfCoursesInTopic = 90
            ),
            Topic(
                topicImageResourceId = R.drawable.crafts,
                topicNameResourceId = R.string.crafts,
                numberOfCoursesInTopic = 121
            ),
            Topic(
                topicImageResourceId = R.drawable.business,
                topicNameResourceId = R.string.business,
                numberOfCoursesInTopic = 78
            ),
            Topic(
                topicImageResourceId = R.drawable.culinary,
                topicNameResourceId = R.string.culinary,
                numberOfCoursesInTopic = 118
            ),
            Topic(
                topicImageResourceId = R.drawable.design,
                topicNameResourceId = R.string.design,
                numberOfCoursesInTopic = 423
            ),
            Topic(
                topicImageResourceId = R.drawable.ecology,
                topicNameResourceId = R.string.ecology,
                numberOfCoursesInTopic = 28
            ),
            Topic(
                topicImageResourceId = R.drawable.engineering,
                topicNameResourceId = R.string.engineering,
                numberOfCoursesInTopic = 67
            ),
            Topic(
                topicImageResourceId = R.drawable.fashion,
                topicNameResourceId = R.string.fashion,
                numberOfCoursesInTopic = 92
            ),
            Topic(
                topicImageResourceId = R.drawable.finance,
                topicNameResourceId = R.string.finance,
                numberOfCoursesInTopic = 100
            ),
            Topic(
                topicImageResourceId = R.drawable.film,
                topicNameResourceId = R.string.film,
                numberOfCoursesInTopic = 165
            ),
            Topic(
                topicImageResourceId = R.drawable.gaming,
                topicNameResourceId = R.string.gaming,
                numberOfCoursesInTopic = 37
            ),
            Topic(
                topicImageResourceId = R.drawable.geology,
                topicNameResourceId = R.string.geology,
                numberOfCoursesInTopic = 290
            ),
            Topic(
                topicImageResourceId = R.drawable.drawing,
                topicNameResourceId = R.string.drawing,
                numberOfCoursesInTopic = 326
            ),
            Topic(
                topicImageResourceId = R.drawable.history,
                topicNameResourceId = R.string.history,
                numberOfCoursesInTopic = 189
            ),
            Topic(
                topicImageResourceId = R.drawable.journalism,
                topicNameResourceId = R.string.journalism,
                numberOfCoursesInTopic = 96
            ),
            Topic(
                topicImageResourceId = R.drawable.law,
                topicNameResourceId = R.string.law,
                numberOfCoursesInTopic = 58
            ),
            Topic(
                topicImageResourceId = R.drawable.lifestyle,
                topicNameResourceId = R.string.lifestyle,
                numberOfCoursesInTopic = 305
            ),
            Topic(
                topicImageResourceId = R.drawable.music,
                topicNameResourceId = R.string.music,
                numberOfCoursesInTopic = 212
            ),
            Topic(
                topicImageResourceId = R.drawable.painting,
                topicNameResourceId = R.string.painting,
                numberOfCoursesInTopic = 172
            ),
            Topic(
                topicImageResourceId = R.drawable.physics,
                topicNameResourceId = R.string.physics,
                numberOfCoursesInTopic = 65
            ),
            Topic(
                topicImageResourceId = R.drawable.tech,
                topicNameResourceId = R.string.tech,
                numberOfCoursesInTopic = 118
            ),
            Topic(
                topicImageResourceId = R.drawable.drawing,
                topicNameResourceId = R.string.drawing,
                numberOfCoursesInTopic = 326
            )

        )
    }
}