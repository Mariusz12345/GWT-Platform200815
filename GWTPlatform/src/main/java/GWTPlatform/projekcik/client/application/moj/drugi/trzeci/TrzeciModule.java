package GWTPlatform.projekcik.client.application.moj.drugi.trzeci;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class TrzeciModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(TrzeciPresenter.class, TrzeciPresenter.MyView.class, TrzeciView.class, TrzeciPresenter.MyProxy.class);
    }
}