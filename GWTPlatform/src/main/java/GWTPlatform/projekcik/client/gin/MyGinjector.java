package GWTPlatform.projekcik.client.gin;


import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;


import GWTPlatform.projekcik.client.application.moj.drugi.odpowiedzserwera.OdpowiedzSerweraPresenter;
import GWTPlatform.projekcik.client.application.moj.presenterrpc.PresenterRPCPresenter;
@GinModules({DispatchAsyncModule.class, ClientModule.class})
public interface MyGinjector extends Ginjector {
	
	EventBus getEventBus();
	  PlaceManager getPlaceManager();

	  Provider<PresenterRPCPresenter> getMainPagePresenter();
	 AsyncProvider<OdpowiedzSerweraPresenter> getResponsePresenter();
	  
}
