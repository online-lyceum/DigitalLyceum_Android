package com.example.lyceumapp.json.subgroups

import com.squareup.moshi.Json

data class
GradeSubgroupsJson(
    @Json(name = "subgroups") val subgroups: List<SubgroupJson>
)
