package com.example.profilekelompok6_xirpl7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class TifanyProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tifany_profile)

        val editTextAnggota4 : EditText = findViewById(R.id.editTextAnggota4)
        val buttonCekAnggota4 : Button = findViewById(R.id.btn_cek4)
        val namaAnggota4 = "Tifany"
        val detailAnggota4 : TextView = findViewById(R.id.keterangan_anggota4)

        buttonCekAnggota4.setOnClickListener {
            if (editTextAnggota4.length()==0) {
                val toast = Toast.makeText(this, "Silahkan Masukkan Nama", Toast.LENGTH_LONG)
                toast.show()
            }
            else {
                val inputan = editTextAnggota4.getText().toString()
                if (inputan==namaAnggota4) {
                    val toast = Toast.makeText(this, "Tifany Fadilah Ahnaf kelas XI RPL 7 no.absen 33", Toast.LENGTH_LONG)
                    toast.show()
                    val keteranganAnggota = "33_Tifany Fadilah A_XI RPL 7"
                    detailAnggota4.setText(keteranganAnggota)
                }
                else {
                    val toast = Toast.makeText(this, "Maaf Nama yang Anda Masukkan Salah", Toast.LENGTH_LONG)
                    toast.show()
                }
            }
        }
    }
}