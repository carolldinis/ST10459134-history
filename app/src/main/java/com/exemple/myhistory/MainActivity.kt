package com.exemple.myhistory

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextAge = findViewById<EditText>(R.id.editTextAge)
        val buttonFind = findViewById<Button>(R.id.buttonFind)
        val buttonClear = findViewById<Button>(R.id.buttonClear)
        val textViewResult = findViewById<TextView>(R.id.textViewResult) // Correct declaration of textViewResult

        // OnClickListener for the "Find" button
        buttonFind.setOnClickListener {
            val ageText = editTextAge.text.toString().toIntOrNull()
            if (ageText != null && ageText in 20..100) {
                val famousPerson = findFamousPerson(ageText)
                // Set the result text view with the result or "No matches" if no match is found
                textViewResult.text = famousPerson ?: "No matches."
                // Log the result
                // Log.d("FindFamousPerson", famousPerson ?: "No matches.")
            } else {
                // Set the result text view with an error message
                textViewResult.text = "The age is invalid or out of range (20-100)."
                // Log the error message
                // Log.d("FindFamousPerson", "The age is invalid or out of range (20-100).")
            }
        }

        // OnClickListener for the "Clear" button
        buttonClear.setOnClickListener {
            // Clear the age edit text
            editTextAge.text.clear()
            // Clear the result text view
            textViewResult.text = ""
        }
    }

    // Function to find a famous person with the same age
    private fun findFamousPerson(age: Int): String? {
        if (age == 20){
            return "You are $age years old, which is the same age as River Phoenix."
        }else if (age == 27){
            return "You are $age years old, which is the same age as Jimi Hendrix."
        }else if (age == 30){
            return "You are $age years old, which is the same age as Heath Ledger."
        }else if (age == 36){
            return "You are $age years old, which is the same age as Marilyn Monroe."
        }else if (age == 40){
            return "You are $age years old, which is the same age as Kurt Cobain."
        }else if (age == 50){
            return "You are $age years old, which is the same age as John Lennon."
        }else if (age == 52){
            return "You are $age years old, which is the same age as Princess Diana."
        }else if (age == 56){
            return "You are $age years old, which is the same age as Whitney Houston."
        }else if (age == 60){
            return "You are $age years old, which is the same age as Steve Jobs."
        }else if (age == 63){
            return "You are $age years old, which is the same age as Michael Jackson."
        }else if (age == 67){
            return "You are $age years old, which is the same age as Robin Williams."
        }else if (age == 70){
            return "You are $age years old, which is the same age as David Bowie."
        }else if (age == 76){
            return "You are $age years old, which is the same age as Muhammad Ali."
        }else if (age == 80){
            return "You are $age years old, which is the same age as Leonard Nimoy."
        }else if (age == 90){
            return "You are $age years old, which is the same age as Stan Lee."
        }else{
            // Return null if no match is found
            return null
        }

        // Return null if no match is found
        return null
    }
}