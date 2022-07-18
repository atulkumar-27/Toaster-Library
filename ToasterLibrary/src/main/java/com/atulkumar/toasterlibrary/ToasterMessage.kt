package com.atulkumar.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {
    fun showMyToast(context: Context?, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}