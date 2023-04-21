package com.example.recyclerviewexample3101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {

   private var layoutmanager:RecyclerView.LayoutManager? = null
    private var adapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutmanager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutmanager
        adapter =RecyclerAdapter()
        recyclerView.adapter = adapter



    }
}