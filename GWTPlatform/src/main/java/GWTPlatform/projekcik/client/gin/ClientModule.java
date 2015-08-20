package GWTPlatform.projekcik.client.gin;

import GWTPlatform.projekcik.client.application.ApplicationModule;
import GWTPlatform.projekcik.client.place.NameTokens;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

/**
 * See more on setting up the PlaceManager on <a
 * href="// See more on: https://github.com/ArcBees/GWTP/wiki/PlaceManager">DefaultModule's > DefaultPlaceManager</a>
 */
public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule());
        install(new ApplicationModule());

        // DefaultPlaceManager Places
        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.first);
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.error);
        bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.first);
        
    }
}
