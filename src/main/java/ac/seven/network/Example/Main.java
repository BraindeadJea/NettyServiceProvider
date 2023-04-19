package ac.seven.network.Example;

import ac.seven.network.API.IO.Client;
import ac.seven.network.API.IO.Server;
import io.netty.channel.Channel;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) throws Exception {
        /*=*/int port = 9988;
        /*=*/String host = "127.0.0.1";
        /*=*/String clientName = "clientName";
        /*=*/String serverName = "serverName";


        /* 예시 패킷 리시너 */

        /* 패킷리시너/패킷리더는 NettyUtils.Reader를 Implements 해야 하고,
           @Override
           public void reader(Object 메세지)
           를 오버라이딩 한후 자신만의 커스텀 리시너를 만들면 됩니다 */
        ExampleServerReader serverReader = new ExampleServerReader(serverName);
        ExampleClientReader clientReader = new ExampleClientReader(clientName);



        /*Connecting*/
        Server server = new Server();
        server.run(port, serverReader);
        Thread.sleep(5000); //wait for load
        Client client = new Client();
        CompletableFuture<Channel> clientFutureChannel = client.run(host, port, clientReader);



        /*서버측 커넥션*/

        /*클라이언트측 커넥션*/
        Channel clientChannel = clientFutureChannel.get();

    }
}