package kg.tutorialapp.mystudy_2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_receiver_47.*
import kotlinx.android.synthetic.main.activity_receiver_47.view.*

class ActivityReceiver_47 : AppCompatActivity() {
    lateinit var receiver: BroadcastReceiver
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver_47)

        context = this
        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_POWER_CONNECTED)
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED)
        receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                Toast.makeText(context, intent?.action, Toast.LENGTH_SHORT).show()
            }
        }
        registerReceiver(receiver, filter)
        btn_receiver_submit.setOnClickListener({
            sendBroadcast(Intent(context, MessageReceiver::class.java))
        })
    }
    override fun onDestroy() {
        unregisterReceiver(receiver)
        super.onDestroy()
    }
}