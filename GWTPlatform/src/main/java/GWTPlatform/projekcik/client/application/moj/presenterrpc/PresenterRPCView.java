package GWTPlatform.projekcik.client.application.moj.presenterrpc;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class PresenterRPCView extends ViewImpl implements PresenterRPCPresenter.MyView {
    interface Binder extends UiBinder<Widget, PresenterRPCView> {
    	
    }
    
    @UiField
	TextBox wypisz;
	@UiField
	Button przeslij;

	@Override
	public String getWypisz() {
		return wypisz.getText();
	}

	public Button getPrzeslij() {
		return przeslij;
	}

    @Inject
    PresenterRPCView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
    @Override
	public void resetuj() {
		wypisz.setFocus(true);
		wypisz.selectAll();
	}

	@Override
	public void blad() {
		// bez error label
	}
   
}

