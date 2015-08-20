package GWTPlatform.projekcik.client.application.moj.drugi.popupdialogs;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.PopupView;

public class PopupDialogsPresenter extends PresenterWidget<PopupDialogsPresenter.MyView>  {
    interface MyView extends PopupView  {
    	
    	public Button getGuzik();
    }

    @Inject
    PopupDialogsPresenter(
            EventBus eventBus,
            MyView view) {
        super(eventBus, view);
    }
    protected void onBind() {
        super.onBind();
        
        getView().getGuzik().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				getView().hide();
			}
		});
    }
    
}