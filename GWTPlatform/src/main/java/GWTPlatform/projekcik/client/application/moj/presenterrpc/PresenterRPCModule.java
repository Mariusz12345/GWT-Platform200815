package GWTPlatform.projekcik.client.application.moj.presenterrpc;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class PresenterRPCModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(PresenterRPCPresenter.class, PresenterRPCPresenter.MyView.class, PresenterRPCView.class, PresenterRPCPresenter.MyProxy.class);
    }
}