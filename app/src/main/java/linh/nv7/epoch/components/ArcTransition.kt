package linh.nv7.epoch.components

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember

class ArcTransition(progress: State<Float>) {
    val progress by progress
}

@Composable
fun updateCircularTransitionData(
    remainingTime: Long,
    totalTime: Long
): ArcTransition {
    val transition = updateTransition(targetState = remainingTime)

    val progress = transition.animateFloat(
        transitionSpec = { tween(1000, easing = FastOutSlowInEasing) }, label = ""
    ) { timeLeft ->
        if (timeLeft < 0) {
            360f
        } else {
            360f - ((360f / totalTime) * (totalTime - timeLeft))
        }
    }

    return remember(transition) { ArcTransition(progress = progress) }
}