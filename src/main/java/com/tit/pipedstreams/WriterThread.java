package com.tit.pipedstreams;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriterThread extends Thread {
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                pos.write(("Message " + i + "\n").getBytes());
                System.out.println("Written: Message " + i);
                Thread.sleep(500);  // Simulate delay
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                pos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
