package GWTPlatform.projekcik.client.application.moj.drugi.glowny;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;


class GlownyView extends ViewWithUiHandlers<GlownyUiHandlers> implements GlownyPresenter.MyView {
    interface Binder extends UiBinder<Widget, GlownyView> {
    }
    
    @UiField HTMLPanel zawartosci;
    @UiField Label labelek;
    
    

    public Label getLabelek() {
		return labelek;
	}

	@Inject
    GlownyView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
    @Override
    public void setInSlot(Object slot, IsWidget content) {
    	if(slot ==GlownyPresenter.SLOT_Glowny ){
    		zawartosci.clear();
    		if(content != null){
    			zawartosci.add(content);
    		}
    	}else{
    	super.setInSlot(slot, content);
    	}
    }
    
    
}