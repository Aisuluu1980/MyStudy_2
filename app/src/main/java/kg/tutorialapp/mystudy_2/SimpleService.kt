package kg.tutorialapp.mystudy_2

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast
import java.util.concurrent.TimeUnit

class SimpleService:Service() {
    override fun onCreate() {
        super.onCreate()
        Log.d("TAG", "onCreate()")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        for (i in 1..10) {
            Log.d("TAG", "Iteration - $i")
            TimeUnit.SECONDS.sleep(1)
        }
        stopSelf()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show()
        super.onDestroy()
        Log.d("TAG", "onDestroy()")
    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Not yet implemented")
    }
}
