package com.tops.kotlin.tablayoutapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tops.kotlin.tablayoutapp.adapters.FragmentAdapter
import com.tops.kotlin.tablayoutapp.databinding.ActivityMainBinding
import com.tops.kotlin.tablayoutapp.fragments.ChatFragment
import com.tops.kotlin.tablayoutapp.fragments.HomeFragment
import com.tops.kotlin.tablayoutapp.fragments.SettingsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.apply {
            addFragment(HomeFragment(), "Home")
            addFragment(ChatFragment(), "Chats")
            addFragment(SettingsFragment(), "Settings")
        }

        binding.viewPager.adapter = fragmentAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }
}