package GWTPlatform.projekcik.client.application.moj.drugi.popupdialogs.bladpresentera;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class BladPresenteraView extends ViewImpl implements BladPresenteraPresenter.MyView {
    interface Binder extends UiBinder<Widget, BladPresenteraView> {
    }

   

    @Inject
    BladPresenteraView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
  
}