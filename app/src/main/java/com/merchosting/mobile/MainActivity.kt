package com.merchosting.mobile

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {

    private val background = Color.rgb(9, 9, 13)
    private val purple = Color.rgb(168, 85, 247)
    private val white = Color.WHITE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(24, 35, 24, 24)
            setBackgroundColor(background)
        }

        fun text(value: String, size: Float, color: Int): TextView {
            return TextView(this).apply {
                text = value
                textSize = size
                setTextColor(color)
            }
        }

        root.addView(text("P HOSTING", 14f, purple))
        root.addView(text("MercHosting Mobile", 28f, white))

        root.addView(text(
            "Administra tus servidores Minecraft desde Android.",
            14f, Color.LTGRAY
        ))

        val space = TextView(this).apply { text = "\n" }
        root.addView(space)

        root.addView(text("Panel de control", 21f, white))
        root.addView(text(
            "\nNo tienes servidores todavía.\n\n" +
            "Crea tu primer servidor Minecraft para comenzar.",
            16f, Color.LTGRAY
        ))

        val create = Button(this).apply {
            text = "＋  Crear servidor"
            setTextColor(white)
            setBackgroundColor(purple)
            setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "El creador de servidores estará disponible próximamente.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        root.addView(create)

        root.addView(text("\nDescargas", 20f, white))
        root.addView(text(
            "Paper · Vanilla · Fabric · Forge\n" +
            "Modrinth · CurseForge",
            14f, Color.LTGRAY
        ))

        root.addView(text("\nEstado del proyecto", 20f, white))
        root.addView(text(
            "Interfaz inicial preparada.\n" +
            "Motor de servidores: en desarrollo.",
            14f, purple
        ))

        setContentView(root)
    }
}
