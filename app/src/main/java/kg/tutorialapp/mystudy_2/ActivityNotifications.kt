package kg.tutorialapp.mystudy_2

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class ActivityNotifications : AppCompatActivity() {
    private val NotificationID = 103
    private val CHANNEL_ID = "channel_id_01"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)
        createNotificationsChannel()

        val button = findViewById<Button>(R.id.btn_note)
        button.setOnClickListener{
            sendNotifications()
        }
    }

    private fun createNotificationsChannel(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val title = "Note Title"
            val note_description = "Note Description"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, title, importance). apply {
                description = note_description
            }
            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun sendNotifications() {
        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_baseline_coronavirus_24)
                .setContentTitle("Notification")
                .setContentText("Ready")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        with(NotificationManagerCompat.from(this)){
            notify(NotificationID, builder.build())
        }
    }
}