package GWTPlatform.projekcik.client.application.moj.drugi.popupdialogs.bladpresentera;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class BladPresenteraModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(BladPresenteraPresenter.class, BladPresenteraPresenter.MyView.class, BladPresenteraView.class, BladPresenteraPresenter.MyProxy.class);
    }
}