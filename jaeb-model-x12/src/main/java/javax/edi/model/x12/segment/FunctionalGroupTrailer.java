package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="GE")
public class FunctionalGroupTrailer {
	
	@EDIElement(fieldName="GE01", dataElement="97")
	@NotNull
	@Size(min=1, max=6)
	private String numTransactionSets;
	
	@EDIElement(fieldName="GE02", dataElement="28")
	@NotNull
	@Size(min=1, max=9)
	private String groupControlNum;

}
