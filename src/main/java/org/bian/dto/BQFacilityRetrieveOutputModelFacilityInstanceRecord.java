package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFacilityRetrieveOutputModelFacilityInstanceRecord
 */
public class BQFacilityRetrieveOutputModelFacilityInstanceRecord   {
  private String servicingFacilityType = null;

  private String servicingFacilityInstanceReference = null;

  private Object servicingFacilityInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service support facility engaged (e.g. commission tracking, on-line help, action logging) 
   * @return servicingFacilityType
  **/

  public String getServicingFacilityType() {
    return servicingFacilityType;
  }

  public void setServicingFacilityType(String servicingFacilityType) {
    this.servicingFacilityType = servicingFacilityType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any record generated from he use of the facility 
   * @return servicingFacilityInstanceReference
  **/

  public String getServicingFacilityInstanceReference() {
    return servicingFacilityInstanceReference;
  }

  public void setServicingFacilityInstanceReference(String servicingFacilityInstanceReference) {
    this.servicingFacilityInstanceReference = servicingFacilityInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record of any actions and outcomes from the use of the facility (e.g. commission charged) 
   * @return servicingFacilityInstanceRecord
  **/

  public Object getServicingFacilityInstanceRecord() {
    return servicingFacilityInstanceRecord;
  }

  public void setServicingFacilityInstanceRecord(Object servicingFacilityInstanceRecord) {
    this.servicingFacilityInstanceRecord = servicingFacilityInstanceRecord;
  }


}

