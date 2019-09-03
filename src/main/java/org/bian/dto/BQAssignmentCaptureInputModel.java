package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentCaptureInputModelCaptureRecordType;
import org.bian.dto.BQAssignmentUpdateInputModelAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssignmentCaptureInputModel
 */
public class BQAssignmentCaptureInputModel   {
  private String servicingEventLogInstanceReference = null;

  private String assignmentInstanceReference = null;

  private BQAssignmentUpdateInputModelAssignmentInstanceRecord assignmentInstanceRecord = null;

  private Object assignmentCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Assignment instance 
   * @return assignmentInstanceReference
  **/

  public String getAssignmentInstanceReference() {
    return assignmentInstanceReference;
  }

  public void setAssignmentInstanceReference(String assignmentInstanceReference) {
    this.assignmentInstanceReference = assignmentInstanceReference;
  }


  /**
   * Get assignmentInstanceRecord
   * @return assignmentInstanceRecord
  **/

  public BQAssignmentUpdateInputModelAssignmentInstanceRecord getAssignmentInstanceRecord() {
    return assignmentInstanceRecord;
  }

  public void setAssignmentInstanceRecord(BQAssignmentUpdateInputModelAssignmentInstanceRecord assignmentInstanceRecord) {
    this.assignmentInstanceRecord = assignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return assignmentCaptureActionTaskRecord
  **/

  public Object getAssignmentCaptureActionTaskRecord() {
    return assignmentCaptureActionTaskRecord;
  }

  public void setAssignmentCaptureActionTaskRecord(Object assignmentCaptureActionTaskRecord) {
    this.assignmentCaptureActionTaskRecord = assignmentCaptureActionTaskRecord;
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

