package GWTPlatform.projekcik.client.application.moj.presenterwidget;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
    import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;

import GWTPlatform.projekcik.client.application.moj.drugi.glowny.EventyEvent;
import GWTPlatform.projekcik.client.application.moj.drugi.popupdialogs.PopupDialogsPresenter;
public class PresenterWidgetPresenter extends PresenterWidget<PresenterWidgetPresenter.MyView>  {
	
	
	
	@Inject PopupDialogsPresenter popupDialogsPresenter;
	
    interface MyView extends View  {
    	public Button getTakB();
    	public Button getNieB();
    	public Button getPopupDialogs();
    	public Button getEventy();
    }
    
    private final EventBus eventBus;

    @Inject
    PresenterWidgetPresenter(
            EventBus eventBus,
            MyView view) {
        super(eventBus, view);
        this.eventBus= eventBus;
    }
    
    protected void onBind() {
        super.onBind();
        getView().getTakB().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("To jest wspaniala strona");
			}
		});
        getView().getNieB().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
			 Window.alert("Moglby byc lepszy");
			}
		});
        getView().getPopupDialogs().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				addToPopupSlot(popupDialogsPresenter);
			}
		});
        getView().getEventy().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				EventyEvent eventyEvent  = new EventyEvent();
				PresenterWidgetPresenter.this.eventBus.fireEvent(eventyEvent);
			}
		});
    }
    
}