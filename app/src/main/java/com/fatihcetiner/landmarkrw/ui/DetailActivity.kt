package com.fatihcetiner.landmarkrw.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fatihcetiner.landmarkrw.model.Landmark
import com.fatihcetiner.landmarkrw.databinding.ActivityDetailBinding
import com.fatihcetiner.landmarkrw.model.Singleton


class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        // Casting -> gönderilen verilin ne olduğunu as parametresi ile belirtiyoruz
        //val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark

        val selectedLandmark = Singleton.chosenLandmark

        selectedLandmark?.let {
            binding.landmarkNameText.text = it.name
            binding.landmarkCountryText.text = it.country
            binding.imageView.setImageResource(it.image)
        }




    }
}