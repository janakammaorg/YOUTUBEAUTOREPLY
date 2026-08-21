package com.januprime.autoreply;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

public class NotificationService extends NotificationListenerService {

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        String packageName = sbn.getPackageName();
        
        // ఇది యూట్యూబ్ నోటిఫికేషన్ అవునా కాదా అని చెక్ చేస్తుంది
        if (packageName.equals("com.google.android.youtube")) {
            Log.d("JanuPrimeApp", "యూట్యూబ్ నుండి కొత్త కామెంట్ వచ్చింది!");
            
            // ఇక్కడే మనం కామెంట్ ని చదివి, "Link" ఉంటే రిప్లై ఇచ్చే కోడ్ రాస్తాం
        }
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
        // నోటిఫికేషన్ క్లియర్ చేసినప్పుడు ఇది రన్ అవుతుంది
    }
}
