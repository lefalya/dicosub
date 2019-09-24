package com.example.dicodingsubmissionberninofalya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    private lateinit var rvPlanes : RecyclerView
    private var list : ArrayList<Plane> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPlanes = findViewById(R.id.rv_planes)
        rvPlanes.setHasFixedSize(true)

        list.addAll(PlanesData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvPlanes.layoutManager = LinearLayoutManager(this)
        val cardViewPlaneAdapter = CardViewPlaneAdapter(list)
        rvPlanes.adapter = cardViewPlaneAdapter

        cardViewPlaneAdapter.setOnItemClickCallback(object : CardViewPlaneAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Plane) {
                showDetails(data)
            }
        })
    }

    private fun showDetails(plane : Plane){
        val goToDetails = Intent(this@MainActivity, PlaneDetail::class.java)
        goToDetails.putExtra("selected_plane", plane as Serializable)
        startActivity(goToDetails)
    }
}
