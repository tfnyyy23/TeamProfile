package com.example.profilekelompok6_xirpl7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class EvriliaProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_evrilia_profile)

        val editTextAnggota2 : EditText = findViewById(R.id.editTextAnggota2)
        val buttonCekAnggota2 : Button = findViewById(R.id.btn_cek2)
        val namaAnggota2 = "Evrilia"
        val detailAnggota2 : TextView = findViewById(R.id.keterangan_anggota2)

        buttonCekAnggota2.setOnClickListener {
            if (editTextAnggota2.length()==0) {
                val toast = Toast.makeText(this, "Silahkan Masukkan Nama", Toast.LENGTH_LONG)
                toast.show()
            }
            else {
                val inputan = editTextAnggota2.getText().toString()
                if (inputan==namaAnggota2) {
                    val toast = Toast.makeText(this, "Evrilia Elsyabila kelas XI RPL 7 no.absen 10", Toast.LENGTH_LONG)
                    toast.show()
                    val keteranganAnggota = "10_Evrilia Elsyabila_XI RPL 7"
                    detailAnggota2.setText(keteranganAnggota)
                }
                else {
                    val toast = Toast.makeText(this, "Maaf Nama yang Anda Masukkan Salah", Toast.LENGTH_LONG)
                    toast.show()
                }
            }
        }
    }
}