package GWTPlatform.projekcik.client.application.moj;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class MojView extends ViewImpl implements MojPresenter.MyView {
    interface Binder extends UiBinder<Widget, MojView> {
    }

    	
    // tworzymy uifieldy
   @UiField Label pierszTekst;
   @UiField TextBox pierwszyBox;
   @UiField Button pierwszyPrzycisk;
   @UiField TextBox drugiBox;
   @UiField TextBox trzeciBox;
   @UiField HTMLPanel presenterWidget;
   @UiField Button usun;
   

    public Button getUsun() {
	return usun;
}



	public TextBox getDrugiBox() {
	return drugiBox;
}
    


    @Override
    public void setInSlot(Object slot, IsWidget content) {
    	if(slot == MojPresenter.SLOT_page){
    		presenterWidget.clear();
    	
    	if(content !=null){
    		presenterWidget.add(content);
    	}
    }else{
    	
    	super.setInSlot(slot, content);
    }
    }
    
public void setDrugiBox(TextBox drugiBox) {
	this.drugiBox = drugiBox;
}

public TextBox getTrzeciBox() {
	return trzeciBox;
}

public void setTrzeciBox(TextBox trzeciBox) {
	this.trzeciBox = trzeciBox;
}

	@Inject
    MojView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }


	public Label getPierszTekst() {
		return pierszTekst;
	}


	public void setPierszTekst(Label pierszTekst) {
		this.pierszTekst = pierszTekst;
	}

	public TextBox getPierwszyBox() {
		return pierwszyBox;
	}

	public void setPierwszyBox(TextBox pierwszyBox) {
		this.pierwszyBox = pierwszyBox;
	}

	public Button getPierwszyPrzycisk() {
		return pierwszyPrzycisk;
	}

	public void setPierwszyPrzycisk(Button pierwszyPrzycisk) {
		this.pierwszyPrzycisk = pierwszyPrzycisk;
	}
   
}