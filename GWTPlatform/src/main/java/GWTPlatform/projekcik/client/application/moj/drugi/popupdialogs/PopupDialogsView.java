package GWTPlatform.projekcik.client.application.moj.drugi.popupdialogs;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupViewImpl;

class PopupDialogsView extends PopupViewImpl implements PopupDialogsPresenter.MyView {
    interface Binder extends UiBinder<Widget, PopupDialogsView> {
    }

   @UiField Button guzik;
   
    @Inject
    PopupDialogsView(EventBus eventBus, Binder uiBinder) {
        super(eventBus);
    
        initWidget(uiBinder.createAndBindUi(this));
    }


	public Button getGuzik() {
		return guzik;
	}


	public void setGuzik(Button guzik) {
		this.guzik = guzik;
	}
    
}