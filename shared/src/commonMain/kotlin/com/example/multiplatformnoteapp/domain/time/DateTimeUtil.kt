package com.example.multiplatformnoteapp.domain.time

import kotlinx.datetime.*

// NOTE: this is not a best approach to convert datetime
// use platform specific approach to convert date and time

object DateTimeUtil {
    fun now(): LocalDateTime {
        return Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault())
    }

    fun toEpochMillis(dateTime: LocalDateTime): Long {
        return dateTime.toInstant(TimeZone.currentSystemDefault()).toEpochMilliseconds()
    }

    fun formatNoteDate(dateTime: LocalDateTime): String {
        val dayOfMonth = dateTime.dayOfMonth
        val hourOfDay = dateTime.hour
        val minOfHour = dateTime.minute
        val month = dateTime.month.name.lowercase().take(3)
            .replaceFirstChar { firstLetter -> firstLetter.uppercase() }
        val day = if (dayOfMonth < 10) "0$dayOfMonth" else dayOfMonth.toString()
        val year = dateTime.year.toString()
        val hour = if(hourOfDay < 10) "0$hourOfDay" else hourOfDay.toString()
        val min = if(minOfHour < 10) "0$minOfHour" else minOfHour.toString()

        return buildString {
            append(month)
            append(" ")
            append(day)
            append(" ")
            append(year)
            append(" ")
            append(hour)
            append(":")
            append(min)
        }
    }
}