package sharedRPC;

import com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl;

public class WyslijTekstDoSerwera extends UnsecuredActionImpl<WyslijTekstDoSerweraResult>  {
	
	private String tekstDoSerwera;
	
	 public WyslijTekstDoSerwera(final String tekstDoSerwera) {
		    this.tekstDoSerwera = tekstDoSerwera;
		  }
		  @SuppressWarnings("unused")
		  private WyslijTekstDoSerwera() {
		  }

		public String getTekstDoSerwera() {
			return tekstDoSerwera;
		}
}
