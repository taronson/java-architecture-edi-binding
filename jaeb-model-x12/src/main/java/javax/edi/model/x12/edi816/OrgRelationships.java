package javax.edi.model.x12.edi816;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.edi816.segment.OrgRelationshipsBody;
import javax.edi.model.x12.segment.GroupEnvelopeHeader;
import javax.edi.model.x12.segment.GroupEnvelopeTrailer;
import javax.edi.model.x12.segment.InterchangeEnvelopeHeader;
import javax.edi.model.x12.segment.InterchangeEnvelopeTrailer;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDIMessage
public class OrgRelationships {

		@NotNull
		private InterchangeEnvelopeHeader envelopeHeader;
		
		@NotNull
		private GroupEnvelopeHeader groupEnvelopeHeader;
		
		@NotNull
		@Size(min=1)
		@EDICollectionType(OrgRelationshipsBody.class)
		private Collection<OrgRelationshipsBody> body;
		
		@NotNull
		private GroupEnvelopeTrailer groupEnvelopeTrailer;
		
		@NotNull
		private InterchangeEnvelopeTrailer envelopeTrailer;

		public InterchangeEnvelopeHeader getEnvelopeHeader() {
			return envelopeHeader;
		}

		public void setEnvelopeHeader(InterchangeEnvelopeHeader envelopeHeader) {
			this.envelopeHeader = envelopeHeader;
		}

		public GroupEnvelopeHeader getGroupEnvelopeHeader() {
			return groupEnvelopeHeader;
		}

		public void setGroupEnvelopeHeader(GroupEnvelopeHeader groupEnvelopeHeader) {
			this.groupEnvelopeHeader = groupEnvelopeHeader;
		}
   
		public Collection<OrgRelationshipsBody> getBody() {
			return body;
		}

		public void setBody(Collection<OrgRelationshipsBody> body) {
			this.body = body;
		}

		@Override
		public String toString() {
			return "OrgRelationships [body=" + body + "]";
		}

		
		public GroupEnvelopeTrailer getGroupEnvelopeTrailer() {
			return groupEnvelopeTrailer;
		}

		public void setGroupEnvelopeTrailer(GroupEnvelopeTrailer groupEnvelopeTrailer) {
			this.groupEnvelopeTrailer = groupEnvelopeTrailer;
		}

		public InterchangeEnvelopeTrailer getEnvelopeTrailer() {
			return envelopeTrailer;
		}

		public void setEnvelopeTrailer(InterchangeEnvelopeTrailer envelopeTrailer) {
			this.envelopeTrailer = envelopeTrailer;
		}

		
        
		

}
