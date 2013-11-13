package javax.edi.model.x12.edi816.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Detail {
	
	@Size(min=1)
    @NotNull
    @EDICollectionType(OrgRelationshipsGroupParent.class)
    private Collection<OrgRelationshipsGroupParent> orgRel;

    public Collection<OrgRelationshipsGroupParent> getOrgRel() {
            return orgRel;
    }

    public void setOrgRel(Collection<OrgRelationshipsGroupParent> orgRel) {
            this.orgRel = orgRel;
    }
}
