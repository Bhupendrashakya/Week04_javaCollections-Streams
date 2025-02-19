package com.tit.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReaderThread extends Thread{
    private PipedInputStream pis;
    private StringBuilder receivedData;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
        this.receivedData = new StringBuilder();
    }

    @Override
    public void run() {
        try {
            int data;
            while ((data = pis.read()) != -1) {
                receivedData.append((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to get the received data
    public String getReceivedData() {
        return receivedData.toString();
    }

}
