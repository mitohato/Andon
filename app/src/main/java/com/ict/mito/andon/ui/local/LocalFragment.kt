package com.ict.mito.andon.ui.local

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.ict.mito.andon.R
import com.ict.mito.andon.databinding.LocalFragmentBinding

class LocalFragment : Fragment() {

    companion object {
        fun newInstance() = LocalFragment()
    }

    private lateinit var viewModel: LocalViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: LocalFragmentBinding = DataBindingUtil.inflate(
                inflater,
                R.layout.local_fragment,
                container,
                false
        )

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LocalViewModel::class.java)
        // TODO: Use the ViewModel
    }
}
