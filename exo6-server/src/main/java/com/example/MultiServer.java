package com.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.example.handler.ClientHandler;

public class MultiServer {
    public static void main(String[] args) throws IOException{
        ServerSocket srv = new ServerSocket(5000);
        
        while (true) {
            Socket client = srv.accept();
            ClientHandler handler = new ClientHandler(client);
            handler.start();
        }
    }
}