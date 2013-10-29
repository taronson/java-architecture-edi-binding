package javax.edi.model.x12.edi816.segment;

import java.text.CollationElementIterator;
import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.AdditionalNameInformation;
import javax.edi.model.x12.segment.AddressInformation;
import javax.edi.model.x12.segment.DateTimeReference;
import javax.edi.model.x12.segment.GeographicLocation;
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.PersonContact;
import javax.edi.model.x12.segment.Quantity;
import javax.edi.model.x12.segment.ReferenceIdentificationInvalidTxn;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class OrgRelationshipsGroup {
	
	private Name name;  // Party Ident.
	
	@Size(max = 2)
	@EDICollectionType(AddressInformation.class)
	private Collection<AddressInformation> addrInfo;  // Party Location
	
	private GeographicLocation geoLocation;
	private PersonContact contact;  // Admin. Comm. Contact
	
	@Size(max = 10)
	@EDICollectionType(DateTimeReference.class)
	private Collection<DateTimeReference> date;
	
	private HierarchicalLevel level;
	
	@Size(max = 2)
	@EDICollectionType(AdditionalNameInformation.class)
	private Collection<AdditionalNameInformation> addlName;
	
	private Quantity quantity;
	
	@Size(max = 12)
	@EDICollectionType(ReferenceNumber.class)
	private Collection<ReferenceNumber> refNum;
	
	private ActionIndicator actionInd;
	
	public Collection<ReferenceNumber> getRefNum() {
		return refNum;
	}
	public void setRefNum(Collection<ReferenceNumber> refNum) {
		this.refNum = refNum;
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
	public PersonContact getContact() {
		return contact;
	}
	public void setContact(PersonContact contact) {
		this.contact = contact;
	}
	public Collection<DateTimeReference> getDate() {
		return date;
	}
	public void setDate(Collection<DateTimeReference> date) {
		this.date = date;
	}
	public HierarchicalLevel getLevel() {
		return level;
	}
	public void setLevel(HierarchicalLevel level) {
		this.level = level;
	}
	public Collection<AdditionalNameInformation> getAddlName() {
		return addlName;
	}
	public void setAddlName(Collection<AdditionalNameInformation> addlName) {
		this.addlName = addlName;
	}
	public Quantity getQuantity() {
		return quantity;
	}
	public void setQuantity(Quantity quantity) {
		this.quantity = quantity;
	}
	public ActionIndicator getActionInd() {
		return actionInd;
	}
	public void setActionInd(ActionIndicator actionInd) {
		this.actionInd = actionInd;
	}
	

}
