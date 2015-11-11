package nl.pa3bmg.perform.srtg.common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import nl.pa3bmg.perform.srtg.generated.rep.RrdGraphDef;

public class JAXBRrd {
	private Unmarshaller unmarshaller = null;
	private Marshaller marshaller = null;
	private String instance = "nl.pa3bmg.perform.srtg.generated.rep";
	private boolean Status =false;
	
	public JAXBRrd() {
		try {
			JAXBContext context = JAXBContext.newInstance(instance);
			unmarshaller = context.createUnmarshaller();
			marshaller = context.createMarshaller();
			Status =true;
		} catch (JAXBException e) {
			Status =false;
		}
	}
	
	public RrdGraphDef readRrdXML(String fileName) {
		if (!Status) return null;
		RrdGraphDef rep = null;
		try {
			File f = new File(fileName);
			rep = (RrdGraphDef) unmarshaller.unmarshal(f);
		} catch (JAXBException e) {
			return null;
		}
		return rep;
	}
	
	public boolean writeRrdToXML(String fileName, RrdGraphDef info) {
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
	
	public String writeRrdToString(RrdGraphDef info) {
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
