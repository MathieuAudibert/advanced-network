package com.example;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] buf = new byte[1024];

        InetAddress ipaddress = InetAddress.getByName("localhost");
        String message = "je teste";
        buf = message.getBytes();
        DatagramPacket packet = new DatagramPacket(buf, buf.length, ipaddress, 4000);
        socket.send(packet);
    }
}