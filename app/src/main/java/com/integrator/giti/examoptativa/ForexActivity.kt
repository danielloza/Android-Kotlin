package com.integrator.giti.examoptativa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.integrator.giti.examoptativa.adapter.ImageSliderAdapter
import com.smarteist.autoimageslider.SliderAnimations
import kotlinx.android.synthetic.main.activity_b_valores.*
import kotlinx.android.synthetic.main.activity_b_valores.bvalores
import kotlinx.android.synthetic.main.activity_forex.*

class ForexActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forex)

        val imageSliderAdapter = ImageSliderAdapter(this)

        forex.setSliderAdapter(imageSliderAdapter)
        forex.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION)
        forex.startAutoCycle()

        imageSliderAdapter.renewItems(fetchSliderItemList())
    }

    private fun fetchSliderItemList(): List<String>{
        val items = arrayListOf<String>()
        //pexels photos to be fetch from intenet
        items.add("https://libertex.org/sites/default/files/styles/blog_detail_hero/public/2020-06/forex2.0_1.jpg?itok=pd-m1zP9")
        items.add("https://www.etradingmexico.com/wp-content/uploads/2019/05/Bucket-List-Traders-Forex-Trading-1024x768.jpeg")
        items.add("https://www.esan.edu.pe/apuntes-empresariales/2019/12/10/1500x844_mercado_cambiario.jpg")
        items.add("https://www.fxintradia.com/wp-content/uploads/2019/10/invertir-en-Forex.jpeg")
        return items
    }
}