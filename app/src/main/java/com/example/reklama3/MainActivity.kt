package com.example.reklama3

import Adapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.reklama3.User.User
import com.example.reklama3.databinding.ActivityMainBinding
import com.example.reklama3.databinding.ItemRvBinding

class MainActivity : AppCompatActivity() {
   private val binding by lazy{ActivityMainBinding.inflate(layoutInflater)}
    private lateinit var list: ArrayList<User>
    private lateinit var itemRvBinding: ItemRvBinding
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        loadData()
        adapter = Adapter(list)
        binding.rv.adapter = adapter

    }
    private fun loadData() {
        list = ArrayList()
        for (i in 0 until 100){
            list.add(User(R.drawable.xaker,R.drawable.xaker2))
        }
    }

}