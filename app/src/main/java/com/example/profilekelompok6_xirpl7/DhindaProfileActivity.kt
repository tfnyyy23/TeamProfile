package com.example.profilekelompok6_xirpl7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class DhindaProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dhinda_profile)

        val editTextAnggota1 : EditText = findViewById(R.id.editTextAnggota1)
        val buttonCekAnggota1 : Button = findViewById(R.id.btn_cek1)
        val namaAnggota1 = "Dhinda"
        val detailAnggota1 : TextView = findViewById(R.id.keterangan_anggota1)

        buttonCekAnggota1.setOnClickListener {
            if (editTextAnggota1.length()==0) {
                val toast = Toast.makeText(this, "Silahkan Masukkan Nama", Toast.LENGTH_LONG)
                toast.show()
            }
            else {
                val inputan = editTextAnggota1.getText().toString()
                if (inputan==namaAnggota1) {
                    val toast = Toast.makeText(this, "Dhinda Anniza Cahyaningwidhi kelas XI RPL 7 no.absen 08", Toast.LENGTH_LONG)
                    toast.show()
                    val keteranganAnggota = "08_Dhinda Anniza C_XI RPL 7"
                    detailAnggota1.setText(keteranganAnggota)
                }
                else {
                    val toast = Toast.makeText(this, "Maaf Nama yang Anda Masukkan Salah", Toast.LENGTH_LONG)
                    toast.show()
                }
            }
        }
    }
}

