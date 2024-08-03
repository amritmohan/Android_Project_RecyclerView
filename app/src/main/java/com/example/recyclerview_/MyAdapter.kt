package com.example.recyclerview_
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(var context:Context,var data:ArrayList<MyModel>):RecyclerView.Adapter<MyAdapter.MyInner>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyInner {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.demo_card,parent,false)
        return MyInner(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyInner, position: Int) {
        holder.title.text=data.get(position).title
        holder.descrip.text=data.get(position).descrip
        holder.image.setImageResource(data.get(position).image)
    }

    class MyInner(view: View):RecyclerView.ViewHolder(view) {
        val image:ImageView=view.findViewById(R.id.myimage)
        val descrip:TextView=view.findViewById(R.id.txt_descrip)
        val title:TextView=view.findViewById(R.id.txt_title)
    }
}
