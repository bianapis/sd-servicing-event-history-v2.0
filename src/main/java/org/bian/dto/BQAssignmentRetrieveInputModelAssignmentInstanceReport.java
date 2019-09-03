package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssignmentRetrieveInputModelAssignmentInstanceReport
 */
public class BQAssignmentRetrieveInputModelAssignmentInstanceReport   {
  private String assignmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return assignmentInstanceReportReference
  **/

  public String getAssignmentInstanceReportReference() {
    return assignmentInstanceReportReference;
  }

  public void setAssignmentInstanceReportReference(String assignmentInstanceReportReference) {
    this.assignmentInstanceReportReference = assignmentInstanceReportReference;
  }


}

