package com.example.handler;

import java.io.OutputStream;
import java.net.Socket;

public class ClientHandler extends Thread {
    private Socket client;

    public ClientHandler(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        String ipClient = client.getInetAddress().getHostAddress();
        System.out.println("client" + ipClient + " connecté");

        try {
            OutputStream output = client.getOutputStream();
            output.write(("bonjour" + ipClient + "!").getBytes());
            output.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
