package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSessionUpdateInputModelSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSessionUpdateInputModel
 */
public class BQSessionUpdateInputModel   {
  private String servicingEventLogInstanceReference = null;

  private String sessionInstanceReference = null;

  private BQSessionUpdateInputModelSessionInstanceRecord sessionInstanceRecord = null;

  private Object sessionUpdateActionTaskRecord = null;

  private String sessionUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Session instance 
   * @return sessionInstanceReference
  **/

  public String getSessionInstanceReference() {
    return sessionInstanceReference;
  }

  public void setSessionInstanceReference(String sessionInstanceReference) {
    this.sessionInstanceReference = sessionInstanceReference;
  }


  /**
   * Get sessionInstanceRecord
   * @return sessionInstanceRecord
  **/

  public BQSessionUpdateInputModelSessionInstanceRecord getSessionInstanceRecord() {
    return sessionInstanceRecord;
  }

  public void setSessionInstanceRecord(BQSessionUpdateInputModelSessionInstanceRecord sessionInstanceRecord) {
    this.sessionInstanceRecord = sessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return sessionUpdateActionTaskRecord
  **/

  public Object getSessionUpdateActionTaskRecord() {
    return sessionUpdateActionTaskRecord;
  }

  public void setSessionUpdateActionTaskRecord(Object sessionUpdateActionTaskRecord) {
    this.sessionUpdateActionTaskRecord = sessionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return sessionUpdateActionRequest
  **/

  public String getSessionUpdateActionRequest() {
    return sessionUpdateActionRequest;
  }

  public void setSessionUpdateActionRequest(String sessionUpdateActionRequest) {
    this.sessionUpdateActionRequest = sessionUpdateActionRequest;
  }


}

