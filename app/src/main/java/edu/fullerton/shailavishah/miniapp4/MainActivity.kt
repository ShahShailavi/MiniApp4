package edu.fullerton.shailavishah.miniapp4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.transaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {

            supportFragmentManager.transaction(allowStateLoss = true) {
                replace(R.id.fragment_container, addFragment())

                // supportFragmentManager.beginTransaction().add(R.id.fragment_container,addFragment()).commit()

            }
        }
    }
}
