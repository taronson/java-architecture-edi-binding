package javax.edi.model.x12.edi856.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.edi.model.x12.segment.PurchaseOrderReference;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class OrderInformationGroup {

	@NotNull
	private HierarchicalLevel purchaseOrderReferenceHeader;
	private PurchaseOrderReference purchaseOrderReference;
	private ReferenceNumber referenceNumber1;
	
	@EDICollectionType(PackageCartonGroup.class)
	private Collection<PackageCartonGroup> packageCartonGroup;
	
	

	public HierarchicalLevel getPurchaseOrderReferenceHeader() {
		return purchaseOrderReferenceHeader;
	}

	public void setPurchaseOrderReferenceHeader(
			HierarchicalLevel purchaseOrderReferenceHeader) {
		this.purchaseOrderReferenceHeader = purchaseOrderReferenceHeader;
	}

	public PurchaseOrderReference getPurchaseOrderReference() {
		return purchaseOrderReference;
	}

	public void setPurchaseOrderReference(
			PurchaseOrderReference purchaseOrderReference) {
		this.purchaseOrderReference = purchaseOrderReference;
	}

	public Collection<PackageCartonGroup> getPackageCartonGroup() {
		return packageCartonGroup;
	}

	public void setPackageCartonGroup(
			Collection<PackageCartonGroup> packageCartonGroup) {
		this.packageCartonGroup = packageCartonGroup;
	}

	public ReferenceNumber getReferenceNumber1() {
		return referenceNumber1;
	}

	public void setReferenceNumber1(ReferenceNumber referenceNumber1) {
		this.referenceNumber1 = referenceNumber1;
	}

	
	
	
}
