package com.ict.mito.andon.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ict.mito.andon.R
import com.ict.mito.andon.ui.home.HomeFragment
import com.ict.mito.andon.ui.notification.NotificationFragment
import com.ict.mito.andon.ui.union.UnionFragment
import kotlinx.android.synthetic.main.activity_main.navigation

class MainActivity : AppCompatActivity() {
    private lateinit var fragment: Fragment

    private val mOnNavigationItemSelectedListener =
            BottomNavigationView.OnNavigationItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.navigation_home -> {
                        fragment = HomeFragment.newInstance()
                    }
                    R.id.navigation_notification -> {
                        fragment = NotificationFragment.newInstance()
                    }
                    R.id.navigation_union -> {
                        fragment = UnionFragment.newInstance()
                    }
                }
                val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
                transaction.replace(
                        R.id.container,
                        fragment
                ).commit()
                true
            }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
