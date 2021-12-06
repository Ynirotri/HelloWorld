package com.ynirotri.helloworld.detalle


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import com.ynirotri.helloworld.databinding.ActivityDetalleBinding
import com.ynirotri.helloworld.model.SuperheroeItem

class DetalleActivity : AppCompatActivity() {

   private lateinit var detalleBinding: ActivityDetalleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        detalleBinding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(detalleBinding.root)

        val superheroe: SuperheroeItem = intent.extras?.getSerializable("superheroe") as SuperheroeItem

        with(detalleBinding){
            nameTextView.text = superheroe.name
            aliasTextView.text  = superheroe.alias
            cityTextView.text = superheroe.city
            ocupationTextView.text = superheroe.occupation
            heightTextView.text = superheroe.height.toString()
            facebookTextView.text = superheroe.facebook
            powersTextView.text = superheroe.powers
            Picasso.get().load(superheroe.urlPicture).into(pictureImageView)

        }

    }

}

