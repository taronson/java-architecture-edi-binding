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
	
	@NotNull
	private Name name;  // Party Ident.
	
	@EDICollectionType(AddressInformation.class)
	@Size(min = 0, max = 2)
	private Collection<AddressInformation> addrInfo;  // Party Location
	
	private GeographicLocation geoLocation;
	
	@EDICollectionType(PersonContact.class)
	@Size(min = 0, max = 3)
	private Collection<PersonContact> contact;  // Admin. Comm. Contact
	
	@EDICollectionType(DateTimeReference.class)
	@Size(min = 0, max = 10)
	private Collection<DateTimeReference> date;
	
	@EDICollectionType(AdditionalNameInformation.class)
	@Size(min = 0, max = 2)
	private Collection<AdditionalNameInformation >addlName;
	
	@EDICollectionType(ReferenceNumber.class)
	@Size(min = 1, max = 12)
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

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Collection<AddressInformation> getAddrInfo() {
		return addrInfo;
	}

	public void setAddrInfo(Collection<AddressInformation> addrInfo) {
		this.addrInfo = addrInfo;
	}

	public GeographicLocation getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(GeographicLocation geoLocation) {
		this.geoLocation = geoLocation;
	}

	public Collection<PersonContact> getContact() {
		return contact;
	}

	public void setContact(Collection<PersonContact> contact) {
		this.contact = contact;
	}

	public Collection<DateTimeReference> getDate() {
		return date;
	}

	public void setDate(Collection<DateTimeReference> date) {
		this.date = date;
	}

	public Collection<AdditionalNameInformation> getAddlName() {
		return addlName;
	}

	public void setAddlName(Collection<AdditionalNameInformation> addlName) {
		this.addlName = addlName;
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
				+ ", beginningSegment=" + beginningSegment + ", name=" + name
				+ ", addrInfo=" + addrInfo + ", geoLocation=" + geoLocation
				+ ", contact=" + contact + ", date=" + date + ", addlName="
				+ addlName + ", refNum=" + refNum + "]";
	}
	
	
}
