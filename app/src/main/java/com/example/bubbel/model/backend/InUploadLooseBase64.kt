import com.google.gson.annotations.SerializedName
// To parse the JSON, install kotlin's serialization plugin and do:
//
// val json                = Json { allowStructuredMapKeys = true }
// val inUploadLooseBase64 = json.parse(InUploadLooseBase64.serializer(), jsonString)

package com.example.bubbel.model.backend

import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

@Serializable
data class InUploadLooseBase64 (
    val data: String,

    @SerializedName("file_name")
    val fileName: String,

    val token: String
)
