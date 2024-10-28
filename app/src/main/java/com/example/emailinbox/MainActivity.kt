package com.example.emailinbox

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: EmailAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val emails = createSampleEmails()
        adapter = EmailAdapter(emails)
        recyclerView.adapter = adapter
    }

    private fun createSampleEmails(): List<EmailItem> {
        val colors = listOf(
            Color.parseColor("#FF0000"),
            Color.parseColor("#33FFFF"),
            Color.parseColor("#6666FF"),
            Color.parseColor("#FF6666"),
            Color.parseColor("#33FF33"),
            Color.parseColor("#9999FF"),
            Color.parseColor("#FF9933"),
            Color.parseColor("#CCCC00")
        )

        return listOf(
            EmailItem(
                "Edurila.com",
                "$19 Only (First 10 spots) - Bestselling in online course",
                "Are you looking to Learn Web Designing on our site?",
                "12:34 PM",
                colors.random()
            ),
            EmailItem(
                "Chris Abad",
                "Help make Campaign Monitor better",
                "Let us know your thoughts! No Images needed!",
                "11:22 AM",
                colors.random()
            ),
            EmailItem(
                "Tuto.com",
                "8h de formation gratuite et les nouveau",
                "Photoshop, SEO, Blender, CSS, WordPress, HTML...",
                "11:04 AM",
                colors.random()
            ),
            EmailItem(
                "support",
                "Société Ovh : suivi de vos services - hp lorem ipsum...",
                "SAS OVH - http://www.ovh.com 2 rue lorem ipsum",
                "10:26 AM",
                colors.random()
            ),
            EmailItem(
                "Matt from Ionic",
                "The New Ionic Creator Is Here!",
                "Announcing the all-new Creator, build out of this world content",
                "10:14 AM",
                colors.random()
            ),
            EmailItem(
                "Edurila.com",
                "$19 Only (First 10 spots) - Bestselling in online course",
                "Are you looking to Learn Web Designing on our site?",
                "12:34 PM",
                colors.random()
            ),
            EmailItem(
                "Chris Abad",
                "Help make Campaign Monitor better",
                "Let us know your thoughts! No Images needed!",
                "11:22 AM",
                colors.random()
            ),
            EmailItem(
                "Tuto.com",
                "8h de formation gratuite et les nouveau",
                "Photoshop, SEO, Blender, CSS, WordPress, HTML...",
                "11:04 AM",
                colors.random()
            ),
            EmailItem(
                "support",
                "Société Ovh : suivi de vos services - hp lorem ipsum...",
                "SAS OVH - http://www.ovh.com 2 rue lorem ipsum",
                "10:26 AM",
                colors.random()
            ),
            EmailItem(
                "Matt from Ionic",
                "The New Ionic Creator Is Here!",
                "Announcing the all-new Creator, build out of this world content",
                "10:14 AM",
                colors.random()
            )
        )
    }
}