package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingEventLogControlInputModelServicingEventLogControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRServicingEventLogControlInputModel
 */
public class CRServicingEventLogControlInputModel   {
  private String servicingEventHistoryServicingSessionReference = null;

  private String servicingEventLogInstanceReference = null;

  private Object servicingEventLogControlActionTaskRecord = null;

  private CRServicingEventLogControlInputModelServicingEventLogControlActionRequest servicingEventLogControlActionRequest = null;


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
   * Get servicingEventLogControlActionRequest
   * @return servicingEventLogControlActionRequest
  **/

  public CRServicingEventLogControlInputModelServicingEventLogControlActionRequest getServicingEventLogControlActionRequest() {
    return servicingEventLogControlActionRequest;
  }

  public void setServicingEventLogControlActionRequest(CRServicingEventLogControlInputModelServicingEventLogControlActionRequest servicingEventLogControlActionRequest) {
    this.servicingEventLogControlActionRequest = servicingEventLogControlActionRequest;
  }


}

