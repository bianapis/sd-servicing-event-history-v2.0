package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssueRetrieveInputModelIssueInstanceAnalysis;
import org.bian.dto.BQIssueRetrieveInputModelIssueInstanceReport;

import javax.validation.Valid;
  
/**
 * BQIssueRetrieveInputModel
 */
public class BQIssueRetrieveInputModel   {
  private Object issueRetrieveActionTaskRecord = null;

  private String issueRetrieveActionRequest = null;

  private BQIssueRetrieveInputModelIssueInstanceReport issueInstanceReport = null;

  private BQIssueRetrieveInputModelIssueInstanceAnalysis issueInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return issueRetrieveActionTaskRecord
  **/

  public Object getIssueRetrieveActionTaskRecord() {
    return issueRetrieveActionTaskRecord;
  }

  public void setIssueRetrieveActionTaskRecord(Object issueRetrieveActionTaskRecord) {
    this.issueRetrieveActionTaskRecord = issueRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return issueRetrieveActionRequest
  **/

  public String getIssueRetrieveActionRequest() {
    return issueRetrieveActionRequest;
  }

  public void setIssueRetrieveActionRequest(String issueRetrieveActionRequest) {
    this.issueRetrieveActionRequest = issueRetrieveActionRequest;
  }


  /**
   * Get issueInstanceReport
   * @return issueInstanceReport
  **/

  public BQIssueRetrieveInputModelIssueInstanceReport getIssueInstanceReport() {
    return issueInstanceReport;
  }

  public void setIssueInstanceReport(BQIssueRetrieveInputModelIssueInstanceReport issueInstanceReport) {
    this.issueInstanceReport = issueInstanceReport;
  }


  /**
   * Get issueInstanceAnalysis
   * @return issueInstanceAnalysis
  **/

  public BQIssueRetrieveInputModelIssueInstanceAnalysis getIssueInstanceAnalysis() {
    return issueInstanceAnalysis;
  }

  public void setIssueInstanceAnalysis(BQIssueRetrieveInputModelIssueInstanceAnalysis issueInstanceAnalysis) {
    this.issueInstanceAnalysis = issueInstanceAnalysis;
  }


}

