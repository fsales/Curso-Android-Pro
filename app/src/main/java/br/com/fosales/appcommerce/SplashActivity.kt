package br.com.fosales.appcommerce

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val intent: Intent = Intent(this, MainActivity::class.java)

        lifecycleScope.launchWhenCreated {
            delay(3000)
            startActivity(intent)
            finish()
        }
    }
}