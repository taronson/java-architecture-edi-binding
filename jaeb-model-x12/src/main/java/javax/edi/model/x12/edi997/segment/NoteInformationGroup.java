package javax.edi.model.x12.edi997.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.ElementNoteInformation;
import javax.edi.model.x12.segment.SegmentNoteInformation;

@EDISegmentGroup
public class NoteInformationGroup {

	private SegmentNoteInformation segmentNoteInformation;
	private ElementNoteInformation elementNoteInformation;
	
	public SegmentNoteInformation getSegmentNoteInformation() {
		return segmentNoteInformation;
	}
	public void setSegmentNoteInformation(
			SegmentNoteInformation segmentNoteInformation) {
		this.segmentNoteInformation = segmentNoteInformation;
	}
	public ElementNoteInformation getElementNoteInformation() {
		return elementNoteInformation;
	}
	public void setElementNoteInformation(
			ElementNoteInformation elementNoteInformation) {
		this.elementNoteInformation = elementNoteInformation;
	}
}
