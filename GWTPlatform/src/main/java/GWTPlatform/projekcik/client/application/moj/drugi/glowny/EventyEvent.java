package GWTPlatform.projekcik.client.application.moj.drugi.glowny;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public class EventyEvent extends GwtEvent<EventyEvent.EventyHandler> {
    private static Type<EventyHandler> TYPE = new Type<EventyHandler>();
    
    public interface EventyHandler extends EventHandler {
        void onEventy(EventyEvent event);
    }
    

    public static Type<EventyHandler> getType() {
        return TYPE;
    }

    @Override
    protected void dispatch(final EventyHandler handler) {
        handler.onEventy(this);
    }

    @Override
    public Type<EventyHandler> getAssociatedType() {
        return TYPE;
    }
    
   
}