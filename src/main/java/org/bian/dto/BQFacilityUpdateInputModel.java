package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFacilityUpdateInputModelFacilityInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFacilityUpdateInputModel
 */
public class BQFacilityUpdateInputModel   {
  private String servicingEventLogInstanceReference = null;

  private String facilityInstanceReference = null;

  private BQFacilityUpdateInputModelFacilityInstanceRecord facilityInstanceRecord = null;

  private Object facilityUpdateActionTaskRecord = null;

  private String facilityUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Facility instance 
   * @return facilityInstanceReference
  **/

  public String getFacilityInstanceReference() {
    return facilityInstanceReference;
  }

  public void setFacilityInstanceReference(String facilityInstanceReference) {
    this.facilityInstanceReference = facilityInstanceReference;
  }


  /**
   * Get facilityInstanceRecord
   * @return facilityInstanceRecord
  **/

  public BQFacilityUpdateInputModelFacilityInstanceRecord getFacilityInstanceRecord() {
    return facilityInstanceRecord;
  }

  public void setFacilityInstanceRecord(BQFacilityUpdateInputModelFacilityInstanceRecord facilityInstanceRecord) {
    this.facilityInstanceRecord = facilityInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return facilityUpdateActionTaskRecord
  **/

  public Object getFacilityUpdateActionTaskRecord() {
    return facilityUpdateActionTaskRecord;
  }

  public void setFacilityUpdateActionTaskRecord(Object facilityUpdateActionTaskRecord) {
    this.facilityUpdateActionTaskRecord = facilityUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return facilityUpdateActionRequest
  **/

  public String getFacilityUpdateActionRequest() {
    return facilityUpdateActionRequest;
  }

  public void setFacilityUpdateActionRequest(String facilityUpdateActionRequest) {
    this.facilityUpdateActionRequest = facilityUpdateActionRequest;
  }


}

