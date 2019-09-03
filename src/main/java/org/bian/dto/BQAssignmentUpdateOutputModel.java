package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentUpdateInputModelAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssignmentUpdateOutputModel
 */
public class BQAssignmentUpdateOutputModel   {
  private BQAssignmentUpdateInputModelAssignmentInstanceRecord assignmentInstanceRecord = null;

  private String assignmentUpdateActionTaskReference = null;

  private Object assignmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return assignmentUpdateActionTaskReference
  **/

  public String getAssignmentUpdateActionTaskReference() {
    return assignmentUpdateActionTaskReference;
  }

  public void setAssignmentUpdateActionTaskReference(String assignmentUpdateActionTaskReference) {
    this.assignmentUpdateActionTaskReference = assignmentUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

