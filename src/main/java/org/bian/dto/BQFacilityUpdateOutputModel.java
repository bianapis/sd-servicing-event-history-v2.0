package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFacilityUpdateInputModelFacilityInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFacilityUpdateOutputModel
 */
public class BQFacilityUpdateOutputModel   {
  private BQFacilityUpdateInputModelFacilityInstanceRecord facilityInstanceRecord = null;

  private String facilityUpdateActionTaskReference = null;

  private Object facilityUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return facilityUpdateActionTaskReference
  **/

  public String getFacilityUpdateActionTaskReference() {
    return facilityUpdateActionTaskReference;
  }

  public void setFacilityUpdateActionTaskReference(String facilityUpdateActionTaskReference) {
    this.facilityUpdateActionTaskReference = facilityUpdateActionTaskReference;
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

