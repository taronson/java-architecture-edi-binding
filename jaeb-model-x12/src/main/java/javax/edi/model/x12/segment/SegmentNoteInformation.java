package javax.edi.model.x12.segment;

import java.math.BigInteger;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="AK3")
public class SegmentNoteInformation {
	
	@EDIElement(fieldName="AK301", dataElement="721")
	@NotNull
	@Size(min=2, max=3)
	private String segmentIDCode;
	
	
	@EDIElement(fieldName="AK302", dataElement="719")
	@NotNull
	@Size(min=1, max=6)
	private BigInteger segmentPositioninTransactionSet;
	
	@EDIElement(fieldName="AK303", dataElement="447")
	@Size(min=1, max=6)
	private String loopIdentifierCode;
	
	@EDIElement(fieldName="AK304", dataElement="720")
	@Size(min=1, max=3)
	private BigInteger segmentSyntaxErrorCode;

	public String getSegmentIDCode() {
		return segmentIDCode;
	}

	public void setSegmentIDCode(String segmentIDCode) {
		this.segmentIDCode = segmentIDCode;
	}

	public BigInteger getSegmentPositioninTransactionSet() {
		return segmentPositioninTransactionSet;
	}

	public void setSegmentPositioninTransactionSet(
			BigInteger segmentPositioninTransactionSet) {
		this.segmentPositioninTransactionSet = segmentPositioninTransactionSet;
	}

	public String getLoopIdentifierCode() {
		return loopIdentifierCode;
	}

	public void setLoopIdentifierCode(String loopIdentifierCode) {
		this.loopIdentifierCode = loopIdentifierCode;
	}

	public BigInteger getSegmentSyntaxErrorCode() {
		return segmentSyntaxErrorCode;
	}

	public void setSegmentSyntaxErrorCode(BigInteger segmentSyntaxErrorCode) {
		this.segmentSyntaxErrorCode = segmentSyntaxErrorCode;
	}




	
}
