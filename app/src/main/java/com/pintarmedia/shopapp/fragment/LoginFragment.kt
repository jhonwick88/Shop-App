package com.pintarmedia.shopapp.fragment

import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.pintarmedia.shopapp.NavigationHost
import com.pintarmedia.shopapp.R
import kotlinx.android.synthetic.main.login_fragment.*
import kotlinx.android.synthetic.main.login_fragment.view.*

class LoginFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vie = inflater.inflate(R.layout.login_fragment, container,false)
        vie.next_button.setOnClickListener {
            if(!isValidPassword(password_edit_text.text)){
                password_text_input.error = getString(R.string.shr_error_password)
            }else{
                password_text_input.error = null
                (activity as NavigationHost).navigationTo(ListItemFragment(),false)
                Toast.makeText(it.context, "Ok next", Toast.LENGTH_SHORT).show()
            }
            vie.password_edit_text.setOnKeyListener { _, _, _ ->
                if (isValidPassword(password_edit_text.text)){
                    password_text_input.error = null
                }
                false
            }
        }
        return vie
    }

    private fun isValidPassword(text: Editable?): Boolean {
        return text!=null && text.length >= 8
    }
}