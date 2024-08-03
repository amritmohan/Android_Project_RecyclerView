package com.example.recyclerview_

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var mydata:ArrayList<MyModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        mydata = ArrayList<MyModel>()

        mydata.add(MyModel("Pikachu","Thunder Shock, a basic Electric-type move useful in early battles. Thunderbolt is a stronger Electric-type move with a chance to paralyze the opponent.",R.drawable.pikachu))
        mydata.add(MyModel("Arbok","Poison Fang, a chance to badly poison the opponent, inflicting increasing damage over time.",R.drawable.arbok))
        mydata.add(MyModel("Jigglypuff","Sing, which puts the opponent to sleep, giving Jigglypuff and its team a chance to attack without retaliation.",R.drawable.jigglypuff))
        mydata.add(MyModel("Charizard"," Flamethrower is a staple Fire-type move known for its high power and accuracy.",R.drawable.charizard))
        mydata.add(MyModel("Chansey","Thunder Wave inflicts paralysis, reducing the opponent's speed and sometimes preventing them from attacking",R.drawable.chansey))
        mydata.add(MyModel("Scizor","When it identifies an enemy, Scizor will use its pincers to beat up the opponent to the point there is nothing but scrap left afterwards.",R.drawable.scizor))

        recyclerView.adapter = MyAdapter(applicationContext,mydata)
        recyclerView.layoutManager = LinearLayoutManager(this)



    }
}