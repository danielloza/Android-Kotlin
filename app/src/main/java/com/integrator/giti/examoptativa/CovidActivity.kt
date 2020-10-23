package com.integrator.giti.examoptativa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.integrator.giti.examoptativa.adapter.ImageSliderAdapter
import com.smarteist.autoimageslider.SliderAnimations
import kotlinx.android.synthetic.main.activity_covid.*

class CovidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_covid)

        val imageSliderAdapter = ImageSliderAdapter(this)

        covid.setSliderAdapter(imageSliderAdapter)
        covid.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION)
        covid.startAutoCycle()

        imageSliderAdapter.renewItems(fetchSliderItemList())
    }

    private fun fetchSliderItemList(): List<String>{
        val items = arrayListOf<String>()
        //pexels photos to be fetch from intenet
        items.add("https://img.freepik.com/vector-gratis/covid-19-coronavirus-noticias-actualizaciones-concepto-banner_1017-24394.jpg?size=626&ext=jpg")
        items.add("https://chiapashoy.com.mx/wp-content/uploads/2020/07/ARTiFACTS-Covid-19.png")
        items.add("https://www.dosmanzanas.com/wp-content/uploads/coronavirus-covid-19.jpg")
        items.add("https://static.vecteezy.com/system/resources/thumbnails/000/834/986/original/multicolored-covid-19-infection-poster.jpg")
        return items
    }
}