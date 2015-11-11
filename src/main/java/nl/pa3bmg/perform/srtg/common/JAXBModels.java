package nl.pa3bmg.perform.srtg.common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import nl.pa3bmg.perform.srtg.generated.models.Models;

public class JAXBModels {
	private Unmarshaller unmarshaller = null;
	private Marshaller marshaller = null;
	private String instance = "nl.pa3bmg.perform.srtg.generated.models";
	private boolean Status =false;
	
	public JAXBModels() {
		try {
			JAXBContext context = JAXBContext.newInstance(instance);
			unmarshaller = context.createUnmarshaller();
			marshaller = context.createMarshaller();
			Status =true;
		} catch (JAXBException e) {
			Status =false;
		}
	}
	
	public Models readModelsXML(String fileName) {
		if (!Status) return null;
		Models models = null;
		try {
			File f = new File(fileName);
			models = (Models) unmarshaller.unmarshal(f);
		} catch (JAXBException e) {
			return null;
		}
		return models;
	}
	
	public boolean writeModelsToXML(String fileName, Models models) {
		if (!Status) return false;
		try {
			FileWriter fw = new FileWriter(fileName);
			marshaller.marshal(models, fw);
			return true;
		} catch (IOException e) {
			return false;
		} catch (JAXBException e) {
			return false;
		}
	}
	
	public String writeModelsToString(Models models) {
		if (!Status) return null;
		try {
			StringWriter writer = new StringWriter();
			marshaller.marshal(models, writer);
			return writer.toString();
		} catch (JAXBException e) {
			return null;
		}
	}
}
