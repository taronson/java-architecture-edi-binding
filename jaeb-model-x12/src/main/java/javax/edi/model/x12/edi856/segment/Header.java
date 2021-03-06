package javax.edi.model.x12.edi856.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.TransactionSetHeader;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Header {

	@NotNull
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	private AdvanceShipmentNoticeBeginningSegment beginningSegment;

	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}

	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}

	public AdvanceShipmentNoticeBeginningSegment getBeginningSegment() {
		return beginningSegment;
	}

	public void setBeginningSegment(AdvanceShipmentNoticeBeginningSegment beginningSegment) {
		this.beginningSegment = beginningSegment;
	}
	
	
}
