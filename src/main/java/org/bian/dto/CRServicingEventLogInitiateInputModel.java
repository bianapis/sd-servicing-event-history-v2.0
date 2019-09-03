package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingEventLogInitiateInputModelServicingEventLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRServicingEventLogInitiateInputModel
 */
public class CRServicingEventLogInitiateInputModel   {
  private String servicingEventHistoryServicingSessionReference = null;

  private Object servicingEventLogInitiateActionRecord = null;

  private String servicingEventLogInstanceStatus = null;

  private CRServicingEventLogInitiateInputModelServicingEventLogInstanceRecord servicingEventLogInstanceRecord = null;


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


  /**
   * Get servicingEventLogInstanceRecord
   * @return servicingEventLogInstanceRecord
  **/

  public CRServicingEventLogInitiateInputModelServicingEventLogInstanceRecord getServicingEventLogInstanceRecord() {
    return servicingEventLogInstanceRecord;
  }

  public void setServicingEventLogInstanceRecord(CRServicingEventLogInitiateInputModelServicingEventLogInstanceRecord servicingEventLogInstanceRecord) {
    this.servicingEventLogInstanceRecord = servicingEventLogInstanceRecord;
  }


}

