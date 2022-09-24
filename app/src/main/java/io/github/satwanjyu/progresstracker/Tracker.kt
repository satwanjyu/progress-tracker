package io.github.satwanjyu.progresstracker

data class Tracker(
    val id: Int,
    val name: String,
    val steps: List<Step>
)

data class Step(
    val name: String,
    val completed: Boolean
)

val fakeTrackers = listOf(
    Tracker(
        id = 1,
        name = "Android Development",
        steps = listOf(
            Step("Learn Kotlin", true),
            Step("Learn Jetpack Compose", false),
            Step("Build an app", false)
        )
    ),
    Tracker(
        id = 2,
        name = "Jetpack Compose",
        steps = listOf(
            Step("Learn Jetpack Compose", true),
            Step("Build an app", false)
        )
    ),
    Tracker(
        id = 3,
        name = "Jetpack Compose",
        steps = listOf(
            Step("Learn Jetpack Compose", true),
            Step("Build an app", false)
        )
    ),
    Tracker(
        id = 4,
        name = "Jetpack Compose",
        steps = listOf(
            Step("Learn Jetpack Compose", true),
            Step("Build an app", false)
        )
    ),
    Tracker(
        id = 5,
        name = "Jetpack Compose",
        steps = listOf(
            Step("Learn Jetpack Compose", true),
            Step("Build an app", false)
        )
    ),
    Tracker(
        id = 6,
        name = "Jetpack Compose",
        steps = listOf(
            Step("Learn Jetpack Compose", true),
            Step("Build an app", false)
        )
    ),
    Tracker(
        id = 7,
        name = "Jetpack Compose",
        steps = listOf(
            Step("Learn Jetpack Compose", true),
            Step("Build an app", false)
        )
    ),
    Tracker(
        id = 8,
        name = "Jetpack Compose",
        steps = listOf(
            Step("Learn Jetpack Compose", true),
            Step("Build an app", false)
        )
    ),
    Tracker(
        id = 9,
        name = "Jetpack Compose",
        steps = listOf(
            Step("Learn Jetpack Compose", true),
            Step("Build an app", false)
        )
    ),
    Tracker(
        id = 10,
        name = "Jetpack Compose",
        steps = listOf(
            Step("Learn Jetpack Compose", true),
            Step("Build an app", false)
        )
    ),
)