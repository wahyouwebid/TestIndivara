package com.wahyouwebid.app.modules.detail.data.model


import androidx.annotation.Keep
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Keep
data class SpokenLanguage(
    @SerializedName("english_name")
    @Expose
    val englishName: String?,
    @SerializedName("iso_639_1")
    @Expose
    val iso6391: String?,
    @SerializedName("name")
    @Expose
    val name: String?
)