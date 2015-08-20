package sharedRPC;


import com.gwtplatform.dispatch.rpc.shared.Result;


public class WyslijTekstDoSerweraResult  implements Result  {

	
	private static final long serialVersionUID = 1L;
	
	private String Odpowiedzi;

	  public WyslijTekstDoSerweraResult(final String Odpowiedzi) {
	    this.Odpowiedzi = Odpowiedzi;
	  }

	  @SuppressWarnings("unused")
	  private WyslijTekstDoSerweraResult() {
	  }

	public String getOdpowiedzi() {
		return Odpowiedzi;
	}
}
