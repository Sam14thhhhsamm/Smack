package com.example.smack.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smack.R

class LogInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
    }
    fun logInLogInBtn(view: View){

    }

    fun logInCreateUserBtn(view:View){
        val creatUserIntent= Intent(this, CreateUserActivity::class.java)
        startActivity(creatUserIntent)

    }


}
