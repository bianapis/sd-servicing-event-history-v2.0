package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIssueRetrieveOutputModelIssueInstanceAnalysis
 */
public class BQIssueRetrieveOutputModelIssueInstanceAnalysis   {
  private Object issueInstanceAnalysisRecord = null;

  private String issueInstanceAnalysisReportType = null;

  private String issueInstanceAnalysisParameters = null;

  private Object issueInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return issueInstanceAnalysisRecord
  **/

  public Object getIssueInstanceAnalysisRecord() {
    return issueInstanceAnalysisRecord;
  }

  public void setIssueInstanceAnalysisRecord(Object issueInstanceAnalysisRecord) {
    this.issueInstanceAnalysisRecord = issueInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return issueInstanceAnalysisReportType
  **/

  public String getIssueInstanceAnalysisReportType() {
    return issueInstanceAnalysisReportType;
  }

  public void setIssueInstanceAnalysisReportType(String issueInstanceAnalysisReportType) {
    this.issueInstanceAnalysisReportType = issueInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return issueInstanceAnalysisParameters
  **/

  public String getIssueInstanceAnalysisParameters() {
    return issueInstanceAnalysisParameters;
  }

  public void setIssueInstanceAnalysisParameters(String issueInstanceAnalysisParameters) {
    this.issueInstanceAnalysisParameters = issueInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return issueInstanceAnalysisReport
  **/

  public Object getIssueInstanceAnalysisReport() {
    return issueInstanceAnalysisReport;
  }

  public void setIssueInstanceAnalysisReport(Object issueInstanceAnalysisReport) {
    this.issueInstanceAnalysisReport = issueInstanceAnalysisReport;
  }


}

