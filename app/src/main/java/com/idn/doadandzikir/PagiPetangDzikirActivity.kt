package com.idn.doadandzikir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class PagiPetangDzikirActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_pagi_petang_dzikir)

        val cvDzikirPagi : CardView = findViewById(R.id.cv_dzikir_pagi)
        cvDzikirPagi.setOnClickListener(this)
        val btnDzikirPagi : ImageButton = findViewById(R.id.img_btn_dzikir_pagi)
        btnDzikirPagi.setOnClickListener(this)

        val cvDzikirPetang : CardView = findViewById(R.id.cv_dzikir_petang)
        cvDzikirPetang.setOnClickListener(this)
        val btnDzikirPetang : ImageButton = findViewById(R.id.img_btn_dzikir_petang)
        btnDzikirPetang.setOnClickListener(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(p0: View?) { // Fungsi dari View yang gunanya untuk mendeteksi klik dengan return ID
        // Ketika mengklik komponen yang ber-ID
        when(p0?.id) {
            // Dzikir Pagi
            R.id.cv_dzikir_pagi -> startActivity(Intent(this,DzikirPagiActivity::class.java))
            R.id.img_btn_dzikir_pagi -> startActivity(Intent(this,DzikirPagiActivity::class.java))

            // Dzikir Petang
            R.id.cv_dzikir_petang -> startActivity(Intent(this,DzikirPetangActivity::class.java))
            R.id.img_btn_dzikir_petang -> startActivity(Intent(this,DzikirPetangActivity::class.java))
        }
    }
}