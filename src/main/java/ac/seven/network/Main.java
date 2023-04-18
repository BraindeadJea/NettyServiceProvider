package ac.seven.network;

import ac.seven.network.IO.Client;
import ac.seven.network.IO.Server;
import io.netty.channel.Channel;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server();
        CompletableFuture<Channel> serverChannel = server.run(9988);
        Thread.sleep(10000);
        Client client = new Client();
        CompletableFuture<Channel> clientChannel = client.run("127.0.0.1", 9988);
        clientChannel.get();
        serverChannel.get().writeAndFlush("ㅎㅇ");
        /*Server server = new Server();
        new Thread(() -> {
            try {
                server.run(9998);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        Client client = new Client();
        new Thread(() -> {

            try {
                client.run("127.0.0.1", 9998);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();*/
    }
}