package com.azamovhudstc.graphqlanilist.data.model.ui_models
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Episodes(
    val title: String? = "",
    val thumbnail: String? = ""
) : Parcelable
