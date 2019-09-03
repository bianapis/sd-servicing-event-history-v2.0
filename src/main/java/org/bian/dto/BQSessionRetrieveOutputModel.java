package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSessionRetrieveOutputModelSessionInstanceAnalysis;
import org.bian.dto.BQSessionRetrieveOutputModelSessionInstanceRecord;
import org.bian.dto.BQSessionRetrieveOutputModelSessionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSessionRetrieveOutputModel
 */
public class BQSessionRetrieveOutputModel   {
  private BQSessionRetrieveOutputModelSessionInstanceRecord sessionInstanceRecord = null;

  private String sessionRetrieveActionTaskReference = null;

  private Object sessionRetrieveActionTaskRecord = null;

  private String sessionRetrieveActionResponse = null;

  private BQSessionRetrieveOutputModelSessionInstanceReport sessionInstanceReport = null;

  private BQSessionRetrieveOutputModelSessionInstanceAnalysis sessionInstanceAnalysis = null;


  /**
   * Get sessionInstanceRecord
   * @return sessionInstanceRecord
  **/

  public BQSessionRetrieveOutputModelSessionInstanceRecord getSessionInstanceRecord() {
    return sessionInstanceRecord;
  }

  public void setSessionInstanceRecord(BQSessionRetrieveOutputModelSessionInstanceRecord sessionInstanceRecord) {
    this.sessionInstanceRecord = sessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Session instance retrieve service call 
   * @return sessionRetrieveActionTaskReference
  **/

  public String getSessionRetrieveActionTaskReference() {
    return sessionRetrieveActionTaskReference;
  }

  public void setSessionRetrieveActionTaskReference(String sessionRetrieveActionTaskReference) {
    this.sessionRetrieveActionTaskReference = sessionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return sessionRetrieveActionTaskRecord
  **/

  public Object getSessionRetrieveActionTaskRecord() {
    return sessionRetrieveActionTaskRecord;
  }

  public void setSessionRetrieveActionTaskRecord(Object sessionRetrieveActionTaskRecord) {
    this.sessionRetrieveActionTaskRecord = sessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return sessionRetrieveActionResponse
  **/

  public String getSessionRetrieveActionResponse() {
    return sessionRetrieveActionResponse;
  }

  public void setSessionRetrieveActionResponse(String sessionRetrieveActionResponse) {
    this.sessionRetrieveActionResponse = sessionRetrieveActionResponse;
  }


  /**
   * Get sessionInstanceReport
   * @return sessionInstanceReport
  **/

  public BQSessionRetrieveOutputModelSessionInstanceReport getSessionInstanceReport() {
    return sessionInstanceReport;
  }

  public void setSessionInstanceReport(BQSessionRetrieveOutputModelSessionInstanceReport sessionInstanceReport) {
    this.sessionInstanceReport = sessionInstanceReport;
  }


  /**
   * Get sessionInstanceAnalysis
   * @return sessionInstanceAnalysis
  **/

  public BQSessionRetrieveOutputModelSessionInstanceAnalysis getSessionInstanceAnalysis() {
    return sessionInstanceAnalysis;
  }

  public void setSessionInstanceAnalysis(BQSessionRetrieveOutputModelSessionInstanceAnalysis sessionInstanceAnalysis) {
    this.sessionInstanceAnalysis = sessionInstanceAnalysis;
  }


}

