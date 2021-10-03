package com.pintarmedia.shopapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.pintarmedia.shopapp.fragment.LoginFragment

class MainActivity : AppCompatActivity(), NavigationHost {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction().add(R.id.container, LoginFragment()).commit()
        }
    }

    override fun navigationTo(fragment: Fragment, addToBackStack: Boolean) {
        TODO("Not yet implemented")
        val trans = supportFragmentManager.beginTransaction().replace(R.id.container, fragment)
        if (addToBackStack){
            trans.addToBackStack(null)
        }
        trans.commit()
    }
}