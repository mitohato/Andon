package com.ict.mito.andon.ui.union

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ict.mito.andon.R

class UnionFragment : Fragment() {
    
    companion object {
        fun newInstance() = UnionFragment()
    }
    
    private lateinit var viewModel: UnionViewModel
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.union_fragment, container, false)
    }
    
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(UnionViewModel::class.java)
        // TODO: Use the ViewModel
    }
    
}
