package com.example.trabajopractico1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MensajeRecibido extends BroadcastReceiver {
    @Override
    int a;
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Ha recibido un mensaje nuevo",Toast.LENGTH_LONG).show();
    }
}
