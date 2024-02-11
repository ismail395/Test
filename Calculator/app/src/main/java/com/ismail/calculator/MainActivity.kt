package com.ismail.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Butonları Tanımlama
    private lateinit var buttonNegatif : Button
    private lateinit var buttonVirgul :Button
    private lateinit var buttonEsittir : Button
    private lateinit var buttonArti: Button
    private lateinit var buttonEksi: Button
    private lateinit var buttonCarpma: Button
    private lateinit var buttonBolme: Button
    private lateinit var buttonYuzde: Button
    private lateinit var buttonParantez: Button
    private lateinit var buttonC: Button
    private lateinit var button0 : Button
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6:Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button

    // EditText tanımlama
    private lateinit var editText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tanımladığımız değerleri layout değerlerindeki id'lerle eşleştiriyoruz
        buttonNegatif = findViewById(R.id.buttonNegatif)
        buttonVirgul = findViewById(R.id.buttonVirgul)
        buttonEsittir = findViewById(R.id.buttonEsittir)
        buttonArti = findViewById(R.id.buttonArti)
        buttonEksi = findViewById(R.id.buttonEksi)
        buttonCarpma = findViewById(R.id.buttonCarpma)
        buttonBolme = findViewById(R.id.buttonBolme)
        buttonYuzde = findViewById(R.id.buttonYuzde)
        buttonParantez = findViewById(R.id.buttonParantez)
        buttonC = findViewById(R.id.buttonC)
        button0 = findViewById(R.id.button0)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3  = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)

        editText = findViewById(R.id.editText)


    }


    fun sayiTiklama (view: View){
        val buttonsec = view as Button
        val buttonTiklamaDeger = editText.text.toString()

        when(buttonsec.id){
            button0.id->{
                buttonTiklamaDeger+"0"
            }
            button1.id->{
                buttonTiklamaDeger+"1"
            }
            button2.id->{
                buttonTiklamaDeger+"2"
            }
            button3.id->{
                buttonTiklamaDeger+"3"
            }
            button4.id->{
                buttonTiklamaDeger+"4"
            }
            button5.id->{
                buttonTiklamaDeger+"5"
            }
            button6.id->{
                buttonTiklamaDeger+"6"
            }
            button7.id->{
                buttonTiklamaDeger+"7"
            }
            button8.id->{
                buttonTiklamaDeger+"8"
            }
            button9.id->{
                buttonTiklamaDeger+"9"
            }
            buttonNegatif.id->{
                "-"+buttonTiklamaDeger
            }
        }
        editText.setText(buttonTiklamaDeger)
    }
}