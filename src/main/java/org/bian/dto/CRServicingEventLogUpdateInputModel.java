package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingEventLogUpdateInputModel
 */
public class CRServicingEventLogUpdateInputModel   {
  private String servicingEventHistoryServicingSessionReference = null;

  private String servicingEventLogInstanceReference = null;

  private Object servicingEventLogUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return servicingEventHistoryServicingSessionReference
  **/

  public String getServicingEventHistoryServicingSessionReference() {
    return servicingEventHistoryServicingSessionReference;
  }

  public void setServicingEventHistoryServicingSessionReference(String servicingEventHistoryServicingSessionReference) {
    this.servicingEventHistoryServicingSessionReference = servicingEventHistoryServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Servicing Event Log instance 
   * @return servicingEventLogInstanceReference
  **/

  public String getServicingEventLogInstanceReference() {
    return servicingEventLogInstanceReference;
  }

  public void setServicingEventLogInstanceReference(String servicingEventLogInstanceReference) {
    this.servicingEventLogInstanceReference = servicingEventLogInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

