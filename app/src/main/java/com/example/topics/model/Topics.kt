package com.example.topics.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.topics.R

data class Topic(
    @DrawableRes val topicImageResourceId: Int,
    @DrawableRes val topicDecorativeIconResourceId: Int = R.drawable.ic_grain,
    @StringRes val topicNameResourceId: Int,
    val numberOfCoursesInTopic: Int
)