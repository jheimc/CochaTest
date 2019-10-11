package io.github.n0g4y0.cochatest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var botonVerdad: Button
    private lateinit var botonFalso:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonVerdad=findViewById(R.id.verdad_button)
        botonFalso=findViewById(R.id.falso_button)

        botonVerdad.setOnClickListener {
            val muestraMensaje = Toast.makeText(this, R.string.correcto_toast, Toast.LENGTH_SHORT)
            muestraMensaje.setGravity( Gravity.CENTER_VERTICAL or Gravity.TOP,  0, 0)
            muestraMensaje.show()
        }

        botonFalso.setOnClickListener {

            val muestraMensaje = Toast.makeText(this, R.string.incorrecto_toast, Toast.LENGTH_SHORT)
            muestraMensaje.setGravity( Gravity.TOP, 0, 0)
            muestraMensaje.show()
        }
    }
}
