package helloworld.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.text.Text
import helloworld.components.layouts.PageLayout
import helloworld.components.widgets.GoHomeLink
import org.jetbrains.compose.web.dom.P

@Page
@Composable
fun AboutPage() {
    PageLayout("ABOUT") {
        Text("This is a skeleton app used to showcase a basic site made using Kobweb")
        P()
        GoHomeLink()
    }
}