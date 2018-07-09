package fail.toepic.retrofit_rx_test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import fail.toepic.retrofit_rx_test.LoadTime.LoadTime

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //http://global.apis.naver.com/currentTime
        // 반환 타입 api.
        setContentView(R.layout.activity_main)

        LoadTime().load (
                onLoaded = { t-> Log.d("dwlrma",""+t) },
                onError = { t -> Log.e("dwlrma",""+t) }
        )
    }
}
