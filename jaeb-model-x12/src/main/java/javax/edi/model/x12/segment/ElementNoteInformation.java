package javax.edi.model.x12.segment;

import java.math.BigInteger;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag = "AK4")
public class ElementNoteInformation {

	@EDIElement(fieldName = "AK401", dataElement = "C030")
	@NotNull
	private BigInteger positionInSegment;

	@EDIElement(fieldName = "AK402", dataElement = "725")
	@Size(min = 1, max = 4)
	private BigInteger dataElementReferenceNumber;

	@EDIElement(fieldName = "AK403", dataElement = "723")
	@NotNull
	@Size(min = 1, max = 3)
	private BigInteger dataElementSyntaxErrorCode;

	@EDIElement(fieldName = "AK404", dataElement = "724")
	@Size(min = 1, max = 99)
	private String copyOfBadDataElement;

	@Override
	public String toString() {
		return "ElementNoteInformation []";
	}

	public BigInteger getPositionInSegment() {
		return positionInSegment;
	}

	public void setPositionInSegment(BigInteger positionInSegment) {
		this.positionInSegment = positionInSegment;
	}

	public BigInteger getDataElementReferenceNumber() {
		return dataElementReferenceNumber;
	}

	public void setDataElementReferenceNumber(
			BigInteger dataElementReferenceNumber) {
		this.dataElementReferenceNumber = dataElementReferenceNumber;
	}

	public BigInteger getDataElementSyntaxErrorCode() {
		return dataElementSyntaxErrorCode;
	}

	public void setDataElementSyntaxErrorCode(
			BigInteger dataElementSyntaxErrorCode) {
		this.dataElementSyntaxErrorCode = dataElementSyntaxErrorCode;
	}

	public String getCopyOfBadDataElement() {
		return copyOfBadDataElement;
	}

	public void setCopyOfBadDataElement(String copyOfBadDataElement) {
		this.copyOfBadDataElement = copyOfBadDataElement;
	}

}
