package droidninja.filepicker.utils

import java.util.concurrent.TimeUnit

object TimeUtils {

    fun formatTime(duration: Int): String {
        val hours = TimeUnit.MILLISECONDS.toHours(duration.toLong()).toInt() % 24
        val minutes = TimeUnit.MILLISECONDS.toMinutes(duration.toLong()).toInt() % 60
        val seconds = TimeUnit.MILLISECONDS.toSeconds(duration.toLong()).toInt() % 60
        return when {
            hours > 0 -> String.format("%d:%02d:%02d", hours, minutes, seconds)
            minutes > 0 -> String.format("%02d:%02d", minutes, seconds)
            seconds > 0 -> String.format("0:%02d", seconds)
            else -> {
                "0:00"
            }
        }
    }

}