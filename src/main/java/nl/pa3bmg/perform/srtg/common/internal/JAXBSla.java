package nl.pa3bmg.perform.srtg.common.internal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import nl.pa3bmg.perform.srtg.generated.sla.RttMonCtrlAdmin;

public class JAXBSla {
	private Unmarshaller unmarshaller = null;
	private Marshaller marshaller = null;
	private String instance = "nl.pa3bmg.perform.srtg.generated.sla";
	private boolean Status =false;
	
	public JAXBSla() {
		try {
			JAXBContext context = JAXBContext.newInstance(instance);
			unmarshaller = context.createUnmarshaller();
			marshaller = context.createMarshaller();
			Status =true;
		} catch (JAXBException e) {
			Status =false;
		}
	}
	
	public RttMonCtrlAdmin readSlaXML(String fileName) {
		if (!Status) return null;
		RttMonCtrlAdmin info = null;
		try {
			File f = new File(fileName);
			info = (RttMonCtrlAdmin) unmarshaller.unmarshal(f);
		} catch (JAXBException e) {
			return null;
		}
		return info;
	}
	
	public boolean writeSlaToXML(String fileName, RttMonCtrlAdmin info) {
		if (!Status) return false;
		try {
			FileWriter fw = new FileWriter(fileName);
			marshaller.marshal(info, fw);
			fw.close();
			return true;
		} catch (IOException e) {
			return false;
		} catch (JAXBException e) {
			return false;
		}
	}
	
	public String writeSlaToString(RttMonCtrlAdmin info) {
		if (!Status) return null;
		try {
			StringWriter writer = new StringWriter();
			marshaller.marshal(info, writer);
			return writer.toString();
		} catch (JAXBException e) {
			return null;
		}
	}
}
