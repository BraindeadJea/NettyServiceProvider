package ac.seven.network.Example;

import ac.seven.network.API.NettyUtils;

public class ExampleServerReader implements NettyUtils.Reader {
    @Override
    public void reader(Object info) {
        // 해야 할 프로세싱
    }

    private String Name;

    public ExampleServerReader(String Name) {
        this.Name = Name;
    }
}
