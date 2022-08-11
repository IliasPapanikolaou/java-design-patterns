package com.unipi.ipap.javadesignpatterns.adapter;

import com.unipi.ipap.javadesignpatterns.adapter.carspeed.BugattiVeyron;
import com.unipi.ipap.javadesignpatterns.adapter.carspeed.Movable;
import com.unipi.ipap.javadesignpatterns.adapter.carspeed.MovableAdapter;
import com.unipi.ipap.javadesignpatterns.adapter.carspeed.MovableAdapterImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarSpeedTest {

    private static final double DELTA = 1e-5; // 0.00001

    @Test
    void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        assertAll(
                () -> assertEquals(431.30312, bugattiVeyronAdapter.getSpeed(), DELTA),
                () -> assertEquals(268, bugattiVeyron.getSpeed(), DELTA)
        );
    }
}
