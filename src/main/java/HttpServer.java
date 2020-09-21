import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;


public class HttpServer {

    public static void main(String[] args) throws Throwable {
        ServerSocket ss = new ServerSocket(8080);
        while (true) {
            Socket socket = ss.accept();
            System.err.println("Client accepted");
            new Thread(new SocketProcessor(socket)).start();
        }
    }


    private static class SocketProcessor implements Runnable {
        private Socket socket;
        private InputStream is;
        private OutputStream os;

        public SocketProcessor(Socket socket) {
            this.socket = socket;
            this.is = is;
            this.os = os;
        }

        @Override
        public void run() {

        }
    }
}