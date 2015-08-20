package GWTPlatform.projekcik.client.application.moj.drugi.popupdialogs;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import GWTPlatform.projekcik.client.application.moj.drugi.popupdialogs.bladpresentera.BladPresenteraModule;

public class PopupDialogsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
            install(new BladPresenteraModule());
			bindPresenterWidget(PopupDialogsPresenter.class, PopupDialogsPresenter.MyView.class, PopupDialogsView.class);
    }
}