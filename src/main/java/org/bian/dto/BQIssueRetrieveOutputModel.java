package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssueRetrieveOutputModelIssueInstanceAnalysis;
import org.bian.dto.BQIssueRetrieveOutputModelIssueInstanceRecord;
import org.bian.dto.BQIssueRetrieveOutputModelIssueInstanceReport;

import javax.validation.Valid;
  
/**
 * BQIssueRetrieveOutputModel
 */
public class BQIssueRetrieveOutputModel   {
  private BQIssueRetrieveOutputModelIssueInstanceRecord issueInstanceRecord = null;

  private String issueRetrieveActionTaskReference = null;

  private Object issueRetrieveActionTaskRecord = null;

  private String issueRetrieveActionResponse = null;

  private BQIssueRetrieveOutputModelIssueInstanceReport issueInstanceReport = null;

  private BQIssueRetrieveOutputModelIssueInstanceAnalysis issueInstanceAnalysis = null;


  /**
   * Get issueInstanceRecord
   * @return issueInstanceRecord
  **/

  public BQIssueRetrieveOutputModelIssueInstanceRecord getIssueInstanceRecord() {
    return issueInstanceRecord;
  }

  public void setIssueInstanceRecord(BQIssueRetrieveOutputModelIssueInstanceRecord issueInstanceRecord) {
    this.issueInstanceRecord = issueInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Issue instance retrieve service call 
   * @return issueRetrieveActionTaskReference
  **/

  public String getIssueRetrieveActionTaskReference() {
    return issueRetrieveActionTaskReference;
  }

  public void setIssueRetrieveActionTaskReference(String issueRetrieveActionTaskReference) {
    this.issueRetrieveActionTaskReference = issueRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return issueRetrieveActionResponse
  **/

  public String getIssueRetrieveActionResponse() {
    return issueRetrieveActionResponse;
  }

  public void setIssueRetrieveActionResponse(String issueRetrieveActionResponse) {
    this.issueRetrieveActionResponse = issueRetrieveActionResponse;
  }


  /**
   * Get issueInstanceReport
   * @return issueInstanceReport
  **/

  public BQIssueRetrieveOutputModelIssueInstanceReport getIssueInstanceReport() {
    return issueInstanceReport;
  }

  public void setIssueInstanceReport(BQIssueRetrieveOutputModelIssueInstanceReport issueInstanceReport) {
    this.issueInstanceReport = issueInstanceReport;
  }


  /**
   * Get issueInstanceAnalysis
   * @return issueInstanceAnalysis
  **/

  public BQIssueRetrieveOutputModelIssueInstanceAnalysis getIssueInstanceAnalysis() {
    return issueInstanceAnalysis;
  }

  public void setIssueInstanceAnalysis(BQIssueRetrieveOutputModelIssueInstanceAnalysis issueInstanceAnalysis) {
    this.issueInstanceAnalysis = issueInstanceAnalysis;
  }


}

