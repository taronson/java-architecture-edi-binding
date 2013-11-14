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
	@EDICollectionType(ApplicationAdviceGroupParent.class)
	private Collection<ApplicationAdviceGroupParent> appAdvice;

	public Collection<ApplicationAdviceGroupParent> getAppAdvice() {
		return appAdvice;
	}

	public void setAppAdvice(Collection<ApplicationAdviceGroupParent> appAdvice) {
		this.appAdvice = appAdvice;
	}

	

}
