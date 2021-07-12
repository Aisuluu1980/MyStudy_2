package kg.tutorialapp.mystudy_2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MessageReceiver:BroadcastReceiver(){
    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "kg.tutorialapp.action.MESSAGE", Toast.LENGTH_LONG).show()
    }
}


