package com.example.courses.data

import com.example.courses.R
import com.example.courses.model.Topic

object DataSource {
    val topics = listOf(
        Topic(R.string.mercury, 1, R.drawable.mercury),
        Topic(R.string.venus, 2, R.drawable.venus),
        Topic(R.string.earth, 3, R.drawable.earth),
        Topic(R.string.mars, 4, R.drawable.mars),
        Topic(R.string.jupiter, 5, R.drawable.jupiter),
        Topic(R.string.saturn, 6, R.drawable.saturn),
        Topic(R.string.uranus, 7, R.drawable.uranus),
        )
}