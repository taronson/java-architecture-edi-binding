package javax.edi.model.x12.edi824.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.NoteSpecialInstructions;
import javax.edi.model.x12.segment.OriginalTransactionIdentification;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.edi.model.x12.segment.TechnicalErrorDescription;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class ApplicationAdviceGroup {
	
	@NotNull
	private OriginalTransactionIdentification origTxnIdentification;
	
	@Size(min = 0, max = 12)
	@EDICollectionType(ReferenceNumber.class)
	private Collection<ReferenceNumber> refIdentInvalidTxn;
	
	private TechnicalErrorDescription techErrorDescription;
	
	@Size(min = 0, max = 100)
	@EDICollectionType(NoteSpecialInstructions.class)
	private NoteSpecialInstructions noteSpecialInstructions;

	public OriginalTransactionIdentification getOrigTxnIdentification() {
		return origTxnIdentification;
	}

	public void setOrigTxnIdentification(
			OriginalTransactionIdentification origTxnIdentification) {
		this.origTxnIdentification = origTxnIdentification;
	}

	public Collection<ReferenceNumber> getRefIdentInvalidTxn() {
		return refIdentInvalidTxn;
	}

	public void setRefIdentInvalidTxn(
			Collection<ReferenceNumber> refIdentInvalidTxn) {
		this.refIdentInvalidTxn = refIdentInvalidTxn;
	}

	public TechnicalErrorDescription getTechErrorDescription() {
		return techErrorDescription;
	}

	public void setTechErrorDescription(
			TechnicalErrorDescription techErrorDescription) {
		this.techErrorDescription = techErrorDescription;
	}

	public NoteSpecialInstructions getNoteSpecialInstructions() {
		return noteSpecialInstructions;
	}

	public void setNoteSpecialInstructions(
			NoteSpecialInstructions noteSpecialInstructions) {
		this.noteSpecialInstructions = noteSpecialInstructions;
	}

}
