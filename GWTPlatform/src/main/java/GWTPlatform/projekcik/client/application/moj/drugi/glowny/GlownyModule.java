package GWTPlatform.projekcik.client.application.moj.drugi.glowny;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class GlownyModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(GlownyPresenter.class, GlownyPresenter.MyView.class, GlownyView.class, GlownyPresenter.MyProxy.class);
    }
    
}