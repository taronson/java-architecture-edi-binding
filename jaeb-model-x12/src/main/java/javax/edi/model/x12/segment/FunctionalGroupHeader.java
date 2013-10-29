package javax.edi.model.x12.segment;

import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="GS")
public class FunctionalGroupHeader {
	
	@EDIElement(fieldName="GS01")
	@NotNull
	@Size(min = 2,max = 2)
	private String funcIdentifierCode;
	
	@EDIElement(fieldName="GS02")
	@NotNull
	@Size(min = 2,max = 15)
	private String appSenderCode;
	
	@EDIElement(fieldName="GS03")
	@NotNull
	@Size(min = 2,max = 15)
	private String appReceiverCode;
	
	@EDIElement(fieldName="GS04")
	@NotNull
	@Size(min = 8,max = 8)
	@EDIElementFormat("yyyyMMdd")
	private Date date;
	
	@EDIElement(fieldName="GS05")
	@NotNull
	@Size(min = 4,max = 8)
	private String time;
	
	@EDIElement(fieldName="GS06")
	@NotNull
	@Size(min = 1,max = 9)
	private String groupControlNumber;
	
	@EDIElement(fieldName="GS07")
	@NotNull
	@Size(min = 1,max = 2)
	private String responsibleAgencyCode;
	
	@EDIElement(fieldName="GS08")
	@NotNull
	@Size(min = 1,max = 12)
	private String industryIdentCode;

	public String getFuncIdentifierCode() {
		return funcIdentifierCode;
	}

	public void setFuncIdentifierCode(String funcIdentifierCode) {
		this.funcIdentifierCode = funcIdentifierCode;
	}

	public String getAppSenderCode() {
		return appSenderCode;
	}

	public void setAppSenderCode(String appSenderCode) {
		this.appSenderCode = appSenderCode;
	}

	public String getAppReceiverCode() {
		return appReceiverCode;
	}

	public void setAppReceiverCode(String appReceiverCode) {
		this.appReceiverCode = appReceiverCode;
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

	public String getGroupControlNumber() {
		return groupControlNumber;
	}

	public void setGroupControlNumber(String groupControlNumber) {
		this.groupControlNumber = groupControlNumber;
	}

	public String getResponsibleAgencyCode() {
		return responsibleAgencyCode;
	}

	public void setResponsibleAgencyCode(String responsibleAgencyCode) {
		this.responsibleAgencyCode = responsibleAgencyCode;
	}

	public String getIndustryIdentCode() {
		return industryIdentCode;
	}

	public void setIndustryIdentCode(String industryIdentCode) {
		this.industryIdentCode = industryIdentCode;
	}
	
}
	