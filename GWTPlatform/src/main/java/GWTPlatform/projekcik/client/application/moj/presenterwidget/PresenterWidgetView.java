package GWTPlatform.projekcik.client.application.moj.presenterwidget;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class PresenterWidgetView extends ViewImpl implements PresenterWidgetPresenter.MyView {
    interface Binder extends UiBinder<Widget, PresenterWidgetView> {
    }

    @UiField Button takB;
    @UiField Button nieB;
    @UiField Button popupDialogs;
    @UiField Button eventy;
    

    public Button getEventy() {
		return eventy;
	}


	public Button getPopupDialogs() {
		return popupDialogs;
	}


	@Inject
    PresenterWidgetView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }


	public Button getTakB() {
		return takB;
	}


	public Button getNieB() {
		return nieB;
	}
}