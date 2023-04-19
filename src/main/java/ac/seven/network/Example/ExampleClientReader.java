package ac.seven.network.Example;

import ac.seven.network.API.NettyUtils;

public class ExampleClientReader implements NettyUtils.Reader {
    @Override
    public void reader(Object info) {
        // 해야 할 프로세싱
    }

    private String Name;

    public ExampleClientReader(String Name) {
        this.Name = Name;
    }
}
