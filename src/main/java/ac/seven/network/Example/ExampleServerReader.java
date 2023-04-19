package ac.seven.network.Example;

import ac.seven.network.API.NettyUtils;
import io.netty.channel.ChannelHandlerContext;

import java.util.HashMap;

public class ExampleServerReader implements NettyUtils.Reader {
    @Override
    public void reader(ChannelHandlerContext ctx, Object info) {
        //System.out.println((HashMap<String, Object>) info);
        // 해야 할 프로세싱
    }

    @Override
    public void setName(String Name) {

    }

    private String Name;

    public ExampleServerReader(String Name) {
        this.Name = Name;
    }

    @Override
    public NettyUtils.Reader newInstance(String Name) {
        return new ExampleServerReader(Name);
    }

    @Override
    public String getName() {
        return null;
    }
}
