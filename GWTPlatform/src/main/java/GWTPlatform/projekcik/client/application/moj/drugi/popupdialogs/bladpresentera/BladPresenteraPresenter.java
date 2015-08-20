package GWTPlatform.projekcik.client.application.moj.drugi.popupdialogs.bladpresentera;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
    import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import GWTPlatform.projekcik.client.application.moj.drugi.glowny.GlownyPresenter;
import GWTPlatform.projekcik.client.place.NameTokens;
public class BladPresenteraPresenter extends Presenter<BladPresenteraPresenter.MyView, BladPresenteraPresenter.MyProxy>  {
    interface MyView extends View  {
    }
    @ContentSlot
    public static final Type<RevealContentHandler<?>> SLOT_BladPresentera = new Type<RevealContentHandler<?>>();

    @NameToken(NameTokens.error)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<BladPresenteraPresenter> {
    }

    @Inject
    BladPresenteraPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy) {
        super(eventBus, view, proxy, GlownyPresenter.SLOT_Glowny);
        
    }
    
    protected void onBind() {
        super.onBind();
    }
    
}