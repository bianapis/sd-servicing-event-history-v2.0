package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSessionUpdateInputModelSessionInstanceRecordContactDialogueRecord
 */
public class BQSessionUpdateInputModelSessionInstanceRecordContactDialogueRecord   {
  private String contactDialogueType = null;

  private String contactDialogueScript = null;

  private String contactDialogueLogReference = null;

  private String contactDialogueLog = null;

  private String contactDialogueResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The general type of customer exchange (e.g. verified customer, anonymous contact, topic - used to structure/script dialogue) 
   * @return contactDialogueType
  **/

  public String getContactDialogueType() {
    return contactDialogueType;
  }

  public void setContactDialogueType(String contactDialogueType) {
    this.contactDialogueType = contactDialogueType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: In cases a prompt or script can provided to structure the interaction for self-service and assisted interactions 
   * @return contactDialogueScript
  **/

  public String getContactDialogueScript() {
    return contactDialogueScript;
  }

  public void setContactDialogueScript(String contactDialogueScript) {
    this.contactDialogueScript = contactDialogueScript;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a dialogue log that is built up 
   * @return contactDialogueLogReference
  **/

  public String getContactDialogueLogReference() {
    return contactDialogueLogReference;
  }

  public void setContactDialogueLogReference(String contactDialogueLogReference) {
    this.contactDialogueLogReference = contactDialogueLogReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The dialogue log, used for training and root cause analysis etc. (e.g. click-stream, video/audio recording) 
   * @return contactDialogueLog
  **/

  public String getContactDialogueLog() {
    return contactDialogueLog;
  }

  public void setContactDialogueLog(String contactDialogueLog) {
    this.contactDialogueLog = contactDialogueLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the dialogue (e.g. customer satisfied, on-ward routing, hang-up) 
   * @return contactDialogueResult
  **/

  public String getContactDialogueResult() {
    return contactDialogueResult;
  }

  public void setContactDialogueResult(String contactDialogueResult) {
    this.contactDialogueResult = contactDialogueResult;
  }


}

