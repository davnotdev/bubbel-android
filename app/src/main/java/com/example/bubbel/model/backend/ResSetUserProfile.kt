// To parse the JSON, install kotlin's serialization plugin and do:
//
// val json              = Json { allowStructuredMapKeys = true }
// val resSetUserProfile = json.parse(ResSetUserProfile.serializer(), jsonString)

package com.example.bubbel.model.backend

import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

@Serializable
data class ResSetUserProfile (
    val error: SetUserProfileError? = null,
    val res: JsonElement? = null
)

@Serializable
data class SetUserProfileError (
    val type: SetUserProfileType,
    val ierror: String? = null
)

@Serializable
enum class SetUserProfileType(val value: String) {
    @SerialName("Internal") Internal("Internal"),
    @SerialName("NoAuth") NoAuth("NoAuth");
}
