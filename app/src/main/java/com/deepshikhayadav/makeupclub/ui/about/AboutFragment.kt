package com.deepshikhayadav.makeupclub.ui.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.deepshikhayadav.makeupclub.R

class AboutFragment : Fragment() {

   // private lateinit var notificationsViewModel: AboutViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       /* notificationsViewModel =
            ViewModelProvider(this).get(AboutViewModel::class.java)*/
        val root = inflater.inflate(R.layout.fragment_about, container, false)
        //val textView: TextView = root.findViewById(R.id.text_notifications)
       /* notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
          //  textView.text = it
        })*/
        return root
    }
}