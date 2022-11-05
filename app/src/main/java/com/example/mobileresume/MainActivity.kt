package com.example.mobileresume

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.example.mobileresume.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var mainBinding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        mainBinding.imageViewTwitter.setOnClickListener {
            val urlTwitter= Intent(Intent.ACTION_VIEW)
            urlTwitter.data = Uri.parse("https://twitter.com/ajayititilope14")
            startActivity(urlTwitter)
        }

        mainBinding.imageViewLinkedln.setOnClickListener {
            val urlLinkedln= Intent(Intent.ACTION_VIEW)
            urlLinkedln.data = Uri.parse("https://www.linkedin.com/in/titilope-ajayi-32134b20b/")
            startActivity(urlLinkedln)
        }
        mainBinding.imageViewGithub.setOnClickListener {
            val urlGithub= Intent(Intent.ACTION_VIEW)
            urlGithub.data = Uri.parse("https://github.com/Titilegend")
            startActivity(urlGithub)

        }

    }
}