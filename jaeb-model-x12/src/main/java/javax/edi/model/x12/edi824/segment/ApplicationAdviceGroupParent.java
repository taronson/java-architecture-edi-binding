package javax.edi.model.x12.edi824.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.edi816.segment.OrgRelationshipsIdentificationGroup;
import javax.edi.model.x12.segment.OriginalTransactionIdentification;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class ApplicationAdviceGroupParent {
	
	@NotNull
	private OriginalTransactionIdentification origTxnIdentification;
	
	@NotNull
    @Size(min = 0, max = 12)
    @EDICollectionType(ReferenceNumber.class)
	private Collection<ReferenceNumber> refIdentInvalidTxn;
	
	@NotNull
    @Size(min = 1)
    @EDICollectionType(ApplicationAdviceGroupChild.class)
	private Collection<ApplicationAdviceGroupChild> appAdviceChild;
	
	public OriginalTransactionIdentification getOrigTxnIdentification() {
		return origTxnIdentification;
	}

	public void setOrigTxnIdentification(
			OriginalTransactionIdentification origTxnIdentification) {
		this.origTxnIdentification = origTxnIdentification;
	}

	public Collection<ApplicationAdviceGroupChild> getAppAdviceChild() {
		return appAdviceChild;
	}

	public void setAppAdviceChild(
			Collection<ApplicationAdviceGroupChild> appAdviceChild) {
		this.appAdviceChild = appAdviceChild;
	}

	public Collection<ReferenceNumber> getRefIdentInvalidTxn() {
		return refIdentInvalidTxn;
	}

	public void setRefIdentInvalidTxn(Collection<ReferenceNumber> refIdentInvalidTxn) {
		this.refIdentInvalidTxn = refIdentInvalidTxn;
	}

}
