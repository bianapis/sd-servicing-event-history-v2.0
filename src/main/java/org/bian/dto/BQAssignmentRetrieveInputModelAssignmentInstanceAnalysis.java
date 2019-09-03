package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssignmentRetrieveInputModelAssignmentInstanceAnalysis
 */
public class BQAssignmentRetrieveInputModelAssignmentInstanceAnalysis   {
  private String assignmentInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return assignmentInstanceAnalysisReference
  **/

  public String getAssignmentInstanceAnalysisReference() {
    return assignmentInstanceAnalysisReference;
  }

  public void setAssignmentInstanceAnalysisReference(String assignmentInstanceAnalysisReference) {
    this.assignmentInstanceAnalysisReference = assignmentInstanceAnalysisReference;
  }


}

