package com.android.e_cipari.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Artikel(
    var title: String,
    var description: String,
    var image: Int
): Parcelable