package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingEventLogInitiateOutputModel
 */
public class CRServicingEventLogInitiateOutputModel   {
  private String servicingEventLogInstanceReference = null;

  private String servicingEventLogInitiateActionReference = null;

  private Object servicingEventLogInitiateActionRecord = null;

  private String servicingEventLogInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return servicingEventLogInitiateActionReference
  **/

  public String getServicingEventLogInitiateActionReference() {
    return servicingEventLogInitiateActionReference;
  }

  public void setServicingEventLogInitiateActionReference(String servicingEventLogInitiateActionReference) {
    this.servicingEventLogInitiateActionReference = servicingEventLogInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return servicingEventLogInitiateActionRecord
  **/

  public Object getServicingEventLogInitiateActionRecord() {
    return servicingEventLogInitiateActionRecord;
  }

  public void setServicingEventLogInitiateActionRecord(Object servicingEventLogInitiateActionRecord) {
    this.servicingEventLogInitiateActionRecord = servicingEventLogInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Servicing Event Log instance (e.g. initialised, pending, active) 
   * @return servicingEventLogInstanceStatus
  **/

  public String getServicingEventLogInstanceStatus() {
    return servicingEventLogInstanceStatus;
  }

  public void setServicingEventLogInstanceStatus(String servicingEventLogInstanceStatus) {
    this.servicingEventLogInstanceStatus = servicingEventLogInstanceStatus;
  }


}

