package com.example.smack

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LogInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
    }
    fun logInLogInBtn(view: View){

    }

    fun logInCreateUserBtn(view:View){
        val creatUserIntent= Intent(this,CreateUserActivity::class.java)
        startActivity(creatUserIntent)

    }


}
