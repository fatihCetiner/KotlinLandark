package com.fatihcetiner.landmarkrw.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fatihcetiner.landmarkrw.model.Landmark
import com.fatihcetiner.landmarkrw.adapter.LandmarkAdapter
import com.fatihcetiner.landmarkrw.R
import com.fatihcetiner.landmarkrw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        // Data
        val pisa = Landmark("Pisa","Italy", R.drawable.pisa)
        val eiffel = Landmark("Eiffel","France", R.drawable.eiffel)
        val colosseum = Landmark("Colosseum","Italy", R.drawable.colesium)
        val londonBridge = Landmark("London Bridge","UK", R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(eiffel)
        landmarkList.add(colosseum)
        landmarkList.add(londonBridge)

        // Recycler View Adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter


    }
}