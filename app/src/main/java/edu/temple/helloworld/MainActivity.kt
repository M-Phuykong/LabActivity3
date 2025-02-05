package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)

        
        findViewById<Button>(R.id.clickMeButton).setOnClickListener {

            val input_text = findViewById<EditText>(R.id.nameEditText).text

            if (input_text.isBlank()) {
                displayTextView.text = "Please enter a name first"
            }
            else {
                displayTextView.text = "Hello, ${input_text}"

            }

        }


    }
}