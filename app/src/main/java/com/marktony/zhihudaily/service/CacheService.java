package com.marktony.zhihudaily.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class CacheService extends Service {
    public CacheService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
