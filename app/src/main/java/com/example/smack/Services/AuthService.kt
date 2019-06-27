package com.example.smack.Services

import android.content.Context
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.smack.Utilities.URL_REGISTER
import org.json.JSONObject

object AuthService {
    fun registerUser(context:Context,email:String,password:String, complete:(Boolean)->Unit) {
        val jsonBody = JSONObject()
        jsonBody.put("email", email)
        jsonBody.put("password", password)
        val requestBody = jsonBody.toString()
        val registerRequest = object : StringRequest(Method.POST, URL_REGISTER, Response.Listener {

        },
            Response.ErrorListener {

            })

        {
            override fun getBodyContentType(): String {
                return "applicationjson; charset=utf-8"

            }

            override fun getBody(): ByteArray {
                return requestBody.toByteArray()
            }
        }
        Volley.newRequestQueue(context).add(registerRequest)

    }

}