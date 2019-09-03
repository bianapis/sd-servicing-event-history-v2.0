package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentUpdateInputModelAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssignmentUpdateInputModel
 */
public class BQAssignmentUpdateInputModel   {
  private String servicingEventLogInstanceReference = null;

  private String assignmentInstanceReference = null;

  private BQAssignmentUpdateInputModelAssignmentInstanceRecord assignmentInstanceRecord = null;

  private Object assignmentUpdateActionTaskRecord = null;

  private String assignmentUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return assignmentUpdateActionTaskRecord
  **/

  public Object getAssignmentUpdateActionTaskRecord() {
    return assignmentUpdateActionTaskRecord;
  }

  public void setAssignmentUpdateActionTaskRecord(Object assignmentUpdateActionTaskRecord) {
    this.assignmentUpdateActionTaskRecord = assignmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return assignmentUpdateActionRequest
  **/

  public String getAssignmentUpdateActionRequest() {
    return assignmentUpdateActionRequest;
  }

  public void setAssignmentUpdateActionRequest(String assignmentUpdateActionRequest) {
    this.assignmentUpdateActionRequest = assignmentUpdateActionRequest;
  }


}

