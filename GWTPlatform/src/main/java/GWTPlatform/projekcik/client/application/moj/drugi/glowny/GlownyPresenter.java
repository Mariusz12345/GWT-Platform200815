package GWTPlatform.projekcik.client.application.moj.drugi.glowny;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Label;
import com.google.inject.Inject;
import com.google.inject.PrivateBinder;
import com.google.web.bindery.event.shared.EventBus;
    import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

import GWTPlatform.projekcik.client.application.moj.drugi.glowny.EventyEvent.EventyHandler;

import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.dispatch.rpc.shared.DispatchAsync;
import com.gwtplatform.mvp.client.HasUiHandlers;
public class GlownyPresenter extends Presenter<GlownyPresenter.MyView, GlownyPresenter.MyProxy> implements GlownyUiHandlers {
    interface MyView extends View , HasUiHandlers<GlownyUiHandlers> {
    	public Label getLabelek();
    }
    @ContentSlot
    public static final Type<RevealContentHandler<?>> SLOT_Glowny = new Type<RevealContentHandler<?>>();

    
    private EventyHandler s  = new EventyHandler() {
		
		@Override
		public void onEventy(EventyEvent event) {
			getView().getLabelek().setText("");
		}
	};
    
    @ProxyStandard
    interface MyProxy extends Proxy<GlownyPresenter> {
    }
    

    @Inject
    GlownyPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);
        
        getView().setUiHandlers(this);
    }
    protected void revealInParent(){
    	RevealRootContentEvent.fire(this	, this);
    }
    
    protected void onBind() {
        super.onBind();
        registerHandler(getEventBus().addHandler(EventyEvent.getType(), s));
    }
    
}