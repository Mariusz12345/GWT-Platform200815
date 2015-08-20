package GWTPlatform.projekcik.client.application.moj.presenterrpc;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
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

import GWTPlatform.projekcik.client.application.moj.drugi.odpowiedzserwera.OdpowiedzSerweraPresenter;
import GWTPlatform.projekcik.client.place.NameTokens;
import shared.FieldVerifier;
public class PresenterRPCPresenter extends Presenter<PresenterRPCPresenter.MyView, PresenterRPCPresenter.MyProxy>  {
   
	private final PlaceManager placeManager;
	public static final String nameToken = "rpc";
	
	interface MyView extends View  {
    	 String getWypisz();
       	 Button getPrzeslij();
       	void resetuj();
       	void blad();
        
    }
    @ContentSlot
    public static final Type<RevealContentHandler<?>> SLOT_PresenterRPC = new Type<RevealContentHandler<?>>();

    @NameToken(nameToken)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<PresenterRPCPresenter> {
   
    }

    @Inject
    PresenterRPCPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy,
         PlaceManager placeManager) {
        super(eventBus, view, proxy, RevealType.Root);
        this.placeManager = placeManager;
        
    }
    
    protected void onBind() {
        super.onBind();
        
        registerHandler(getView().getPrzeslij().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				wyslijNaSerwer();
				
			}
		}));
       
    }
    protected void onReset(){
    	super.onReset();
    	getView().resetuj();
    }
    protected void revealInParent(){
    	RevealRootContentEvent.fire(this, this);
    }
    private void wyslijNaSerwer() {
        //getView().setError("");
        String tekstDoSerwera = getView().getWypisz();
        
      // if (FieldVerifier.isValidName(tekstDoSerwera)) {
         
    	   placeManager.revealPlace(new PlaceRequest(OdpowiedzSerweraPresenter.nameToken).with(
    			   	          OdpowiedzSerweraPresenter.tekstDlaSerwera, tekstDoSerwera));
      // }
    }
}