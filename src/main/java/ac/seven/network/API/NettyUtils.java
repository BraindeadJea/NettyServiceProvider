package ac.seven.network.API;

import ac.seven.network.Example.ExampleClientReader;
import ac.seven.network.Example.ExampleServerReader;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;

public class NettyUtils {

    public static String Name = "unique name";


    public interface Reader {

        abstract void reader(ChannelHandlerContext channel, Object info);

        abstract void setName(String Name);

        abstract Reader newInstance(String Name);

        abstract String getName();
    }
}
