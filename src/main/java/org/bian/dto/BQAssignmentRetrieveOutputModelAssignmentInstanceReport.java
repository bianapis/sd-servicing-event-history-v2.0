package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssignmentRetrieveOutputModelAssignmentInstanceReport
 */
public class BQAssignmentRetrieveOutputModelAssignmentInstanceReport   {
  private Object assignmentInstanceReportRecord = null;

  private String assignmentInstanceReportType = null;

  private String assignmentInstanceReportParameters = null;

  private Object assignmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return assignmentInstanceReportRecord
  **/

  public Object getAssignmentInstanceReportRecord() {
    return assignmentInstanceReportRecord;
  }

  public void setAssignmentInstanceReportRecord(Object assignmentInstanceReportRecord) {
    this.assignmentInstanceReportRecord = assignmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return assignmentInstanceReportType
  **/

  public String getAssignmentInstanceReportType() {
    return assignmentInstanceReportType;
  }

  public void setAssignmentInstanceReportType(String assignmentInstanceReportType) {
    this.assignmentInstanceReportType = assignmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return assignmentInstanceReportParameters
  **/

  public String getAssignmentInstanceReportParameters() {
    return assignmentInstanceReportParameters;
  }

  public void setAssignmentInstanceReportParameters(String assignmentInstanceReportParameters) {
    this.assignmentInstanceReportParameters = assignmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return assignmentInstanceReport
  **/

  public Object getAssignmentInstanceReport() {
    return assignmentInstanceReport;
  }

  public void setAssignmentInstanceReport(Object assignmentInstanceReport) {
    this.assignmentInstanceReport = assignmentInstanceReport;
  }


}

