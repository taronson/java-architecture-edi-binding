package javax.edi.model.x12.edi997.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;

@EDISegmentGroup
public class Detail {

	@EDICollectionType(TransactionResponseGroup.class)
	Collection<TransactionResponseGroup> transactionResponseGroup;

	public Collection<TransactionResponseGroup> getTransactionResponseGroup() {
		return transactionResponseGroup;
	}

	public void setTransactionResponseGroup(
			Collection<TransactionResponseGroup> transactionResponseGroup) {
		this.transactionResponseGroup = transactionResponseGroup;
	}
	
	
}
