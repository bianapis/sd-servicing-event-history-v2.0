package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssueUpdateInputModelIssueInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIssueUpdateInputModel
 */
public class BQIssueUpdateInputModel   {
  private String servicingEventLogInstanceReference = null;

  private String issueInstanceReference = null;

  private BQIssueUpdateInputModelIssueInstanceRecord issueInstanceRecord = null;

  private Object issueUpdateActionTaskRecord = null;

  private String issueUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Servicing Event Log instance 
   * @return servicingEventLogInstanceReference
  **/

  public String getServicingEventLogInstanceReference() {
    return servicingEventLogInstanceReference;
  }

  public void setServicingEventLogInstanceReference(String servicingEventLogInstanceReference) {
    this.servicingEventLogInstanceReference = servicingEventLogInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issue instance 
   * @return issueInstanceReference
  **/

  public String getIssueInstanceReference() {
    return issueInstanceReference;
  }

  public void setIssueInstanceReference(String issueInstanceReference) {
    this.issueInstanceReference = issueInstanceReference;
  }


  /**
   * Get issueInstanceRecord
   * @return issueInstanceRecord
  **/

  public BQIssueUpdateInputModelIssueInstanceRecord getIssueInstanceRecord() {
    return issueInstanceRecord;
  }

  public void setIssueInstanceRecord(BQIssueUpdateInputModelIssueInstanceRecord issueInstanceRecord) {
    this.issueInstanceRecord = issueInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return issueUpdateActionTaskRecord
  **/

  public Object getIssueUpdateActionTaskRecord() {
    return issueUpdateActionTaskRecord;
  }

  public void setIssueUpdateActionTaskRecord(Object issueUpdateActionTaskRecord) {
    this.issueUpdateActionTaskRecord = issueUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return issueUpdateActionRequest
  **/

  public String getIssueUpdateActionRequest() {
    return issueUpdateActionRequest;
  }

  public void setIssueUpdateActionRequest(String issueUpdateActionRequest) {
    this.issueUpdateActionRequest = issueUpdateActionRequest;
  }


}

