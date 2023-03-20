package com.example.multiplatformnoteapp.domain.note

import com.example.multiplatformnoteapp.presentation.RedOrangeHex
import com.example.multiplatformnoteapp.presentation.RedPinkHex
import com.example.multiplatformnoteapp.presentation.BabyBlueHex
import com.example.multiplatformnoteapp.presentation.LightGreenHex
import com.example.multiplatformnoteapp.presentation.VioletHex
import kotlinx.datetime.LocalDateTime

data class Note(
    val id: Long?,
    val title: String,
    val content: String,
    val colorHex: Long,
    val created: LocalDateTime,
) {
    companion object {
        private val colors =
            listOf(RedOrangeHex, RedPinkHex, BabyBlueHex, LightGreenHex, VioletHex)

        fun generateRandomColor() = colors.random()
    }
}
