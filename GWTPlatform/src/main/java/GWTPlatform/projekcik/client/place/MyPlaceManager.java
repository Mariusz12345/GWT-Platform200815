package GWTPlatform.projekcik.client.place;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManagerImpl;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.gwtplatform.mvp.shared.proxy.TokenFormatter;

import GWTPlatform.projekcik.client.application.moj.presenterrpc.PresenterRPCPresenter;

public class MyPlaceManager extends PlaceManagerImpl  {
	@Inject
		  public MyPlaceManager(EventBus eventBus, TokenFormatter tokenFormatter) {
		    super(eventBus, tokenFormatter);
		  }

	@Override
	public void revealDefaultPlace() {
		revealPlace(new PlaceRequest(PresenterRPCPresenter.nameToken));
	}
}
