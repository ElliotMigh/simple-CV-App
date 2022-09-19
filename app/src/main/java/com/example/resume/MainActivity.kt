package com.example.resume

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.resume.databinding.ActivityMainBinding

const val INSTAGRAM_ADDRESS = "https://www.instagram.com/invites/contact/?i=1u3mnntjkitg0&utm_content=36rxmkb"
const val LINKDIEN_ADDRESS = "https://www.linkedin.com/in/matin-mighani-748951221"
const val TWITTER_ADDRESS = "https://twitter.com/elliotmigh?t=nujLHoRdmAwS0oUiVg78xA&s=08"

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //insert function
        goToSocial()
    }

    private fun goToSocial() {
        binding.imgInstagram.setOnClickListener {
            val intentInstagram = Intent(Intent.ACTION_VIEW, Uri.parse(INSTAGRAM_ADDRESS))
            startActivity(intentInstagram)
        }
        binding.imgLindien.setOnClickListener {
            val intentLinkdien = Intent(Intent.ACTION_VIEW, Uri.parse(LINKDIEN_ADDRESS))
            startActivity(intentLinkdien)
        }
        binding.imgTwitter.setOnClickListener {
            val intentTwitter = Intent(Intent.ACTION_VIEW,Uri.parse(TWITTER_ADDRESS))
            startActivity(intentTwitter)
        }
    }
}