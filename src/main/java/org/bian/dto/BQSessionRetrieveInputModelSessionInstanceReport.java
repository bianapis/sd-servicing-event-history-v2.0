package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSessionRetrieveInputModelSessionInstanceReport
 */
public class BQSessionRetrieveInputModelSessionInstanceReport   {
  private String sessionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return sessionInstanceReportReference
  **/

  public String getSessionInstanceReportReference() {
    return sessionInstanceReportReference;
  }

  public void setSessionInstanceReportReference(String sessionInstanceReportReference) {
    this.sessionInstanceReportReference = sessionInstanceReportReference;
  }


}

