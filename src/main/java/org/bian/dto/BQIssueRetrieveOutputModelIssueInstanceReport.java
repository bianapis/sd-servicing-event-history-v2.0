package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIssueRetrieveOutputModelIssueInstanceReport
 */
public class BQIssueRetrieveOutputModelIssueInstanceReport   {
  private Object issueInstanceReportRecord = null;

  private String issueInstanceReportType = null;

  private String issueInstanceReportParameters = null;

  private Object issueInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return issueInstanceReportRecord
  **/

  public Object getIssueInstanceReportRecord() {
    return issueInstanceReportRecord;
  }

  public void setIssueInstanceReportRecord(Object issueInstanceReportRecord) {
    this.issueInstanceReportRecord = issueInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return issueInstanceReportType
  **/

  public String getIssueInstanceReportType() {
    return issueInstanceReportType;
  }

  public void setIssueInstanceReportType(String issueInstanceReportType) {
    this.issueInstanceReportType = issueInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return issueInstanceReportParameters
  **/

  public String getIssueInstanceReportParameters() {
    return issueInstanceReportParameters;
  }

  public void setIssueInstanceReportParameters(String issueInstanceReportParameters) {
    this.issueInstanceReportParameters = issueInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return issueInstanceReport
  **/

  public Object getIssueInstanceReport() {
    return issueInstanceReport;
  }

  public void setIssueInstanceReport(Object issueInstanceReport) {
    this.issueInstanceReport = issueInstanceReport;
  }


}

