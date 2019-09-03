package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentRetrieveInputModelAssignmentInstanceAnalysis;
import org.bian.dto.BQAssignmentRetrieveInputModelAssignmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAssignmentRetrieveInputModel
 */
public class BQAssignmentRetrieveInputModel   {
  private Object assignmentRetrieveActionTaskRecord = null;

  private String assignmentRetrieveActionRequest = null;

  private BQAssignmentRetrieveInputModelAssignmentInstanceReport assignmentInstanceReport = null;

  private BQAssignmentRetrieveInputModelAssignmentInstanceAnalysis assignmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return assignmentRetrieveActionTaskRecord
  **/

  public Object getAssignmentRetrieveActionTaskRecord() {
    return assignmentRetrieveActionTaskRecord;
  }

  public void setAssignmentRetrieveActionTaskRecord(Object assignmentRetrieveActionTaskRecord) {
    this.assignmentRetrieveActionTaskRecord = assignmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return assignmentRetrieveActionRequest
  **/

  public String getAssignmentRetrieveActionRequest() {
    return assignmentRetrieveActionRequest;
  }

  public void setAssignmentRetrieveActionRequest(String assignmentRetrieveActionRequest) {
    this.assignmentRetrieveActionRequest = assignmentRetrieveActionRequest;
  }


  /**
   * Get assignmentInstanceReport
   * @return assignmentInstanceReport
  **/

  public BQAssignmentRetrieveInputModelAssignmentInstanceReport getAssignmentInstanceReport() {
    return assignmentInstanceReport;
  }

  public void setAssignmentInstanceReport(BQAssignmentRetrieveInputModelAssignmentInstanceReport assignmentInstanceReport) {
    this.assignmentInstanceReport = assignmentInstanceReport;
  }


  /**
   * Get assignmentInstanceAnalysis
   * @return assignmentInstanceAnalysis
  **/

  public BQAssignmentRetrieveInputModelAssignmentInstanceAnalysis getAssignmentInstanceAnalysis() {
    return assignmentInstanceAnalysis;
  }

  public void setAssignmentInstanceAnalysis(BQAssignmentRetrieveInputModelAssignmentInstanceAnalysis assignmentInstanceAnalysis) {
    this.assignmentInstanceAnalysis = assignmentInstanceAnalysis;
  }


}

