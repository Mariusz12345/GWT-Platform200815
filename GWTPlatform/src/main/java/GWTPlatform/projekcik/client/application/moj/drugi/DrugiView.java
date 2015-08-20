package GWTPlatform.projekcik.client.application.moj.drugi;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class DrugiView extends ViewImpl implements DrugiPresenter.MyView {
	interface Binder extends UiBinder<Widget, DrugiView> {
	}

	@UiField Label drugilabel;
	@UiField Label trzecilabel;

	public Label getTrzecilabel() {
		return trzecilabel;
	}

	public void setTrzecilabel(Label trzecilabel) {
		this.trzecilabel = trzecilabel;
	}

	public Label getDrugilabel() {
		return drugilabel;
	}

	@Inject
	DrugiView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

}