package com.arakene.techblog.ui

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily

import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import techblog.composeapp.generated.resources.Pretendard_Medium
import techblog.composeapp.generated.resources.Res


// Pretendard 폰트를 사용하는 Typography
@Composable
fun pretendardTypography() : Typography{
    val pretendardFontFamily = FontFamily(Font(Res.font.Pretendard_Medium, FontWeight.Normal))

    return Typography().run {

        // 모든 텍스트 스타일에 Pretendard 폰트 패밀리를 적용합니다.
        copy(
            displayLarge = this.displayLarge.copy(fontFamily = pretendardFontFamily),
            displayMedium = this.displayMedium.copy(fontFamily = pretendardFontFamily),
            displaySmall = this.displaySmall.copy(fontFamily = pretendardFontFamily),
            headlineLarge = this.headlineLarge.copy(fontFamily = pretendardFontFamily),
            headlineMedium = this.headlineMedium.copy(fontFamily = pretendardFontFamily),
            headlineSmall = this.headlineSmall.copy(fontFamily = pretendardFontFamily),
            titleLarge = this.titleLarge.copy(fontFamily = pretendardFontFamily),
            titleMedium = this.titleMedium.copy(fontFamily = pretendardFontFamily),
            titleSmall = this.titleSmall.copy(fontFamily = pretendardFontFamily),
            bodyLarge = this.bodyLarge.copy(fontFamily = pretendardFontFamily),
            bodyMedium = this.bodyMedium.copy(fontFamily = pretendardFontFamily),
            bodySmall = this.bodySmall.copy(fontFamily = pretendardFontFamily),
            labelLarge = this.labelLarge.copy(fontFamily = pretendardFontFamily),
            labelMedium = this.labelMedium.copy(fontFamily = pretendardFontFamily),
            labelSmall = this.labelSmall.copy(fontFamily = pretendardFontFamily)
        )
    }
}