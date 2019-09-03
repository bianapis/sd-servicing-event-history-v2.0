package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIssueRetrieveInputModelIssueInstanceAnalysis
 */
public class BQIssueRetrieveInputModelIssueInstanceAnalysis   {
  private String issueInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return issueInstanceAnalysisReference
  **/

  public String getIssueInstanceAnalysisReference() {
    return issueInstanceAnalysisReference;
  }

  public void setIssueInstanceAnalysisReference(String issueInstanceAnalysisReference) {
    this.issueInstanceAnalysisReference = issueInstanceAnalysisReference;
  }


}

