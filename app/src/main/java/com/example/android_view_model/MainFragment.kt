package com.example.android_view_model

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.android_view_model.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding:FragmentMainBinding? = null
    private val binding get() = _binding!!

    // use delegate from viewModels
    // add dependency from https://developer.android.com/kotlin/ktx#fragment
    private val viewModel by viewModels<MainFragmentViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       _binding = FragmentMainBinding.inflate(layoutInflater,container,false)
        val view = binding.root

        setTextCounter()
        binding.buttonCounter.setOnClickListener{
            viewModel.addNumber()
            setTextCounter()
        }

        return view
    }

    private fun setTextCounter(){
        binding.counterText.text = viewModel.numberCounter.toString()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}