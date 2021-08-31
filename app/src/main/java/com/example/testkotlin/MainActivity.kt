package com.example.testkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.testkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //TODO смотри ветки

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnStart.setOnClickListener {
            openFragment()
            binding.btnStart.visibility = View.GONE
        }
    }

    private fun openFragment() {
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(R.anim.anim_show, R.anim.anim_hide)
            .add(R.id.container, FragmentFirst.newInstance())
            .commit()
    }

    fun changeFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(R.anim.anim_show, R.anim.anim_hide)
            .replace(R.id.container, fragment)
            .commit()
    }
}