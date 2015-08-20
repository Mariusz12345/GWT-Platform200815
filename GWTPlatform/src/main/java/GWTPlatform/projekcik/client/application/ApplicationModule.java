package GWTPlatform.projekcik.client.application;

import GWTPlatform.projekcik.client.application.home.HomeModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import GWTPlatform.projekcik.client.application.moj.MojModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
       
		install(new MojModule());
		install(new HomeModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
