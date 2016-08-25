package ru.sadwork.wiki_isaac;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.ExecutorService;

public class DataService extends Service {

    final String LOG_TAG = "DataService";
    final int COUNT_TASCKS = 0;
    ExecutorService executor;

    public void onCreate() {
        super.onCreate();
        Log.d(LOG_TAG, "create");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(LOG_TAG, "start");

        return super.onStartCommand(intent, flags, startId);
    }

    public void onDestroy() {
        Log.d(LOG_TAG, "destroy");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(LOG_TAG, "bind");
        return null;
    }
}

