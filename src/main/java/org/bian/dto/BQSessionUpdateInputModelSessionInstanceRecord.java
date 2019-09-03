package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSessionUpdateInputModelSessionInstanceRecordContactDialogueRecord;

import javax.validation.Valid;
  
/**
 * BQSessionUpdateInputModelSessionInstanceRecord
 */
public class BQSessionUpdateInputModelSessionInstanceRecord   {
  private String sessionStartEndTime = null;

  private String customerContactReference = null;

  private String sessionMechanism = null;

  private String servicingFacilityType = null;

  private Object servicingFacilityInstanceRecord = null;

  private BQSessionUpdateInputModelSessionInstanceRecordContactDialogueRecord contactDialogueRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The start and duration of the dialogue 
   * @return sessionStartEndTime
  **/

  public String getSessionStartEndTime() {
    return sessionStartEndTime;
  }

  public void setSessionStartEndTime(String sessionStartEndTime) {
    this.sessionStartEndTime = sessionStartEndTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the complete contact record for the customer contact 
   * @return customerContactReference
  **/

  public String getCustomerContactReference() {
    return customerContactReference;
  }

  public void setCustomerContactReference(String customerContactReference) {
    this.customerContactReference = customerContactReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of channel device involved in the session exchange (e.g. web, phone, chat, video, VOIP, face to face at a branch - note there can be concurrent sessions within a single customer contact) 
   * @return sessionMechanism
  **/

  public String getSessionMechanism() {
    return sessionMechanism;
  }

  public void setSessionMechanism(String sessionMechanism) {
    this.sessionMechanism = sessionMechanism;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Lists if a specific servicing facility is used during the session) 
   * @return servicingFacilityType
  **/

  public String getServicingFacilityType() {
    return servicingFacilityType;
  }

  public void setServicingFacilityType(String servicingFacilityType) {
    this.servicingFacilityType = servicingFacilityType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: A summary of record of any output/action generated using the facility (e.g. product selection, commissions) 
   * @return servicingFacilityInstanceRecord
  **/

  public Object getServicingFacilityInstanceRecord() {
    return servicingFacilityInstanceRecord;
  }

  public void setServicingFacilityInstanceRecord(Object servicingFacilityInstanceRecord) {
    this.servicingFacilityInstanceRecord = servicingFacilityInstanceRecord;
  }


  /**
   * Get contactDialogueRecord
   * @return contactDialogueRecord
  **/

  public BQSessionUpdateInputModelSessionInstanceRecordContactDialogueRecord getContactDialogueRecord() {
    return contactDialogueRecord;
  }

  public void setContactDialogueRecord(BQSessionUpdateInputModelSessionInstanceRecordContactDialogueRecord contactDialogueRecord) {
    this.contactDialogueRecord = contactDialogueRecord;
  }


}

