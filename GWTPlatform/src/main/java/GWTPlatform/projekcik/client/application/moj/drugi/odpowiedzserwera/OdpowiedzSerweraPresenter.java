package GWTPlatform.projekcik.client.application.moj.drugi.odpowiedzserwera;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.rpc.shared.DispatchAsync;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import GWTPlatform.projekcik.client.application.moj.presenterrpc.PresenterRPCPresenter;
import GWTPlatform.projekcik.client.place.NameTokens;
import sharedRPC.WyslijTekstDoSerwera;
import sharedRPC.WyslijTekstDoSerweraResult;

public class OdpowiedzSerweraPresenter
		extends Presenter<OdpowiedzSerweraPresenter.MyView, OdpowiedzSerweraPresenter.MyProxy> {

	public static final String tekstDlaSerwera = "tekstDoServera";
	private String tekstDoServera;
	public static final String nameToken = "odpowiedz";

	private final PlaceManager placeManager;
	//private final DispatchAsync async;


	interface MyView extends View {
		Button getZamknij();

		void OdpowiedziOdSerwera(String serwerResponse);

		void UstawTekstDoSerwera(String tekstDoServera);
	}

	@ContentSlot
	public static final Type<RevealContentHandler<?>> SLOT_OdpowiedzSerwera = new Type<RevealContentHandler<?>>();

	@NameToken(nameToken)
	@ProxyStandard
	interface MyProxy extends ProxyPlace<OdpowiedzSerweraPresenter> {
	}

	@Inject
	OdpowiedzSerweraPresenter(EventBus eventBus, MyView view, MyProxy proxy, PlaceManager placeManager) {
		super(eventBus, view, proxy, RevealType.Root);
		this.placeManager = placeManager;
		//this.async=async;
	}

	@Override
	public void prepareFromRequest(PlaceRequest request) {
		super.prepareFromRequest(request);
		tekstDoServera = request.getParameter(tekstDlaSerwera, null);
	}
	 @Override
	 	  protected void revealInParent() {
	 	    RevealRootContentEvent.fire(this, this);
	 	  }

	protected void onBind() {
		super.onBind();
		registerHandler(getView().getZamknij().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				placeManager.revealPlace(new PlaceRequest(
						PresenterRPCPresenter.nameToken));
			}
		}));
	}
	
//	protected void onReset(){
//		super.onReset();
//		getView().UstawTekstDoSerwera(tekstDoServera);
//		getView().OdpowiedziOdSerwera("czekaj na odpowiedzi");
//		
//		async.execute(new WyslijTekstDoSerwera(tekstDoServera),new AsyncCallback<WyslijTekstDoSerweraResult>() {
//
//			@Override
//			public void onFailure(Throwable caught) {
//				getView().OdpowiedziOdSerwera("errro"+caught.getMessage());
//				
//			}
//
//			@Override
//			public void onSuccess(WyslijTekstDoSerweraResult result) {
//				getView().OdpowiedziOdSerwera(result.getOdpowiedzi());
//				
//			}
//			
//		});
//		
//	}

	

}