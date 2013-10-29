package javax.edi.model.x12.edi824.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.FunctionalGroupTrailer;
import javax.edi.model.x12.segment.InterchangeEnvelopeTrailer;
import javax.edi.model.x12.segment.TransactionSetTrailer;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Trailer {
	
	@NotNull
	private TransactionSetTrailer transactionSetTrailer;
	
	@NotNull
	private FunctionalGroupTrailer functionalGroupTrailer;
	
	@NotNull
	private InterchangeEnvelopeTrailer interChangeControlTrailer;

	public TransactionSetTrailer getTransactionSetTrailer() {
		return transactionSetTrailer;
	}

	public void setTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
		this.transactionSetTrailer = transactionSetTrailer;
	}

	public FunctionalGroupTrailer getFunctionalGroupTrailer() {
		return functionalGroupTrailer;
	}

	public void setFunctionalGroupTrailer(
			FunctionalGroupTrailer functionalGroupTrailer) {
		this.functionalGroupTrailer = functionalGroupTrailer;
	}

	public InterchangeEnvelopeTrailer getInterChangeControlTrailer() {
		return interChangeControlTrailer;
	}

	public void setInterChangeControlTrailer(
			InterchangeEnvelopeTrailer interChangeControlTrailer) {
		this.interChangeControlTrailer = interChangeControlTrailer;
	}

}
