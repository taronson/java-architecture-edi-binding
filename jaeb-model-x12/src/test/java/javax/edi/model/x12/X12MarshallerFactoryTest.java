package javax.edi.model.x12;

import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.Iterator;

import javax.edi.bind.EDIMarshaller;
import javax.edi.bind.EDIUnmarshaller;
import javax.edi.bind.util.ReflectiveToStringStyle;
import javax.edi.model.x12.X12MarshallerFactory;
import javax.edi.model.x12.edi810.Invoice;
import javax.edi.model.x12.edi816.OrgRelationships;
import javax.edi.model.x12.edi816.segment.OrgRelationshipsBody;
import javax.edi.model.x12.edi816.segment.OrgRelationshipsGroupParent;
import javax.edi.model.x12.edi832.PriceSalesCatalog;
import javax.edi.model.x12.edi846.InventoryInquery;
import javax.edi.model.x12.edi850.PurchaseOrder;
import javax.edi.model.x12.edi855.POAcknowledgement;
import javax.edi.model.x12.edi856.AdvanceShipmentNotice;



import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class X12MarshallerFactoryTest {

	private static final Logger LOG = LoggerFactory.getLogger(X12MarshallerFactoryTest.class);
	
	
	
	public void testX12MarshallerFactory() throws Exception {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("x8104010.txt"));
		X12MarshallerFactory.EDIMarshaller(isr);
	}
	
	@Ignore
	@Test
	public void testReadEDI810() throws Exception {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("x8104010.txt"));
		Invoice edi= EDIUnmarshaller.unmarshal(Invoice.class, isr);
		
		LOG.debug(ReflectionToStringBuilder.toString(edi , new ReflectiveToStringStyle()));
		
		StringWriter sw = new StringWriter();
		EDIMarshaller.marshal(edi, sw);
		
		LOG.debug("Marshalled: "+sw.toString());
	}

	@Ignore
	@Test
	public void testReadEDI832() throws Exception {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("x8324010.txt"));
		PriceSalesCatalog edi= EDIUnmarshaller.unmarshal(PriceSalesCatalog.class, isr);
		
		LOG.debug(ReflectionToStringBuilder.toString(edi , new ReflectiveToStringStyle()));
		
		
		StringWriter sw = new StringWriter();
		EDIMarshaller.marshal(edi, sw);
		
		LOG.debug("Marshalled: "+sw.toString());
	}
	
	@Ignore
	@Test
	public void testReadEDI846() throws Exception {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("x8464010.txt"));
		InventoryInquery edi= EDIUnmarshaller.unmarshal(InventoryInquery.class, isr);
		
		LOG.debug(ReflectionToStringBuilder.toString(edi, new ReflectiveToStringStyle()));

		StringWriter sw = new StringWriter();
		EDIMarshaller.marshal(edi, sw);
		
		LOG.debug("Marshalled: "+sw.toString());
	}
	
	@Ignore
    @Test
    public void testReadEDI850() throws Exception {
            InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("x8504010_inbound_usps.txt"));
            PurchaseOrder edi= EDIUnmarshaller.unmarshal(PurchaseOrder.class, isr);
            
            LOG.debug(ReflectionToStringBuilder.toString(edi, new ReflectiveToStringStyle()));

            StringWriter sw = new StringWriter();
            EDIMarshaller.marshal(edi, sw);
            
            LOG.debug("Marshalled: "+sw.toString());
    }
	
	@Ignore
	@Test
	public void testReadEDI855() throws Exception {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("x8554010.txt"));
		POAcknowledgement edi= EDIUnmarshaller.unmarshal(POAcknowledgement.class, isr);
		
		LOG.debug(ReflectionToStringBuilder.toString(edi, new ReflectiveToStringStyle()));

		StringWriter sw = new StringWriter();
		EDIMarshaller.marshal(edi, sw);
		
		LOG.debug("Marshalled: "+sw.toString());
	}
	


	@Ignore
	@Test
	public void testReadEDI856() throws Exception {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("x8564010.txt"));
		AdvanceShipmentNotice edi = EDIUnmarshaller.unmarshal(AdvanceShipmentNotice.class, isr);
		
		LOG.debug(ReflectionToStringBuilder.toString(edi, new ReflectiveToStringStyle()));

		StringWriter sw = new StringWriter();
		EDIMarshaller.marshal(edi, sw);
		
		LOG.debug("Marshalled: "+sw.toString());
 	}
	
	@Test
	public void testReadEDI816() throws Exception {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("x8164010.txt"));
		OrgRelationships edi = EDIUnmarshaller.unmarshal(OrgRelationships.class, isr);
		
		for(OrgRelationshipsBody body : edi.getBody()) {
			Iterator<OrgRelationshipsGroupParent> it = body.getDetail().getOrgRel().iterator();
			Assert.assertEquals(2, it.next().getOrgRelChild().size());
			Assert.assertEquals(3, it.next().getOrgRelChild().size());
		}
		
		StringWriter sw = new StringWriter();
		EDIMarshaller.marshal(edi, sw);
		
		LOG.debug("Marshalled: "+sw.toString());
	}
}
