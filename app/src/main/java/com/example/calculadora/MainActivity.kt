package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var num1: Float?=null
    var num2: Float?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bSuma.setOnClickListener(this)
        bResta.setOnClickListener(this)
        bMulti.setOnClickListener(this)
        bDiv.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        if(TextUtils.isEmpty(EditNum1.text.toString())){
            EditNum1.error="Ingresa un Numero"
            EditNum1.requestFocus()
            return
        }else{
            num1=EditNum1.text.toString().toFloat()

        }
        if(TextUtils.isEmpty(EditNum2.text.toString())){
            EditNum2.error="Ingresa un Numero"
            EditNum2.requestFocus()
            return
        }else{
            num2=EditNum2.text.toString().toFloat()

        }
        when(v?.id){
            R.id.bSuma ->{textResult.text=num1?.plus(num2!!).toString()
            }
            R.id.bResta ->{textResult.text=num1?.minus(num2!!).toString()
            }
            R.id.bMulti ->{textResult.text=num1?.times(num2!!).toString()
            }
            R.id.bDiv ->{textResult.text=num1?.div(num2!!).toString()
            }
        }
    }
}