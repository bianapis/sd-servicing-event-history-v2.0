package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssignmentCaptureOutputModel
 */
public class BQAssignmentCaptureOutputModel   {
  private String assignmentCaptureActionTaskReference = null;

  private Object assignmentCaptureActionTaskRecord = null;

  private String assignmentCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Assignment instance capture service call 
   * @return assignmentCaptureActionTaskReference
  **/

  public String getAssignmentCaptureActionTaskReference() {
    return assignmentCaptureActionTaskReference;
  }

  public void setAssignmentCaptureActionTaskReference(String assignmentCaptureActionTaskReference) {
    this.assignmentCaptureActionTaskReference = assignmentCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Assignment structured input transaction/record 
   * @return assignmentCaptureRecordReference
  **/

  public String getAssignmentCaptureRecordReference() {
    return assignmentCaptureRecordReference;
  }

  public void setAssignmentCaptureRecordReference(String assignmentCaptureRecordReference) {
    this.assignmentCaptureRecordReference = assignmentCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

