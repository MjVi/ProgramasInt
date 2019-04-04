package android.itesm.edu.programasinternacionalesccm

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(// a thread in Android
            {
                val intent = Intent(this@Splash, Menu::class.java)
                startActivity(intent) // Go, go, go
                finish() // kill this activity
            }, 3000) // time in milliseconds
    }
}