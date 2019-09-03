package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssignmentRetrieveOutputModelAssignmentInstanceAnalysis
 */
public class BQAssignmentRetrieveOutputModelAssignmentInstanceAnalysis   {
  private Object assignmentInstanceAnalysisRecord = null;

  private String assignmentInstanceAnalysisReportType = null;

  private String assignmentInstanceAnalysisParameters = null;

  private Object assignmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return assignmentInstanceAnalysisRecord
  **/

  public Object getAssignmentInstanceAnalysisRecord() {
    return assignmentInstanceAnalysisRecord;
  }

  public void setAssignmentInstanceAnalysisRecord(Object assignmentInstanceAnalysisRecord) {
    this.assignmentInstanceAnalysisRecord = assignmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return assignmentInstanceAnalysisReportType
  **/

  public String getAssignmentInstanceAnalysisReportType() {
    return assignmentInstanceAnalysisReportType;
  }

  public void setAssignmentInstanceAnalysisReportType(String assignmentInstanceAnalysisReportType) {
    this.assignmentInstanceAnalysisReportType = assignmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return assignmentInstanceAnalysisParameters
  **/

  public String getAssignmentInstanceAnalysisParameters() {
    return assignmentInstanceAnalysisParameters;
  }

  public void setAssignmentInstanceAnalysisParameters(String assignmentInstanceAnalysisParameters) {
    this.assignmentInstanceAnalysisParameters = assignmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return assignmentInstanceAnalysisReport
  **/

  public Object getAssignmentInstanceAnalysisReport() {
    return assignmentInstanceAnalysisReport;
  }

  public void setAssignmentInstanceAnalysisReport(Object assignmentInstanceAnalysisReport) {
    this.assignmentInstanceAnalysisReport = assignmentInstanceAnalysisReport;
  }


}

