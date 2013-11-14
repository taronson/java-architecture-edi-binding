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
public class ApplicationAdviceGroupChild {
	
	@NotNull
	private TechnicalErrorDescription techErrorDescription;
	
	@NotNull
    @Size(min = 1, max = 100)
    @EDICollectionType(NoteSpecialInstructions.class)
	private Collection<NoteSpecialInstructions> noteSpecialInstructions;

	public TechnicalErrorDescription getTechErrorDescription() {
		return techErrorDescription;
	}

	public void setTechErrorDescription(
			TechnicalErrorDescription techErrorDescription) {
		this.techErrorDescription = techErrorDescription;
	}

	public Collection<NoteSpecialInstructions> getNoteSpecialInstructions() {
		return noteSpecialInstructions;
	}

	public void setNoteSpecialInstructions(
			Collection<NoteSpecialInstructions> noteSpecialInstructions) {
		this.noteSpecialInstructions = noteSpecialInstructions;
	}

	
}
