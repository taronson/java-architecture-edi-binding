package javax.edi.model.x12.edi824.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Detail {
	
	@Size(min=1)
	@NotNull
	@EDICollectionType(ApplicationAdviceGroup.class)
	private Collection<ApplicationAdviceGroup> appAdvice;

	public Collection<ApplicationAdviceGroup> getAppAdvice() {
		return appAdvice;
	}

	public void setAppAdvice(Collection<ApplicationAdviceGroup> appAdvice) {
		this.appAdvice = appAdvice;
	}

	

}
