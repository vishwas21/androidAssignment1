package com.example.helloworldapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    // Layout Variables
    private lateinit var homeConstraintLayout: ConstraintLayout

    // Component Variables
    private lateinit var nameStmtTextView: TextView

    // String Variables
    private lateinit var myName: String
    private lateinit var nameStmtTextViewString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        homeConstraintLayout = findViewById(R.id.homeConstraintLayoutId)
        homeConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.cyan))

        myName = "Vishwas"

        nameStmtTextView = findViewById(R.id.nameStmtTextView)

        nameStmtTextViewString = nameStmtTextView.text.toString()
        nameStmtTextViewString =  nameStmtTextViewString.replace("XXX", myName)

        nameStmtTextView.text = nameStmtTextViewString
        nameStmtTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
    }
}