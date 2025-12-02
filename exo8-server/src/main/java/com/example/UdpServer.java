package com.example;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(4000);
        byte[] buf = new byte[1024];

        while (true) {
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            String msg = new String(packet.getData(), 0, packet.getLength());

            InetAddress ipaddress = packet.getAddress();
            int port = packet.getPort();
            System.out.println(ipaddress.getHostAddress() + ":" + port);
            System.out.println(msg);
        }
    }
}