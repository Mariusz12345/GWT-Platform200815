package GWTPlatform.projekcik.server.guice;

import com.gwtplatform.dispatch.rpc.server.guice.HandlerModule;

import GWTPlatform.projekcik.server.rpc.WyslijTekstDoSerweraHandler;
import sharedRPC.WyslijTekstDoSerwera;

public class ServerModule extends HandlerModule {
    @Override
    protected void configureHandlers() {
    	bindHandler(WyslijTekstDoSerwera.class, WyslijTekstDoSerweraHandler.class);
    }
}
