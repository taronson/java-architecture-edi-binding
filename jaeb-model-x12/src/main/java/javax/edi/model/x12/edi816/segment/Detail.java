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

<<<<<<< HEAD
	public Collection<OrgRelationshipsGroup> getorgRel() {
		return orgRel;
	}

	public void setorgRel(
			Collection<OrgRelationshipsGroup> orgRel) {
		this.orgRel = orgRel;
	}

	
=======
	public Collection<OrgRelationshipsGroupParent> getOrgRel() {
		return orgRel;
	}

	public void setOrgRel(Collection<OrgRelationshipsGroupParent> orgRel) {
		this.orgRel = orgRel;
	}
	


>>>>>>> 82bf0b410ffadef60ba28960e9bcb18f9c50a158
}
