package javax.edi.model.x12.edi816.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.AdditionalNameInformation;
import javax.edi.model.x12.segment.AddressInformation;
import javax.edi.model.x12.segment.BaselineItemData;
import javax.edi.model.x12.segment.DateTimeReference;
import javax.edi.model.x12.segment.GeographicLocation;
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.PersonContact;
import javax.edi.model.x12.segment.Quantity;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.edi.model.x12.segment.TransactionSetTrailer;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class OrgRelationshipsGroup {
        
        @NotNull
        @Size(min = 1)
        @EDICollectionType(HierarchicalLevel.class)
        private Collection<HierarchicalLevel> level;
        
        @NotNull
        @Size(min = 1)
        @EDICollectionType(Name.class)
        private Collection<Name> name; // Party Ident.
        
        @Size(min = 0)
        @EDICollectionType(AdditionalNameInformation.class)
        private Collection<AdditionalNameInformation> addlName;
        
        //@Size(min=0, max=2)
        @Size(min=0)
        @EDICollectionType(AddressInformation.class)
        private Collection<AddressInformation> addrInfo; // Party Location
        
        @EDICollectionType(GeographicLocation.class)
        @Size(min=0)
        private Collection<GeographicLocation> geoLocation;
        
        @EDICollectionType(PersonContact.class)
        @Size(min=0)
        private Collection<PersonContact> contact; // Admin. Comm. Contact
        
        @Size(min=0)
        @EDICollectionType(ReferenceNumber.class)
        private Collection<ReferenceNumber> refNum;
        
        @EDICollectionType(Quantity.class)
        @Size(min=0)
        private Quantity quantity;
        
        //@Size(min=0, max=10)
        @Size(min=0)
        @EDICollectionType(DateTimeReference.class)
        private Collection<DateTimeReference> date;
        
        @EDICollectionType(BaselineItemData.class)
        @Size(min=0)
        private Collection<BaselineItemData> actionInd;
        
        @NotNull
        @Size(min = 1, max = 1)
        private TransactionSetTrailer transactionSetTrailer;

        public TransactionSetTrailer getTransactionSetTrailer() {
                return transactionSetTrailer;
        }

        public void setTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
                this.transactionSetTrailer = transactionSetTrailer;
        }
        
        public Collection<ReferenceNumber> getRefNum() {
                return refNum;
        }
        public void setRefNum(Collection<ReferenceNumber> refNum) {
                this.refNum = refNum;
        }
        public Collection<Name> getName() {
                return name;
        }
        public void setName(Collection<Name> name) {
                this.name = name;
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
        
        public Collection<DateTimeReference> getDate() {
                return date;
        }
        public void setDate(Collection<DateTimeReference> date) {
                this.date = date;
        }
        /*public Collection<HierarchicalLevel> getLevel() {
                return level;
        }
        public void setLevel(Collection<HierarchicalLevel> level) {
                this.level = level;
        }*/
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
        public Collection<BaselineItemData> getActionInd() {
                return actionInd;
        }
        public void setActionInd(Collection<BaselineItemData> actionInd) {
                this.actionInd = actionInd;
        }

        public Collection<PersonContact> getContact() {
                return contact;
        }

        public void setContact(Collection<PersonContact> contact) {
                this.contact = contact;
        }

        public Collection<HierarchicalLevel> getLevel() {
                return level;
        }

        public void setLevel(Collection<HierarchicalLevel> level) {
                this.level = level;
        }

        
}