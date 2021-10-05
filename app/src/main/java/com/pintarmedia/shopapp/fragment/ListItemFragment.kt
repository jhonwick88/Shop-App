package com.pintarmedia.shopapp.fragment

import android.os.Bundle
import android.view.*
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.pintarmedia.shopapp.R
import com.pintarmedia.shopapp.utils.NavigationIconClickListener
import kotlinx.android.synthetic.main.items_list_fragment.view.*

class ListItemFragment : Fragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.items_list_fragment,container,false)
        (activity as AppCompatActivity).setSupportActionBar(view.app_bar)
        view.app_bar.setNavigationOnClickListener(NavigationIconClickListener(
                requireActivity(),
                view.nested_item,
                AccelerateDecelerateInterpolator(),
                ContextCompat.getDrawable(context!!,R.drawable.menu_open),
                ContextCompat.getDrawable(context!!,R.drawable.menu_close)
        ))
        return  view

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.main_menu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}


