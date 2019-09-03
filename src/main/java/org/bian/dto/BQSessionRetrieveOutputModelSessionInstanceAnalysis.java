package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSessionRetrieveOutputModelSessionInstanceAnalysis
 */
public class BQSessionRetrieveOutputModelSessionInstanceAnalysis   {
  private Object sessionInstanceAnalysisRecord = null;

  private String sessionInstanceAnalysisReportType = null;

  private String sessionInstanceAnalysisParameters = null;

  private Object sessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return sessionInstanceAnalysisRecord
  **/

  public Object getSessionInstanceAnalysisRecord() {
    return sessionInstanceAnalysisRecord;
  }

  public void setSessionInstanceAnalysisRecord(Object sessionInstanceAnalysisRecord) {
    this.sessionInstanceAnalysisRecord = sessionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return sessionInstanceAnalysisReportType
  **/

  public String getSessionInstanceAnalysisReportType() {
    return sessionInstanceAnalysisReportType;
  }

  public void setSessionInstanceAnalysisReportType(String sessionInstanceAnalysisReportType) {
    this.sessionInstanceAnalysisReportType = sessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return sessionInstanceAnalysisParameters
  **/

  public String getSessionInstanceAnalysisParameters() {
    return sessionInstanceAnalysisParameters;
  }

  public void setSessionInstanceAnalysisParameters(String sessionInstanceAnalysisParameters) {
    this.sessionInstanceAnalysisParameters = sessionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return sessionInstanceAnalysisReport
  **/

  public Object getSessionInstanceAnalysisReport() {
    return sessionInstanceAnalysisReport;
  }

  public void setSessionInstanceAnalysisReport(Object sessionInstanceAnalysisReport) {
    this.sessionInstanceAnalysisReport = sessionInstanceAnalysisReport;
  }


}

