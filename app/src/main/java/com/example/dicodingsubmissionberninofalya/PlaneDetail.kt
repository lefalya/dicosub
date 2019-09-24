package com.example.dicodingsubmissionberninofalya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

class PlaneDetail : AppCompatActivity() {

    private lateinit var planeName : TextView
    private lateinit var range : TextView
    private lateinit var twoClass : TextView
    private lateinit var length : TextView
    private lateinit var imgVw : ImageView
    private lateinit var shortDescription : TextView
    private lateinit var planePic : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plane_detail)

        planeName = findViewById(R.id.planeName)
        range = findViewById(R.id.range)
        twoClass = findViewById(R.id.twoClass)
        length = findViewById(R.id.length)
        imgVw = findViewById(R.id.planeImage)
        shortDescription = findViewById(R.id.shortDescription)
        planePic = findViewById(R.id.planePic)

        val pName = intent.getSerializableExtra("selected_plane") as? Plane
        planeName.setText(pName?.name)
        range.setText(pName?.range.toString())
        twoClass.setText(pName?.seating)
        shortDescription.setText(pName?.shortDescription)

        Glide.with(this)
            .load(pName?.backgroundPhoto)
            .apply(RequestOptions().override(350,550))
            .into(planePic)

        Glide.with(this)
            .load(pName?.photo)
            .apply(RequestOptions().override(350,550))
            .into(imgVw)

        getSupportActionBar()?.setDisplayShowHomeEnabled(true);
        getSupportActionBar()?.setLogo(R.drawable.airbus_logo);
        getSupportActionBar()?.setDisplayUseLogoEnabled(true);
        getSupportActionBar()?.setDisplayShowTitleEnabled(false);
    }


}
