package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingEventLogControlOutputModel
 */
public class CRServicingEventLogControlOutputModel   {
  private String servicingEventLogControlActionTaskReference = null;

  private Object servicingEventLogControlActionTaskRecord = null;

  private String servicingEventLogControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing Event Log instance control processing service call 
   * @return servicingEventLogControlActionTaskReference
  **/

  public String getServicingEventLogControlActionTaskReference() {
    return servicingEventLogControlActionTaskReference;
  }

  public void setServicingEventLogControlActionTaskReference(String servicingEventLogControlActionTaskReference) {
    this.servicingEventLogControlActionTaskReference = servicingEventLogControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return servicingEventLogControlActionTaskRecord
  **/

  public Object getServicingEventLogControlActionTaskRecord() {
    return servicingEventLogControlActionTaskRecord;
  }

  public void setServicingEventLogControlActionTaskRecord(Object servicingEventLogControlActionTaskRecord) {
    this.servicingEventLogControlActionTaskRecord = servicingEventLogControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return servicingEventLogControlActionResponse
  **/

  public String getServicingEventLogControlActionResponse() {
    return servicingEventLogControlActionResponse;
  }

  public void setServicingEventLogControlActionResponse(String servicingEventLogControlActionResponse) {
    this.servicingEventLogControlActionResponse = servicingEventLogControlActionResponse;
  }


}

