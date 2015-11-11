package nl.pa3bmg.perform.srtg.common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import nl.pa3bmg.perform.srtg.generated.inexport.Inexport;

public class JAXBInexport {
	private Unmarshaller unmarshaller = null;
	private Marshaller marshaller = null;
	private String instance = "nl.pa3bmg.perform.srtg.generated.inexport";
	private boolean Status =false;
	
	public JAXBInexport() {
		try {
			JAXBContext context = JAXBContext.newInstance(instance);
			unmarshaller = context.createUnmarshaller();
			marshaller = context.createMarshaller();
			Status =true;
		} catch (JAXBException e) {
			Status =false;
		}
	}
	
	public Inexport readImportXML(String fileName) {
		if (!Status) return null;
		Inexport inexport = null;
		try {
			File f = new File(fileName);
			inexport = (Inexport) unmarshaller.unmarshal(f);
		} catch (JAXBException e) {
			return null;
		}
		return inexport;
	}

	public boolean writeImportToXML(String fileName, Inexport inexport) {
		if (!Status) return false;
		try {
			FileWriter fw = new FileWriter(fileName);
			marshaller.marshal(inexport, fw);
			fw.close();
			return true;
		} catch (IOException e) {
			return false;
		} catch (JAXBException e) {
			return false;
		}
	}
	
	public String writeImportToString(Inexport inexport) {
		if (!Status) return null;
		try {
			StringWriter writer = new StringWriter();
			marshaller.marshal(inexport, writer);
			return writer.toString();
		} catch (JAXBException e) {
			return null;
		}
	}
}
