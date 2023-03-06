package com.example.customizedlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val name = intent.getStringExtra("name")
        val myPhone = intent.getLongExtra("phoneNum",10)
        val image = intent.getIntExtra("imageId",R.drawable.pic0)

        val showName = findViewById<TextView>(R.id.tvShowName)
        val showPhone = findViewById<TextView>(R.id.tvShowPhone)
        val showImage = findViewById<CircleImageView>(R.id.profile_image1)

        showName.text = name
        showPhone.text = myPhone.toString()
        showImage.setImageResource(image)

    }
}