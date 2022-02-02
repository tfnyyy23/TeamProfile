package com.example.profilekelompok6_xirpl7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ShintaProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shinta_profile)

        val editTextAnggota3 : EditText = findViewById(R.id.editTextAnggota3)
        val buttonCekAnggota3 : Button = findViewById(R.id.btn_cek3)
        val namaAnggota3 = "Shinta"
        val detailAnggota3 : TextView = findViewById(R.id.keterangan_anggota3)

        buttonCekAnggota3.setOnClickListener {
            if (editTextAnggota3.length()==0) {
                val toast = Toast.makeText(this, "Silahkan Masukkan Nama", Toast.LENGTH_LONG)
                toast.show()
            }
            else {
                val inputan = editTextAnggota3.getText().toString()
                if (inputan==namaAnggota3) {
                    val toast = Toast.makeText(this, "Shinta Nuriyah kelas XI RPL 7 no.absen 31", Toast.LENGTH_LONG)
                    toast.show()
                    val keteranganAnggota = "31_Shinta Nuriyah_XI RPL 7"
                    detailAnggota3.setText(keteranganAnggota)
                }
                else {
                    val toast = Toast.makeText(this, "Maaf Nama yang Anda Masukkan Salah", Toast.LENGTH_LONG)
                    toast.show()
                }
            }
        }
    }
}