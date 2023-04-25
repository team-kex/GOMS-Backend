package com.project.goms.domain.auth.presentation.data.dto

import com.project.goms.domain.account.presentation.data.enums.Authority
import java.time.LocalDateTime

data class TokenDto(
    val accessToken: String,
    val refreshToken: String,
    val accessTokenExp: LocalDateTime,
    val refreshTokenExp: LocalDateTime,
    val authority: Authority
)