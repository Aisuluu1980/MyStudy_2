package kg.tutorialapp.mystudy_2

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class ActivitySharedPreferences : AppCompatActivity() {

    private lateinit var settings: SharedPreferences
    private lateinit var editShared: EditText
    private lateinit var textShared: TextView
    private lateinit var btnSave: Button
    private lateinit var btnDelete: Button

    companion object{
        const val APP_PREFERENCES = "My shared"
        const val APP_PREFERENCES_TEXT = "Text"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)

        settings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE)
        editShared = findViewById(R.id.edit_shared)
        textShared= findViewById(R.id.text_shared)
        btnSave = findViewById(R.id.btn_save)
        btnDelete = findViewById(R.id.btn_delete)

        if (settings.contains(APP_PREFERENCES_TEXT)) {
            textShared.setText(settings.getString(APP_PREFERENCES_TEXT, ""))
        }

        setup()
    }

    private fun setup() {
        btnSave.setOnClickListener {
            val text = editShared.text.toString()
            val editPreferences: SharedPreferences.Editor = settings.edit()
            editPreferences.putString(APP_PREFERENCES_TEXT, text)
            editPreferences.apply()
            textShared.setText(settings.getString(APP_PREFERENCES_TEXT, ""))
        }

        btnDelete.setOnClickListener {
            val editPreferences: SharedPreferences.Editor = settings.edit()
            editPreferences.remove(APP_PREFERENCES_TEXT)
            editPreferences.clear()
            editPreferences.apply()
        }
    }

}


