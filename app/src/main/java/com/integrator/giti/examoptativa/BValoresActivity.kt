package com.integrator.giti.examoptativa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.integrator.giti.examoptativa.adapter.ImageSliderAdapter
import com.smarteist.autoimageslider.SliderAnimations
import kotlinx.android.synthetic.main.activity_b_valores.*
import kotlinx.android.synthetic.main.activity_covid.*

class BValoresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_valores)

        val imageSliderAdapter = ImageSliderAdapter(this)

        bvalores.setSliderAdapter(imageSliderAdapter)
        bvalores.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION)
        bvalores.startAutoCycle()

        imageSliderAdapter.renewItems(fetchSliderItemList())
    }

    private fun fetchSliderItemList(): List<String>{
        val items = arrayListOf<String>()
        //pexels photos to be fetch from intenet
        items.add("https://www.altonivel.com.mx/wp-content/uploads/2018/04/guia-para-salir-en-la-bolsa.jpg")
        items.add("https://www.capital.es/wp-content/uploads/2019/01/Bolsa-de-valores1-1024x683.jpg")
        items.add("https://libertex.org/sites/default/files/inline-images/blog/1361213594.jpg")
        items.add("https://assets.entrepreneur.com/content/3x2/2000/20180430171754-bolsadevalorescomoinvertirquees.jpeg?width=700&crop=2:1")
        return items
    }
}