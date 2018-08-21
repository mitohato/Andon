package com.ict.mito.andon.ui.local

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.ict.mito.andon.R

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
        return inflater.inflate(
                R.layout.local_fragment,
                container,
                false
        )
    }
    
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LocalViewModel::class.java)
        // TODO: Use the ViewModel
    }
    
}
