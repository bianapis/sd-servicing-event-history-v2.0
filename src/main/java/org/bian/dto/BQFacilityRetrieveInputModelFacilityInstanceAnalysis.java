package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFacilityRetrieveInputModelFacilityInstanceAnalysis
 */
public class BQFacilityRetrieveInputModelFacilityInstanceAnalysis   {
  private String facilityInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return facilityInstanceAnalysisReference
  **/

  public String getFacilityInstanceAnalysisReference() {
    return facilityInstanceAnalysisReference;
  }

  public void setFacilityInstanceAnalysisReference(String facilityInstanceAnalysisReference) {
    this.facilityInstanceAnalysisReference = facilityInstanceAnalysisReference;
  }


}

