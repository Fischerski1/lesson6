import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class HttpServer extends Thread {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client accepted");
        }
    }
}