import com.google.gson.annotations.SerializedName
// To parse the JSON, install kotlin's serialization plugin and do:
//
// val json                   = Json { allowStructuredMapKeys = true }
// val resGetMessageGroupName = json.parse(ResGetMessageGroupName.serializer(), jsonString)

package com.example.bubbel.model.backend

import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

@Serializable
data class ResGetMessageGroupName (
    val error: GetMessageGroupNameError? = null,
    val res: GetMessageGroupNameOut? = null
)

@Serializable
data class GetMessageGroupNameError (
    val type: ResGetMessageGroupNameErrorType,
    val ierror: String? = null
)

@Serializable
enum class ResGetMessageGroupNameErrorType(val value: String) {
    @SerializedName("Internal") Internal("Internal"),
    @SerializedName("NoAuth") NoAuth("NoAuth");
}

@Serializable
data class GetMessageGroupNameOut (
    @SerializedName("display_name")
    val displayName: String? = null
)
