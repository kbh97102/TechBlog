package com.arakene.techblog.expects

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
expect fun KoreanSupportTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String = ""
)