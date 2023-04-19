package ac.seven.network.Example;

import ac.seven.network.API.NettyUtils;
import io.netty.channel.ChannelHandlerContext;

public class ExampleClientReader implements NettyUtils.Reader {


    public ExampleClientReader(String name) {
        this.Name = name;
    }

    @Override
    public void reader(ChannelHandlerContext ctx, Object info) {
        System.out.println(info);
    }

    public String getName() {
        return Name;
    }


    @Override
    public void setName(String name) {
        Name = name;
    }

    @Override
    public NettyUtils.Reader newInstance(String Name) {
        return new ExampleServerReader(Name);
    }
    private String Name;
}
