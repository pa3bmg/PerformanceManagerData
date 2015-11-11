package nl.pa3bmg.perform.srtg.common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import nl.pa3bmg.perform.srtg.generated.report.Report;

public class JAXBReport {
	private Unmarshaller unmarshaller = null;
	private Marshaller marshaller = null;
	private String instance = "nl.pa3bmg.perform.srtg.generated.report";
	private boolean Status =false;
	
	public JAXBReport() {
		try {
			JAXBContext context = JAXBContext.newInstance(instance);
			unmarshaller = context.createUnmarshaller();
			marshaller = context.createMarshaller();
			Status =true;
		} catch (JAXBException e) {
			Status =false;
		}
	}
	
	public Report readReportXML(String fileName) {
		if (!Status) return null;
		Report report = null;
		try {
			File f = new File(fileName);
			report = (Report) unmarshaller.unmarshal(f);
		} catch (JAXBException e) {
			return null;
		}
		return report;
	}
	
	public boolean writeReportToXML(String fileName, Report report) {
		if (!Status) return false;
		try {
			FileWriter fw = new FileWriter(fileName);
			marshaller.marshal(report, fw);
			fw.close();
			return true;
		} catch (IOException e) {
			return false;
		} catch (JAXBException e) {
			return false;
		}
	}
	
	public String writeReportToString(Report report) {
		if (!Status) return null;
		try {
			StringWriter writer = new StringWriter();
			marshaller.marshal(report, writer);
			return writer.toString();
		} catch (JAXBException e) {
			return null;
		}
	}
}
