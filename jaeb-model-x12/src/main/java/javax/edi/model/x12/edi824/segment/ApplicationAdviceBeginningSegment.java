package javax.edi.model.x12.edi824.segment;

import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="BGN")
public class ApplicationAdviceBeginningSegment {
	
	@EDIElement(fieldName="BGN01",dataElement="353")
	@NotNull
	@Size(min = 2, max = 2)
	private String txnSetPurposeCode;
	
	@EDIElement(fieldName="BGN02",dataElement="127")
	@NotNull
	@Size(min = 1, max = 30)
	private String referenceIdentCode; 
	
	@EDIElement(fieldName="BH03",dataElement="373")
	@NotNull
	@Size(min = 8, max = 8)
	@EDIElementFormat("yyyyMMdd")
	private Date date; 

	@EDIElement(fieldName="BH03",dataElement="337")
	@NotNull
	@Size(min = 4, max = 8)
	private String time;

	public String getTxnSetPurposeCode() {
		return txnSetPurposeCode;
	}

	public void setTxnSetPurposeCode(String txnSetPurposeCode) {
		this.txnSetPurposeCode = txnSetPurposeCode;
	}

	public String getReferenceIdentCode() {
		return referenceIdentCode;
	}

	public void setReferenceIdentCode(String referenceIdentCode) {
		this.referenceIdentCode = referenceIdentCode;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	} 

}
