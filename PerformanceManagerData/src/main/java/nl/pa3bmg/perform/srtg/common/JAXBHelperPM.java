package nl.pa3bmg.perform.srtg.common;

import java.net.URL;
import java.util.HashMap;

import nl.pa3bmg.perform.srtg.common.internal.JaxbImpl;

/*
 * (C) 2008 ... 2015 Ton Smink PA3BMG
 */

import nl.pa3bmg.perform.srtg.generated.inexport.Inexport;
import nl.pa3bmg.perform.srtg.generated.info.Info;
import nl.pa3bmg.perform.srtg.generated.models.Models;
import nl.pa3bmg.perform.srtg.generated.rep.RrdGraphDef;
import nl.pa3bmg.perform.srtg.generated.report.Report;
import nl.pa3bmg.perform.srtg.generated.reporter.Reporter;
import nl.pa3bmg.perform.srtg.generated.sla.RttMonCtrlAdmin;
import nl.pa3bmg.perform.srtg.generated.slogger.Slogger;

public class JAXBHelperPM {
  private final JaxbImpl<Inexport, ?> C_JAXB_INEXPORT = new JaxbImpl<>("nl.pa3bmg.perform.srtg.generated.inexport");

  private final JaxbImpl<Info, ?> C_JAXB_INFO = new JaxbImpl<>("nl.pa3bmg.perform.srtg.generated.info");

  private final static JaxbImpl<Models, ?> C_JAXB_MODELS = new JaxbImpl<>("nl.pa3bmg.perform.srtg.generated.models");

  private final JaxbImpl<Reporter, ?> C_JAXB_REPORTER = new JaxbImpl<>("nl.pa3bmg.perform.srtg.generated.reporter");

  private final static JaxbImpl<RrdGraphDef, String> C_JAXB_RRD_GRAPH_DEF = new JaxbImpl<>("nl.pa3bmg.perform.srtg.generated.rep", new HashMap<String, URL>() {
    private static final long serialVersionUID = 362498820777181265L;

    {
      put("SLA_html", JAXBHelperPM.class.getResource("/SLA_html.xml"));
      put("SLA_html1", JAXBHelperPM.class.getResource("/SLA_html1.xml"));
    }
  });

  private final JaxbImpl<RttMonCtrlAdmin, ?> C_JAXB_SLA = new JaxbImpl<>("nl.pa3bmg.perform.srtg.generated.sla");

  private final static JaxbImpl<Report, ?> C_JAXB_REPORT = new JaxbImpl<>("nl.pa3bmg.perform.srtg.generated.report", JAXBHelperPM.class.getResource("/report.xml"));

  private final static JaxbImpl<Slogger, ?> C_JAXB_SLOGGER = new JaxbImpl<>("nl.pa3bmg.perform.srtg.generated.slogger", JAXBHelperPM.class.getResource("/logger.xml"));

  //// C_JAXB_INEXPORT //////////////////////////////////////////////
  public Inexport readImportXML(String pFileName) {
    return C_JAXB_INEXPORT.readXml(pFileName);
  }

  public String writeImportToString(Inexport pInexport) {
    return C_JAXB_INEXPORT.writeToString(pInexport);
  }

  public boolean writeImportToXML(String pFileName, Inexport pInexport) {
    return C_JAXB_INEXPORT.writeToXml(pFileName, pInexport);
  }

  ////JAXBInfo //////////////////////////////////////////////
  public Info readInfoXML(String pFileName) {
    return C_JAXB_INFO.readXml(pFileName);
  }

  public String writeInfoToString(Info pInfo) {
    return C_JAXB_INFO.writeToString(pInfo);
  }

  public boolean writeInfoToXML(String pFileName, Info pInfo) {
    return C_JAXB_INFO.writeToXml(pFileName, pInfo);
  }

  ////JAXBModels //////////////////////////////////////////////
  public static Models readModelsXML(String pFileName) {
    return C_JAXB_MODELS.readXml(pFileName);
  }

  public static boolean writeModelsToXML(String pFileName, Models pModels) {
    return C_JAXB_MODELS.writeToXml(pFileName, pModels);
  }

  public static String writeModelsToString(Models pModels) {
    return C_JAXB_MODELS.writeToString(pModels);
  }

  ////JAXBReport //////////////////////////////////////////////
  public static Report readReportXML(String pFileName) {
    return C_JAXB_REPORT.readXml(pFileName);
  }

  public static boolean writeReportToXML(String pFileName, Report pReport) {
    return C_JAXB_REPORT.writeToXml(pFileName, pReport);
  }

  public static String writeReportToString(Report pReport) {
    return C_JAXB_REPORT.writeToString(pReport);
  }

  ////JAXBReporter //////////////////////////////////////////////
  public Reporter readReporterXML(String pFileName) {
    return C_JAXB_REPORTER.readXml(pFileName);
  }

  public boolean writeReporterToXML(String pFileName, Reporter pReporter) {
    return C_JAXB_REPORTER.writeToXml(pFileName, pReporter);
  }

  public String writeReporterToString(Reporter pReporter) {
    return C_JAXB_REPORTER.writeToString(pReporter);
  }

  ////JAXBSla //////////////////////////////////////////////
  public RttMonCtrlAdmin readSlaXML(String pFileName) {
    return C_JAXB_SLA.readXml(pFileName);
  }

  public boolean writeSlaToXML(String pFileName, RttMonCtrlAdmin pRttMonCtrlAdmin) {
    return C_JAXB_SLA.writeToXml(pFileName, pRttMonCtrlAdmin);
  }

  public String writeSlaToString(RttMonCtrlAdmin pRttMonCtrlAdmin) {
    return C_JAXB_SLA.writeToString(pRttMonCtrlAdmin);
  }

  ////JAXBSlogger //////////////////////////////////////////////
  public static Slogger readLoggerXML() {
    return C_JAXB_SLOGGER.readXml();
  }

  public static Slogger readLoggerXML(URL pUrl) {
    return C_JAXB_SLOGGER.readXml(pUrl);
  }

  public static Slogger readLoggerXML(String pFileName) {
    return C_JAXB_SLOGGER.readXml(pFileName);
  }

  public static boolean writeLoggerToXML(String pFileName, Slogger pSlogger) {
    return C_JAXB_SLOGGER.writeToXml(pFileName, pSlogger);
  }

  public static String writeLoggerToString(Slogger pSlogger) {
    return C_JAXB_SLOGGER.writeToString(pSlogger);
  }

  ////JAXBSlogger //////////////////////////////////////////////
  public static RrdGraphDef readRrdXML(String pFileName) {
    return C_JAXB_RRD_GRAPH_DEF.readXml(pFileName);
  }

  public static RrdGraphDef readRrdXmlForKey(String pKey) {
    return C_JAXB_RRD_GRAPH_DEF.readXmlForKey(pKey);
  }

  public static boolean writeRrdToXML(String pFileName, RrdGraphDef pRrdGraphDef) {
    return C_JAXB_RRD_GRAPH_DEF.writeToXml(pFileName, pRrdGraphDef);
  }

  public static String writeRrdToString(RrdGraphDef pRrdGraphDef) {
    return C_JAXB_RRD_GRAPH_DEF.writeToString(pRrdGraphDef);
  }
}
