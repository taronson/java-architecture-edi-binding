package javax.edi.model.x12.edi816.segment;

import java.util.Collection;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class OrgRelationshipsGroupParent {
        
        @NotNull
        @Size(min = 1)
        private HierarchicalLevel level;
        
        @NotNull
        @Size(min = 1)
        @EDICollectionType(OrgRelationshipsIdentificationGroup.class)
        private Collection<OrgRelationshipsIdentificationGroup> orgRelationshipsIdentificationGroup;
        
        @Size(min=1)
        @NotNull
        @EDICollectionType(OrgRelationshipsGroupChild.class)
        private Collection<OrgRelationshipsGroupChild> orgRelChild;

        public HierarchicalLevel getLevel() {
                return level;
        }

        public void setLevel(HierarchicalLevel level) {
                this.level = level;
        }

        public Collection<OrgRelationshipsIdentificationGroup> getOrgRelationshipsIdentificationGroup() {
                return orgRelationshipsIdentificationGroup;
        }

        public void setOrgRelationshipsIdentificationGroup(
                        Collection<OrgRelationshipsIdentificationGroup> orgRelationshipsIdentificationGroup) {
                this.orgRelationshipsIdentificationGroup = orgRelationshipsIdentificationGroup;
        }

        public Collection<OrgRelationshipsGroupChild> getOrgRelChild() {
                return orgRelChild;
        }

        public void setOrgRelChild(Collection<OrgRelationshipsGroupChild> orgRelChild) {
                this.orgRelChild = orgRelChild;
        }



	
	
}
