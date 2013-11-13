package javax.edi.model.x12.edi816.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.ActionIndicator;
import javax.edi.model.x12.segment.AdditionalNameInformation;
import javax.edi.model.x12.segment.AddressInformation;
import javax.edi.model.x12.segment.DateTimeReference;
import javax.edi.model.x12.segment.GeographicLocation;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.PersonContact;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class OrgRelationshipsIdentificationGroup {
        @NotNull
        private Name name; // Party Ident.
        
        private AdditionalNameInformation addlName;
        
        private AddressInformation addrInfo; // Party Location
        
        private GeographicLocation geoLocation;
        
        private PersonContact contact; // Admin. Comm. Contact
        
        private ReferenceNumber refNum1;
        
        private ReferenceNumber refNum2;
        
        private DateTimeReference date;
        
        private ActionIndicator actionIndicator;

        public Name getName() {
                return name;
        }

        public void setName(Name name) {
                this.name = name;
        }

        public AdditionalNameInformation getAddlName() {
                return addlName;
        }

        public void setAddlName(AdditionalNameInformation addlName) {
                this.addlName = addlName;
        }

        public AddressInformation getAddrInfo() {
                return addrInfo;
        }

        public void setAddrInfo(AddressInformation addrInfo) {
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

        public ReferenceNumber getRefNum1() {
                return refNum1;
        }

        public void setRefNum1(ReferenceNumber refNum1) {
                this.refNum1 = refNum1;
        }

        public ReferenceNumber getRefNum2() {
                return refNum2;
        }

        public void setRefNum2(ReferenceNumber refNum2) {
                this.refNum2 = refNum2;
        }

        public DateTimeReference getDate() {
                return date;
        }

        public void setDate(DateTimeReference date) {
                this.date = date;
        }

        public ActionIndicator getActionIndicator() {
                return actionIndicator;
        }

        public void setActionIndicator(ActionIndicator actionIndicator) {
                this.actionIndicator = actionIndicator;
        }
        
        
        
}

    
