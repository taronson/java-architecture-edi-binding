package javax.edi.model.x12.edi816.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="BHT")
public class OrgRelationshipsBeginningSegment {
	
	@EDIElement(fieldName="BH01",dataElement="1005")
	@NotNull
	@Size(min = 4, max = 4)
	private String hierStructureCode; 
	
	@EDIElement(fieldName="BHT02",dataElement="353")
	@NotNull
	@Size(min = 2, max = 2)
	private String transactionSetPurposeCode; 
	
	
	@EDIElement(fieldName="BHT03",dataElement="127")
	@Size(min = 1, max = 50)
	private String refIdentification;
	
	@EDIElement(fieldName="BHT04",dataElement="373")
	@Size(min = 8, max = 8)
	@EDIElementFormat("yyyyMMdd")
	private String date; 
	
	@EDIElement(fieldName="BHT05",dataElement="373")
	@Size(min = 4, max = 8)
	private String time; 
	
	@EDIElement(fieldName="BHT06",dataElement="640")
	@Size(min = 2, max = 2)
	private String transactionTypeCode;

	@Override
	public String toString() {
		return "OrgRelationshipsBeginningSegment [hierStructureCode="
				+ hierStructureCode + ", transactionSetPurposeCode="
				+ transactionSetPurposeCode + ", refIdentification="
				+ refIdentification + ", date=" + date + ", time=" + time
				+ ", transactionTypeCode=" + transactionTypeCode + "]";
	} 
}
