package com.example.bottomnav

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.bottomnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())
//        val toolbar: Toolbar = findViewById(R.id.toolbar)
//        toolbar.title = "New Title"
//        toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.white))

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> replaceFragment(HomeFragment())
                R.id.profile -> replaceFragment(ProfileFragment())

                R.id.setting -> replaceFragment(SettingFragment())

                else -> {}
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        //supportFragmentManager is a built-in property in AppCompatActivity, which provides access to the FragmentManager.
        //   responsible for adding, removing, replacing, and managing fragments in an activity.
        val fragementManger = supportFragmentManager
        val fragmentTransaction = fragementManger.beginTransaction()
        //This line starts a FragmentTransaction, which is necessary to perform operations on fragments.
        //beginTransaction() creates a new transaction, allowing you to make changes like adding, removing, or replacing fragments before committing them.
        
        fragmentTransaction.replace(
            R.id.frame_layout,
            fragment
        )  // to replace an existing fragment in a container with an instance of a new fragment class that you provide.Calling replace() is equivalent to calling remove() with a fragment in a container and adding a new fragment to that same container.

        fragmentTransaction.commit()   //call signals to the FragmentManager that all operations have been added to the transaction.


    }
}