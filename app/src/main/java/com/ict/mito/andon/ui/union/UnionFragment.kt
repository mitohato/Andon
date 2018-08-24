package com.ict.mito.andon.ui.union

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.ict.mito.andon.R
import com.ict.mito.andon.databinding.UnionFragmentBinding

class UnionFragment : Fragment() {

    companion object {
        fun newInstance() = UnionFragment()
    }

    private lateinit var viewModel: UnionViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: UnionFragmentBinding = DataBindingUtil.inflate(
                inflater,
                R.layout.union_fragment,
                container,
                false
        )

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(UnionViewModel::class.java)
        // TODO: Use the ViewModel
    }
}
