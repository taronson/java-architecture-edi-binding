package javax.edi.model.x12.edi816.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.edi.model.x12.segment.TransactionSetTrailer;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Detail {
	
	@Size(min=1)
	@NotNull
	@EDICollectionType(OrgRelationshipsGroup.class)
	private Collection<OrgRelationshipsGroup> orgRel;

	public Collection<OrgRelationshipsGroup> getOrgRel() {
		return orgRel;
	}
	
	public void setOrgRel(Collection<OrgRelationshipsGroup> orgRel) {
		this.orgRel = orgRel;
	}
}
