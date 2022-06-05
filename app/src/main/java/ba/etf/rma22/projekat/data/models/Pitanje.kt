package ba.etf.rma22.projekat.data.models

import com.google.gson.annotations.SerializedName

data class Pitanje(
    @SerializedName("id") val id: Int,
    @SerializedName("naziv") val naziv: String,
    @SerializedName("tekstPitanja") val tekstPitanja: String,
    @SerializedName("opcije") val opcije: List<String>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pitanje

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }
}