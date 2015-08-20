package GWTPlatform.projekcik.client.application.moj.drugi.trzeci;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class TrzeciView extends ViewImpl implements TrzeciPresenter.MyView {
    interface Binder extends UiBinder<Widget, TrzeciView> {
    }

   

    @Inject
    TrzeciView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
 
}