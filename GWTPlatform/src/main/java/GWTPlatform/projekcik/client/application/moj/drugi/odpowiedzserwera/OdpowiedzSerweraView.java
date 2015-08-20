package GWTPlatform.projekcik.client.application.moj.drugi.odpowiedzserwera;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class OdpowiedzSerweraView extends ViewImpl implements OdpowiedzSerweraPresenter.MyView {
    interface Binder extends UiBinder<Widget, OdpowiedzSerweraView> {
    }

   @UiField Button zamknij;

    @Inject
    OdpowiedzSerweraView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

	public Button getZamknij() {
		return zamknij;
	}

	@Override
	public void OdpowiedziOdSerwera(String serwerResponse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UstawTekstDoSerwera(String tekstDoServera) {
		// TODO Auto-generated method stub
		
	}
    
    
    
}