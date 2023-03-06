package com.example.customizedlistview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val context: Activity, private val arrayList : ArrayList<User>) :
    ArrayAdapter<User>(context, R.layout.eachitem, arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view = LayoutInflater.from(context).inflate(R.layout.eachitem,null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.tvName)
        val lasMsg = view.findViewById<TextView>(R.id.tvMsg)
        val msgTime = view.findViewById<TextView>(R.id.tvTime)

        name.text = arrayList[position].name
        lasMsg.text = arrayList[position].lastMsg
        msgTime.text = arrayList[position].lastMsgTime
        image.setImageResource(arrayList[position].imageId)

        return view
    }

}
