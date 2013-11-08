package javax.edi.model.x12.edi824;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.edi824.segment.ApplicationAdviceBody;
import javax.edi.model.x12.segment.GroupEnvelopeHeader;
import javax.edi.model.x12.segment.GroupEnvelopeTrailer;
import javax.edi.model.x12.segment.InterchangeEnvelopeHeader;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class ApplicationAdvice {
	
	@NotNull
	private InterchangeEnvelopeHeader envelopeHeader;
	
	@NotNull
	private GroupEnvelopeHeader groupEnvelopeHeader;
	
	@NotNull
	@Size(min=1)
	@EDICollectionType(ApplicationAdviceBody.class)
	private Collection<ApplicationAdviceBody> body;
	
	@NotNull
	private GroupEnvelopeTrailer groupEnvelopeTrailer;

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

	public Collection<ApplicationAdviceBody> getBody() {
		return body;
	}

	public void setBody(Collection<ApplicationAdviceBody> body) {
		this.body = body;
	}

	public GroupEnvelopeTrailer getGroupEnvelopeTrailer() {
		return groupEnvelopeTrailer;
	}

	public void setGroupEnvelopeTrailer(GroupEnvelopeTrailer groupEnvelopeTrailer) {
		this.groupEnvelopeTrailer = groupEnvelopeTrailer;
	}

	@Override
	public String toString() {
		return "ApplicationAdvice [envelopeHeader=" + envelopeHeader
				+ ", groupEnvelopeHeader=" + groupEnvelopeHeader + ", body="
				+ body + ", groupEnvelopeTrailer=" + groupEnvelopeTrailer + "]";
	}

}
