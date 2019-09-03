package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingEventLogUpdateOutputModel
 */
public class CRServicingEventLogUpdateOutputModel   {
  private String servicingEventLogUpdateActionTaskReference = null;

  private Object servicingEventLogUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return servicingEventLogUpdateActionTaskReference
  **/

  public String getServicingEventLogUpdateActionTaskReference() {
    return servicingEventLogUpdateActionTaskReference;
  }

  public void setServicingEventLogUpdateActionTaskReference(String servicingEventLogUpdateActionTaskReference) {
    this.servicingEventLogUpdateActionTaskReference = servicingEventLogUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return servicingEventLogUpdateActionTaskRecord
  **/

  public Object getServicingEventLogUpdateActionTaskRecord() {
    return servicingEventLogUpdateActionTaskRecord;
  }

  public void setServicingEventLogUpdateActionTaskRecord(Object servicingEventLogUpdateActionTaskRecord) {
    this.servicingEventLogUpdateActionTaskRecord = servicingEventLogUpdateActionTaskRecord;
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

