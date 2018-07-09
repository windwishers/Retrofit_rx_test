package fail.toepic.retrofit_rx_test.LoadTime.Model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name="result")
data class ErrorInfo(@field:Element(name = "message") var message: String = "", @field:Element(name = "error_code") var error_code: String? = null) {

    override fun toString(): String {
        return message + (error_code?.let {" : $it"} ?: "")
    }
}