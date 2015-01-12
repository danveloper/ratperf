package perf;

import ratpack.server.RatpackServer;
import ratpack.server.ServerConfig;

public class Main {

    public static void main(String[] args) throws Exception {
        RatpackServer.of(b -> b.
                        config(ServerConfig.noBaseDir()).
                        handlers(chain -> chain.
                                        get(ctx -> ctx.render("Hello World!"))
                        )
        ).start();
    }
}
