package nl.pa3bmg.perform.srtg.common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import nl.pa3bmg.perform.srtg.generated.reporter.Reporter;

public class JAXBReporter {
	private Unmarshaller unmarshaller = null;
	private Marshaller marshaller = null;
	private String instance = "nl.pa3bmg.perform.srtg.generated.reporter";
	private boolean Status =false;
	
	public JAXBReporter() {
		try {
			JAXBContext context = JAXBContext.newInstance(instance);
			unmarshaller = context.createUnmarshaller();
			marshaller = context.createMarshaller();
			Status =true;
		} catch (JAXBException e) {
			Status =false;
		}
	}
	
	public Reporter readReporterXML(String fileName) {
		if (!Status) return null;
		Reporter reporter = null;
		try {
			File f = new File(fileName);
			reporter = (Reporter) unmarshaller.unmarshal(f);
		} catch (JAXBException e) {
			return null;
		}
		return reporter;
	}

	public boolean writeReporterToXML(String fileName, Reporter reporter) {
		if (!Status) return false;
		try {
			FileWriter fw = new FileWriter(fileName);
			marshaller.marshal(reporter, fw);
			fw.close();
			return true;
		} catch (IOException e) {
			return false;
		} catch (JAXBException e) {
			return false;
		}
	}
	
	public String writeReporterToString(Reporter reporter) {
		if (!Status) return null;
		try {
			StringWriter writer = new StringWriter();
			marshaller.marshal(reporter, writer);
			return writer.toString();
		} catch (JAXBException e) {
			return null;
		}
	}
}
