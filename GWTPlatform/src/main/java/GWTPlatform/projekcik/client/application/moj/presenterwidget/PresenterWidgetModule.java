package GWTPlatform.projekcik.client.application.moj.presenterwidget;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class PresenterWidgetModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
            bindPresenterWidget(PresenterWidgetPresenter.class, PresenterWidgetPresenter.MyView.class, PresenterWidgetView.class);
    }
}