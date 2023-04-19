package ac.seven.network.API;

import ac.seven.network.Example.ExampleClientReader;
import ac.seven.network.Example.ExampleServerReader;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;

public class NettyUtils {

    public static String Name = "unique name";


    public interface Reader {

        public default void reader(ChannelHandlerContext channel, Object info) {

        }

        public default void setName(String Name) {

        }

        public default NettyUtils.Reader newInstance(String Name) {
            return null;
        }

        public default String getName() {
            return null;
        }
    }
}
