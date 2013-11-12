package javax.edi.model.x12.edi816.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.TransactionSetTrailer;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Trailer {

	@NotNull
<<<<<<< HEAD
    private TransactionSetTrailer transactionSetTrailer;

    public TransactionSetTrailer getTransactionSetTrailer() {
            return transactionSetTrailer;
    }

    public void setTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
            this.transactionSetTrailer = transactionSetTrailer;
    }
=======
	private TransactionSetTrailer transactionSetTrailer;

	public TransactionSetTrailer getTransactionSetTrailer() {
		return transactionSetTrailer;
	}

	public void setTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
		this.transactionSetTrailer = transactionSetTrailer;
	}
	
	
>>>>>>> 82bf0b410ffadef60ba28960e9bcb18f9c50a158
		
}
