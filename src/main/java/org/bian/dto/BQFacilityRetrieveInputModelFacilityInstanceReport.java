package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFacilityRetrieveInputModelFacilityInstanceReport
 */
public class BQFacilityRetrieveInputModelFacilityInstanceReport   {
  private String facilityInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return facilityInstanceReportReference
  **/

  public String getFacilityInstanceReportReference() {
    return facilityInstanceReportReference;
  }

  public void setFacilityInstanceReportReference(String facilityInstanceReportReference) {
    this.facilityInstanceReportReference = facilityInstanceReportReference;
  }


}

