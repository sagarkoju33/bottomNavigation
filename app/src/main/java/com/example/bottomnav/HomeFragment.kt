package com.example.bottomnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onResume() {
        super.onResume()
        (activity as? AppCompatActivity)?.supportActionBar?.title = "Home"
    }

//    private fun replaceFragment(fragment: Fragment) {
//        //supportFragmentManager is a built-in property in AppCompatActivity, which provides access to the FragmentManager.
//        //   responsible for adding, removing, replacing, and managing fragments in an activity.
//        //FragmentManager is the class responsible for performing actions on your app's fragments, such as adding, removing, or replacing them and adding them to the back stack.
//        val fragementManger = childFragmentManager
//
//        val fragmentTransaction = fragementManger.beginTransaction()
//        //This line starts a FragmentTransaction, which is necessary to perform operations on fragments.
//        //beginTransaction() creates a new transaction, allowing you to make changes like adding, removing, or replacing fragments before committing them.
//
//        fragmentTransaction.replace(
//            R.id.frame_layout,
//            fragment
//        )  // to replace an existing fragment in a container with an instance of a new fragment class that you provide.Calling replace() is equivalent to calling remove() with a fragment in a container and adding a new fragment to that same container.
//
//        fragmentTransaction.commit()   //call signals to the FragmentManager that all operations have been added to the transaction.
//
//
//    }

}