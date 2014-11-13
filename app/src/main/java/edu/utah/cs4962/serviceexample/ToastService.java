package edu.utah.cs4962.serviceexample;

import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by zbynek on 11/12/2014.
 */
public class ToastService extends android.app.Service
{

    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }
}
