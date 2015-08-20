package GWTPlatform.projekcik.client.application.moj.drugi;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Label;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
    import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import GWTPlatform.projekcik.client.application.moj.drugi.glowny.GlownyPresenter;
import GWTPlatform.projekcik.client.place.NameTokens;
public class DrugiPresenter extends Presenter<DrugiPresenter.MyView, DrugiPresenter.MyProxy>  {
    interface MyView extends View  {
    	
    	public Label getDrugilabel();
    	public Label getTrzecilabel();
    }
  
    @NameToken(NameTokens.drugi)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<DrugiPresenter> {
    }

    @Inject
    DrugiPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);
        
    }
    protected void revealInParent(){
    	RevealContentEvent.fire(this, GlownyPresenter.SLOT_Glowny, this);
    }
    
   private String name="";
   private String name2="";
   
   public void prepareFromRequest(PlaceRequest request){
	   super.prepareFromRequest(request);
	   name= request.getParameter("name", "wartosci domyslna");
	   name2=request.getParameter("name", "wartosci domyslna2");
   }
    protected void onBind() {
        super.onBind();
    }
    
    protected void onReset(){
    	super.onReset();
    	getView().getDrugilabel().setText(name);
    	getView().getTrzecilabel().setText(name2);
    }
    
}