package javax.edi.model.x12.edi824.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.edi824.segment.Detail;
import javax.edi.model.x12.edi824.segment.Header;
import javax.edi.model.x12.edi824.segment.Trailer;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class ApplicationAdviceBody {
	
	@NotNull
	private Header header;
	
	@NotNull
	private Detail detail;
	
	@NotNull
	private Trailer trailer;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Detail getDetail() {
		return detail;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}

	public Trailer getTrailer() {
		return trailer;
	}

	public void setTrailer(Trailer trailer) {
		this.trailer = trailer;
	}

	@Override
	public String toString() {
		return "ApplicationAdviceBody [header=" + header + ", detail=" + detail
				+ ", trailer=" + trailer + "]";
	}


}
