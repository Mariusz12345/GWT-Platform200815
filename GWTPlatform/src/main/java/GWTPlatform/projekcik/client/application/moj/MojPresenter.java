package GWTPlatform.projekcik.client.application.moj;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import GWTPlatform.projekcik.client.application.moj.drugi.glowny.GlownyPresenter;
import GWTPlatform.projekcik.client.application.moj.drugi.popupdialogs.PopupDialogsPresenter;
import GWTPlatform.projekcik.client.application.moj.presenterwidget.PresenterWidgetPresenter;
import GWTPlatform.projekcik.client.place.NameTokens;
public class MojPresenter extends Presenter<MojPresenter.MyView, MojPresenter.MyProxy>  {
   
	public static final Object SLOT_page = new  Object();
	
	interface MyView extends View  {
    	
    	public Label getPierszTekst();
    	public TextBox getPierwszyBox();
    	public Button getPierwszyPrzycisk();
    	public TextBox getDrugiBox();
    	public TextBox getTrzeciBox();
    	public Button getUsun();
    }
	
   @Inject PresenterWidgetPresenter  widgetPresenter;

    @NameToken(NameTokens.first)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<MojPresenter> {
    }

    @Inject
    MojPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);
        
    }
    protected void revealInParent(){
    	RevealContentEvent.fire(this, GlownyPresenter.SLOT_Glowny, this);
    }
    
    protected void onBind() {
        super.onBind();
        //?
        PopupView view = null;
        PopupDialogsPresenter dialogsPresenter = null;
        PlaceManager placeManager = null; 
        PresenterWidgetPresenter presenter = null;
        MojPresenter mojPresenter = new MojPresenter(null, null, null);
        
        getView().getUsun().addClickHandler(new ClickHandler() {
			
        	
			@Override
			public void onClick(ClickEvent event) {
				getView().getPierwszyBox().setText("");
		    	getView().getDrugiBox().setText("");
		    	getView().getTrzeciBox().setText("");
			
			}
		});
    }
    
   @Inject PlaceManager placeMenager;
    
    protected void onReset(){
    	super.onReset();
    	
    	setInSlot(SLOT_page, widgetPresenter);
    	// w presenterze ustawiamy wartosc boxa
    	getView().getPierwszyBox().setText("Podaj imie klienta");
    	getView().getDrugiBox().setText("Podaj nazwisko klienta");
    	getView().getTrzeciBox().setText("Podaj pesel klienta");
    	
    	getView().getPierwszyPrzycisk().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				@SuppressWarnings("deprecation")
				PlaceRequest request = new PlaceRequest(NameTokens.drugi).with("name", getView().getPierwszyBox().getText());
				placeMenager.revealPlace(request);
			}
		});
    }
    
}