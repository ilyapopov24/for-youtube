package android.mentor.foryoutube

import android.mentor.foryoutube.databinding.ActivityMainBinding
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var vb: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        vb = ActivityMainBinding.inflate(layoutInflater)
        vb?.root?.let(::setContentView)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        vb?.recyclerView?.adapter = LightAdapter(listOf(
            "SDfsfsdf",
            "First1",
            "Second1",
            "Second2",
            "First2",
            "jkhuidfg",
        ))
    }
}