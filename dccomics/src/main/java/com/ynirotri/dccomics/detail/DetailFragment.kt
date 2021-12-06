package com.ynirotri.dccomics.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ynirotri.dccomics.R
import com.ynirotri.dccomics.databinding.ActivityMainBinding
import com.ynirotri.dccomics.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var detailBinding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        detailBinding = FragmentDetailBinding.inflate(inflater, container,false)

        return detailBinding.root
    }

}

