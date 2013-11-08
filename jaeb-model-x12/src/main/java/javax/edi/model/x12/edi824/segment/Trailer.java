package javax.edi.model.x12.edi824.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.GroupEnvelopeTrailer;
import javax.edi.model.x12.segment.InterchangeEnvelopeTrailer;
import javax.edi.model.x12.segment.TransactionSetTrailer;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Trailer {
	
	@NotNull
	private TransactionSetTrailer transactionSetTrailer;
	
	@NotNull
	private GroupEnvelopeTrailer functionalGroupTrailer;
	
	@NotNull
	private InterchangeEnvelopeTrailer interChangeControlTrailer;

	public TransactionSetTrailer getTransactionSetTrailer() {
		return transactionSetTrailer;
	}

	public void setTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
		this.transactionSetTrailer = transactionSetTrailer;
	}

	public GroupEnvelopeTrailer getFunctionalGroupTrailer() {
		return functionalGroupTrailer;
	}

	public void setFunctionalGroupTrailer(
			GroupEnvelopeTrailer functionalGroupTrailer) {
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
