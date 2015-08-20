package GWTPlatform.projekcik.server.rpc;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.gwtplatform.dispatch.rpc.server.ExecutionContext;
import com.gwtplatform.dispatch.rpc.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;

import shared.FieldVerifier;
import sharedRPC.WyslijTekstDoSerwera;
import sharedRPC.WyslijTekstDoSerweraResult;

public class WyslijTekstDoSerweraHandler implements ActionHandler<WyslijTekstDoSerwera,WyslijTekstDoSerweraResult>{
	
	
	 private Provider<HttpServletRequest> requestProvider;
	 private ServletContext servletContext;
	 
	 @Inject
	 WyslijTekstDoSerweraHandler(ServletContext servletContext,
	      Provider<HttpServletRequest> requestProvider) {
	    this.servletContext = servletContext;
	    this.requestProvider = requestProvider;
	  }
	 
	 
	 @Override
	  public WyslijTekstDoSerweraResult execute(WyslijTekstDoSerwera action,
	      ExecutionContext context) throws ActionException {

	    String input = action.getTekstDoSerwera();

	    if (!FieldVerifier.isValidName(input)) {
	      throw new ActionException("Name must be at least 4 characters long");
	    }

	    String serverInfo = servletContext.getServerInfo();
	    String userAgent = requestProvider.get().getHeader("User-Agent");
	    return new WyslijTekstDoSerweraResult("Hello, " + input
	        + "!<br><br>I am running " + serverInfo
	        + ".<br><br>It looks like you are using:<br>" + userAgent);
	  }
	 
	 @Override
	  public Class<WyslijTekstDoSerwera> getActionType() {
	    return WyslijTekstDoSerwera.class;
	  }

	  @Override
	  public void undo(WyslijTekstDoSerwera action, WyslijTekstDoSerweraResult result,
	      ExecutionContext context) throws ActionException {
	  }
	 
	 
	
	

}
