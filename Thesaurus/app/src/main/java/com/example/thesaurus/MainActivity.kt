package com.example.thesaurus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val w1 = arrayOf("happy", "merry", "cheerful", "elated", "glad");
    val w2 = arrayOf("sad", "bitter", "dismal", "somber", "melancholy");
    val w3 = arrayOf("angry", "annoyed", "bitter", "furious", "irate");
    val w4 = arrayOf("afraid", "anxious", "jittery", "uneasy", "hesitant");
    val w5 = arrayOf("dislike", "hatred", "loathing", "disgust", "revulsion");
    val w6 = arrayOf("surprised", "amazed", "shock", "wonder", "awe");
    val w7 = arrayOf("swift", "abrupt", "expeditious", "hasty", "nimble", "quick", "rapid", "speedy", "sudden", "unexpected");
    val w8 = arrayOf("objective", "detached", "disinterested", "dispassionate", "equitable", "evenhanded", "nonpartisan", "open-minded", "unbiased");
    val w9 = arrayOf("calculate", "adjust", "appraise", "consider", "count", "determine", "forecast", "gauge", "guess", "measure", "multiply", "reckon", "subtract", "tally", "weigh", "work out");
    val w0 = arrayOf("create", "build", "conceive", "constitute", "construct", "design", "devise", "discover", "establish", "forge", "form");

    val words = arrayOf(w1, w2, w3, w4, w5, w6, w7, w8, w9, w0);

    lateinit var availTextViewThes: TextView;
    lateinit var searchEditTextThes: EditText;
    lateinit var buttonThes: Button;
    lateinit var resViewThes: TextView;

    private fun updateUi(word: String) {
        for (i in words) {
            for (j in i) {
                if (word == j) {
                    return resViewThes.setText(i.joinToString { it.lowercase() });
                }
            }
        }
        resViewThes.setText("No synonyms");
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        availTextViewThes = findViewById<TextView>(R.id.availView_thes);
        searchEditTextThes = findViewById<EditText>(R.id.searchEdit_thes);
        buttonThes = findViewById<Button>(R.id.button_thes);
        resViewThes = findViewById<TextView>(R.id.resView_thes);

        availTextViewThes.setText(
            "Some words to search for: happy, sad, angry, afraid, dislike, suprised, swift, objective, calculate, create"
        );

        buttonThes.setOnClickListener() {
            updateUi(searchEditTextThes.text.toString().lowercase());
        }

    }
}