package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="REF")
public class ReferenceIdentificationInvalidTxn {

	@EDIElement(fieldName="REF01",dataElement="128")
	@NotNull
	@Size(min=2,max=3)
	private String referenceIdentificationQualifier;
	
	@EDIElement(fieldName="REF02",dataElement="127")
	@Size(min=1,max=30)
	private String referenceIdentification;
	
	@EDIElement(fieldName="REF03",dataElement="352")
	@Size(min=3,max=3)
	private String description;
}
