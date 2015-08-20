package GWTPlatform.projekcik.client.application.moj.drugi.odpowiedzserwera;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class OdpowiedzSerweraModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(OdpowiedzSerweraPresenter.class, OdpowiedzSerweraPresenter.MyView.class, OdpowiedzSerweraView.class, OdpowiedzSerweraPresenter.MyProxy.class);
    }
}