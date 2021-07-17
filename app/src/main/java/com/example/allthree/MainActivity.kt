package com.example.allthree

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btPictures.setOnClickListener{
            val intent = Intent(this,PicturesActivity::class.java)
            startActivity(intent)
        }
        btAnecdotes.setOnClickListener{
            val intent = Intent(this,AnecdotesActivity::class.java)
            startActivity(intent)
        }
        btSigns.setOnClickListener{
            val intent = Intent(this,SignActivity::class.java)
            startActivity(intent)
        }
        btQuotes.setOnClickListener{
            val intent = Intent(this,QuotesActivity::class.java)
            startActivity(intent)
        }
        btSeaPictures.setOnClickListener{
            val intent = Intent (this,Sea_Pictures_Activity::class.java)
            startActivity(intent)
        }
        btEmotions.setOnClickListener{
            val intent = Intent (this,EmotionsActivity::class.java)
            startActivity(intent)
        }
        btAuthor.setOnClickListener {
            val intent = Intent (this,AuthorActivity::class.java)
            startActivity(intent)
        }


    }
}