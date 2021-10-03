package com.pintarmedia.shopapp

import androidx.fragment.app.Fragment

interface NavigationHost {
    fun navigationTo(fragment: Fragment, addToBackStack: Boolean)
}
