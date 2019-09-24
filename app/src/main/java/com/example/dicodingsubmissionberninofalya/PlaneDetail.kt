package com.example.dicodingsubmissionberninofalya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class PlaneDetail : AppCompatActivity() {

    private lateinit var planeName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plane_detail)

        planeName= findViewById(R.id.planeName)

        val pName = intent.getSerializableExtra("selected_plane") as? Plane
        planeName.setText(pName?.name)
    }


}
