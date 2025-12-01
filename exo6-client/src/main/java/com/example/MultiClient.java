package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class MultiClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        InputStream input = socket.getInputStream();

        byte[] buf = new byte[1024];
        int len = input.read(buf);
        String res = new String(buf, 0, len);
        System.out.println(res);
    }
}