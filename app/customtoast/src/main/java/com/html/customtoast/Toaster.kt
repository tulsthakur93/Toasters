package com.html.customtoast

import android.content.Context
import android.widget.Toast

object ToasterClass {
    fun showHello(context: Context) {
        Toast.makeText(context, "Hello!", Toast.LENGTH_SHORT).show()
    }

}
