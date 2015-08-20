package GWTPlatform.projekcik.client.application.moj;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

import GWTPlatform.projekcik.client.application.home.HomeModule;
import GWTPlatform.projekcik.client.application.moj.drugi.DrugiModule;
import GWTPlatform.projekcik.client.application.moj.presenterwidget.PresenterWidgetModule;
import GWTPlatform.projekcik.client.application.moj.presenterrpc.PresenterRPCModule;

public class MojModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
		install(new PresenterRPCModule());
		install(new PresenterWidgetModule());
		install(new DrugiModule());
		bindPresenter(MojPresenter.class, MojPresenter.MyView.class, MojView.class, MojPresenter.MyProxy.class);
    }
}