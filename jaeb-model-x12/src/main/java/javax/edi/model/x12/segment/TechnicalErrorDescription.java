package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag = "TED")
public class TechnicalErrorDescription {
	
	@EDIElement(fieldName="TED01", dataElement="647")
	@NotNull
	@Size(min=1, max=3)
	private String appErrorConditionCode;
	
	@EDIElement(fieldName="TED02", dataElement="3")
	@NotNull
	@Size(min=1, max=4)
	private String freeFormMessage;

	public String getAppErrorConditionCode() {
		return appErrorConditionCode;
	}

	public void setAppErrorConditionCode(String appErrorConditionCode) {
		this.appErrorConditionCode = appErrorConditionCode;
	}

	public String getFreeFormMessage() {
		return freeFormMessage;
	}

	public void setFreeFormMessage(String freeFormMessage) {
		this.freeFormMessage = freeFormMessage;
	}
}
