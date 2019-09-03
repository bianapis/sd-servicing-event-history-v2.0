package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentCaptureInputModelCaptureRecordType;
import org.bian.dto.BQIssueCaptureInputModelIssueInstanceRecord;
import org.bian.dto.BQIssueCaptureInputModelSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIssueCaptureInputModel
 */
public class BQIssueCaptureInputModel   {
  private BQIssueCaptureInputModelSessionInstanceRecord sessionInstanceRecord = null;

  private String servicingEventLogInstanceReference = null;

  private String issueInstanceReference = null;

  private BQIssueCaptureInputModelIssueInstanceRecord issueInstanceRecord = null;

  private Object issueCaptureActionTaskRecord = null;

  private BQAssignmentCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * Get sessionInstanceRecord
   * @return sessionInstanceRecord
  **/

  public BQIssueCaptureInputModelSessionInstanceRecord getSessionInstanceRecord() {
    return sessionInstanceRecord;
  }

  public void setSessionInstanceRecord(BQIssueCaptureInputModelSessionInstanceRecord sessionInstanceRecord) {
    this.sessionInstanceRecord = sessionInstanceRecord;
  }


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

  public BQIssueCaptureInputModelIssueInstanceRecord getIssueInstanceRecord() {
    return issueInstanceRecord;
  }

  public void setIssueInstanceRecord(BQIssueCaptureInputModelIssueInstanceRecord issueInstanceRecord) {
    this.issueInstanceRecord = issueInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return issueCaptureActionTaskRecord
  **/

  public Object getIssueCaptureActionTaskRecord() {
    return issueCaptureActionTaskRecord;
  }

  public void setIssueCaptureActionTaskRecord(Object issueCaptureActionTaskRecord) {
    this.issueCaptureActionTaskRecord = issueCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQAssignmentCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQAssignmentCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

