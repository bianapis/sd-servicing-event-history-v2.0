package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentCaptureInputModelCaptureRecordType;
import org.bian.dto.BQSessionCaptureInputModelSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSessionCaptureInputModel
 */
public class BQSessionCaptureInputModel   {
  private String servicingEventLogInstanceReference = null;

  private String sessionInstanceReference = null;

  private BQSessionCaptureInputModelSessionInstanceRecord sessionInstanceRecord = null;

  private Object sessionCaptureActionTaskRecord = null;

  private BQAssignmentCaptureInputModelCaptureRecordType captureRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Session instance 
   * @return sessionInstanceReference
  **/

  public String getSessionInstanceReference() {
    return sessionInstanceReference;
  }

  public void setSessionInstanceReference(String sessionInstanceReference) {
    this.sessionInstanceReference = sessionInstanceReference;
  }


  /**
   * Get sessionInstanceRecord
   * @return sessionInstanceRecord
  **/

  public BQSessionCaptureInputModelSessionInstanceRecord getSessionInstanceRecord() {
    return sessionInstanceRecord;
  }

  public void setSessionInstanceRecord(BQSessionCaptureInputModelSessionInstanceRecord sessionInstanceRecord) {
    this.sessionInstanceRecord = sessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return sessionCaptureActionTaskRecord
  **/

  public Object getSessionCaptureActionTaskRecord() {
    return sessionCaptureActionTaskRecord;
  }

  public void setSessionCaptureActionTaskRecord(Object sessionCaptureActionTaskRecord) {
    this.sessionCaptureActionTaskRecord = sessionCaptureActionTaskRecord;
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

