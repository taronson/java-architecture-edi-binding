package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="ASI")
public class ActionIndicator {
	
	@EDIElement(fieldName="AS101", dataElement="306")
	@Size(min=0, max=1)
	private String actionCode;
	
	@EDIElement(fieldName="AS102", dataElement="875")
	@Size(min=0, max=1)
	private String maintTypeCode;
	
	@EDIElement(fieldName="AS103", dataElement="641")
	@Size(min=0, max=1)
	private String reasonCode;

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getMaintTypeCode() {
		return maintTypeCode;
	}

	public void setMaintTypeCode(String maintTypeCode) {
		this.maintTypeCode = maintTypeCode;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

}
