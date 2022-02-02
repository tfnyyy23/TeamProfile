package com.example.profilekelompok6_xirpl7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentButtonAnggota1: Button = findViewById(R.id.btn_anggota1)
        intentButtonAnggota1.setOnClickListener {viewDhindaProfile()}

        val intentButtonAnggota2: Button = findViewById(R.id.btn_anggota2)
        intentButtonAnggota2.setOnClickListener {viewEvriliaProfile()}

        val intentButtonAnggota3: Button = findViewById(R.id.btn_anggota3)
        intentButtonAnggota3.setOnClickListener {viewShintaProfile()}

        val intentButtonAnggota4: Button = findViewById(R.id.btn_anggota4)
        intentButtonAnggota4.setOnClickListener {viewTifanyProfile()}
    }

    private fun viewTifanyProfile() {
        val intent = Intent(this, TifanyProfileActivity::class.java)
        startActivity(intent)
    }

    private fun viewShintaProfile() {
        val intent = Intent(this, ShintaProfileActivity::class.java)
        startActivity(intent)
    }

    private fun viewEvriliaProfile() {
        val intent = Intent(this, EvriliaProfileActivity::class.java)
        startActivity(intent)
    }

    private fun viewDhindaProfile() {
        val intent = Intent(this, DhindaProfileActivity::class.java)
        startActivity(intent)
    }
}