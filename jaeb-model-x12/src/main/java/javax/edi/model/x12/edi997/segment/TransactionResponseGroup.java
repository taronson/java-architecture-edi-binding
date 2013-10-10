package javax.edi.model.x12.edi997.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.TransactionSetResponseHeader;
import javax.edi.model.x12.segment.TransactionSetResponseTrailer;

@EDISegmentGroup
public class TransactionResponseGroup {
	private TransactionSetResponseHeader transactionSetResponseHeader;
	
	@EDICollectionType(NoteInformationGroup.class)
	private Collection<NoteInformationGroup> noteInformationGroup;
	
	private TransactionSetResponseTrailer transactionSetResponseTrailer;
	
	public TransactionSetResponseHeader getTransactionSetResponseHeader() {
		return transactionSetResponseHeader;
	}
	public void setTransactionSetResponseHeader(
			TransactionSetResponseHeader transactionSetResponseHeader) {
		this.transactionSetResponseHeader = transactionSetResponseHeader;
	}

	public TransactionSetResponseTrailer getTransactionSetResponseTrailer() {
		return transactionSetResponseTrailer;
	}
	public void setTransactionSetResponseTrailer(
			TransactionSetResponseTrailer transactionSetResponseTrailer) {
		this.transactionSetResponseTrailer = transactionSetResponseTrailer;
	}
	public Collection<NoteInformationGroup> getNoteInformationGroup() {
		return noteInformationGroup;
	}
	public void setNoteInformationGroup(Collection<NoteInformationGroup> noteInformationGroup) {
		this.noteInformationGroup = noteInformationGroup;
	}
}
