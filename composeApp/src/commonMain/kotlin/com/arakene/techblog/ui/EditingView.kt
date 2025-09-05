package com.arakene.techblog.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mikepenz.markdown.m3.Markdown
import com.mikepenz.markdown.model.rememberMarkdownState

@Composable
fun EditingView() {

    val test = """
    # Hello Markdown

    This is a simple markdown example with:

    - Bullet points
    - **Bold text**
    - *Italic text*

    [Check out this link](https://github.com/mikepenz/multiplatform-markdown-renderer)
    """.trimIndent()

    val state = rememberMarkdownState(test)

    Row(modifier = Modifier.fillMaxSize()) {
        Markdown(
            markdownState = state,
            modifier = Modifier.fillMaxSize()
        )

    }

}