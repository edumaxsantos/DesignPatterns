package br.com.edumaxsantos.behavioral.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class SensorSystem {
    private List<AlarmListener> listeners = new ArrayList<>();

    public void register(AlarmListener alarmListener) {
        listeners.add(alarmListener);
    }

    public void soundTheAlarm() {
        listeners.forEach(AlarmListener::alarm);
    }
}
