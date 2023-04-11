package com.example.staggeredgridlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var itemList:ArrayList<Int>
    private lateinit var itemAdapter: ItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }
    private fun init(){
        itemList= ArrayList()
        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        addToList()
        itemAdapter=ItemAdapter(itemList)
        recyclerView.adapter=itemAdapter
    }
    private fun addToList(){
        itemList.add(R.drawable.pancakes)
        itemList.add(R.drawable.burger)
        itemList.add(R.drawable.chips)
        itemList.add(R.drawable.donut)
        itemList.add(R.drawable.friedchicken)
        itemList.add(R.drawable.hotdog)
        itemList.add(R.drawable.pizza)
        itemList.add(R.drawable.popcorn)
        itemList.add(R.drawable.sandwich)
        itemList.add(R.drawable.taco)
        itemList.add(R.drawable.waffles)
    }
}