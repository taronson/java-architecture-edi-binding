package javax.edi.model.x12.edi816.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.AdditionalNameInformation;
import javax.edi.model.x12.segment.AddressInformation;
import javax.edi.model.x12.segment.DateTimeReference;
import javax.edi.model.x12.segment.GeographicLocation;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.PersonContact;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.edi.model.x12.segment.TransactionSetHeader;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Header {

	@NotNull
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	private OrgRelationshipsBeginningSegment beginningSegment;
	
	@EDICollectionType(DateTimeReference.class)
	@Size(min = 0, max = 10)
	private Collection<DateTimeReference> date;
	
	@EDICollectionType(ReferenceNumber.class)
	@Size(min = 0, max = 12)
	private Collection<ReferenceNumber> refNum1;
	
	@NotNull
	@Size(min = 1)
	@EDICollectionType(Name.class)
	private Collection<Name> name;  // Party Ident.
	
	@Size(min=0)
	@EDICollectionType(AdditionalNameInformation.class)
	private Collection<AdditionalNameInformation> addlName;
	
	//@Size(min=0, max=2)
	@Size(min=0)
	@EDICollectionType(AddressInformation.class)
	private Collection<AddressInformation> addrInfo;  // Party Location
	
	@EDICollectionType(GeographicLocation.class)
	@Size(min=0)
	private Collection<GeographicLocation> geoLocation;
	
	@EDICollectionType(PersonContact.class)
	@Size(min=0)
	private Collection<PersonContact> contact;  // Admin. Comm. Contact
	
	@Size(min=0)
	@EDICollectionType(ReferenceNumber.class)
	private Collection<ReferenceNumber> refNum;

	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}

	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}

	public OrgRelationshipsBeginningSegment getBeginningSegment() {
		return beginningSegment;
	}

	public void setBeginningSegment(
			OrgRelationshipsBeginningSegment beginningSegment) {
		this.beginningSegment = beginningSegment;
	}

	public Collection<DateTimeReference> getDate() {
		return date;
	}

	public void setDate(Collection<DateTimeReference> date) {
		this.date = date;
	}

	public Collection<ReferenceNumber> getRefNum1() {
		return refNum1;
	}

	public void setRefNum1(Collection<ReferenceNumber> refNum1) {
		this.refNum1 = refNum1;
	}

	public Collection<Name> getName() {
		return name;
	}

	public void setName(Collection<Name> name) {
		this.name = name;
	}

	public Collection<AdditionalNameInformation> getAddlName() {
		return addlName;
	}

	public void setAddlName(Collection<AdditionalNameInformation> addlName) {
		this.addlName = addlName;
	}

	public Collection<AddressInformation> getAddrInfo() {
		return addrInfo;
	}

	public void setAddrInfo(Collection<AddressInformation> addrInfo) {
		this.addrInfo = addrInfo;
	}

	public Collection<GeographicLocation> getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(Collection<GeographicLocation> geoLocation) {
		this.geoLocation = geoLocation;
	}

	public Collection<PersonContact> getContact() {
		return contact;
	}

	public void setContact(Collection<PersonContact> contact) {
		this.contact = contact;
	}

	public Collection<ReferenceNumber> getRefNum() {
		return refNum;
	}

	public void setRefNum(Collection<ReferenceNumber> refNum) {
		this.refNum = refNum;
	}

	@Override
	public String toString() {
		return "Header [transactionSetHeader=" + transactionSetHeader
				+ ", beginningSegment=" + beginningSegment + ", date=" + date
				+ ", refNum1=" + refNum1 + ", name=" + name + ", addlName="
				+ addlName + ", addrInfo=" + addrInfo + ", geoLocation="
				+ geoLocation + ", contact=" + contact + ", refNum=" + refNum
				+ "]";
	}
	
	
	
}
