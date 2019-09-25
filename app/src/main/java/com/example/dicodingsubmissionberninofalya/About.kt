package com.example.dicodingsubmissionberninofalya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView

class About : AppCompatActivity() {

    private lateinit var pot : CircleImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        pot = findViewById(R.id.guegue)

        getSupportActionBar()?.setDisplayShowHomeEnabled(true);
        getSupportActionBar()?.setLogo(R.drawable.airbus_logo);
        getSupportActionBar()?.setDisplayUseLogoEnabled(true);
        getSupportActionBar()?.setDisplayShowTitleEnabled(false);
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    fun getImage(imageName: String): Int {

        return resources.getIdentifier(imageName, "drawable", packageName)
    }
}
