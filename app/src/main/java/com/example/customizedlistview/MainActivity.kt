package com.example.customizedlistview

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var userArrayList : ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Akshayraj", "Rahul", "Jay", "Giri", "Raj", "Aakash")

        val lastMsg = arrayOf("Hyy", "Amazing", "Great", "See you later", "Keep working for your dream","Stay Curious")

        val lastMsgTime = arrayOf("16:40","15:36","7:45","8:30", "9:47","5:15")

        val phNo = arrayOf(46465464,4464644646,454454644,454454898,78979779987,6845464654)

        val imageId = intArrayOf(R.drawable.pic0,R.drawable.pic1,R.drawable.pic0,R.drawable.pic2,R.drawable.pic3,R.drawable.pic0)

        userArrayList = ArrayList()

        for(i in name.indices){
            val user = User(name[i], lastMsg[i], lastMsgTime[i], phNo[i], imageId[i])
            userArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.listView)
        listView.isClickable  = true
        listView.adapter = MyAdapter(this,userArrayList)

        listView.setOnItemClickListener { adapterView, view, i, l ->

            val username = name[i]
            val userPhone = phNo[i]
            val myImageId = imageId[i]


            val intent = Intent(this,UserActivity::class.java)
            intent.putExtra("name",username)
            intent.putExtra("phoneNum", userPhone)
            intent.putExtra("imageId", myImageId)
            startActivity(intent)
        }

    }
}