package com.deepshikhayadav.makeupclub.ui.dashboard

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView
import com.deepshikhayadav.makeupclub.R
import com.deepshikhayadav.makeupclub.adapter.Hor_tabAdapter
import com.deepshikhayadav.makeupclub.adapter.ProductAdapter
import com.deepshikhayadav.makeupclub.model.Suppliers

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)


        val recyclerView: RecyclerView = root.findViewById(R.id.hor_tab)
        val brand= Suppliers.brands
        recyclerView.setHasFixedSize(true)
        recyclerView.itemAnimator=DefaultItemAnimator()
        recyclerView.adapter= Hor_tabAdapter(dashboardViewModel, brand)


        val dialog= Dialog(requireContext())
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.loading)
        dialog.show()


        dashboardViewModel.properties.observe(viewLifecycleOwner) {
            dialog.dismiss()
            val recyclerView2: RecyclerView = root.findViewById(R.id.productRecycle)
            recyclerView2.setHasFixedSize(true)
            recyclerView2.itemAnimator = DefaultItemAnimator()
            recyclerView2.adapter = ProductAdapter(it)

        }
        return root
    }

    fun showMyDialog(context:Context) {
        val dialog= Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.contact_details)
        val clickbtn= dialog.findViewById(R.id.click) as Button
        clickbtn.setOnClickListener {
            dialog.dismiss()
            successfulDialog(context)
        }
        dialog.show()
    }

    private fun successfulDialog(context: Context) {
        val dialog2= Dialog(context)
        dialog2.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog2.setCancelable(false)
        dialog2.setContentView(R.layout.success_dialog)
        val clickbtn= dialog2.findViewById(R.id.cancel) as ImageButton
        clickbtn.setOnClickListener {
            dialog2.dismiss()
        }
        dialog2.show()
    }


}