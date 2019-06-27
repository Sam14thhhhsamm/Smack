package com.example.smack.Controller

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smack.R
import com.example.smack.Services.AuthService
import kotlinx.android.synthetic.main.activity_create_user.*

class CreateUserActivity : AppCompatActivity() {
    var userAvater="profileDefault"
    var avatarColor="[0.5,0.5,0.5,1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }
    fun generateAvatarImageView(view:View){
        val random=java.util.Random()
        val color=random.nextInt(2)
        val avatar=random.nextInt(28)
        userAvater = if(color==0){
            "light$avatar"
        }else{
            "dark$avatar"
        }
        val resourceid=resources.getIdentifier(userAvater,"drawable",packageName)
        createAvatarImageView.setImageResource(resourceid)

    }

    fun generateBackGroundClicked(view: View){
        val random=java.util.Random()
        val r=random.nextInt(255)
        val g=random.nextInt(225)
        val b=random.nextInt(255)
        createAvatarImageView.setBackgroundColor(Color.rgb(r,g,b))

        val savedR=r.toDouble()/255
        val savedG=g.toDouble()/255
        val savedB=b.toDouble()/255
        avatarColor="[$savedR,$savedG,$savedB]"



    }
    fun createUserClicked(view: View){
        AuthService.registerUser(this,"sam@sam.com","123456"){}

    }
}
