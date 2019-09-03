package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSessionRetrieveInputModelSessionInstanceAnalysis;
import org.bian.dto.BQSessionRetrieveInputModelSessionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSessionRetrieveInputModel
 */
public class BQSessionRetrieveInputModel   {
  private Object sessionRetrieveActionTaskRecord = null;

  private String sessionRetrieveActionRequest = null;

  private BQSessionRetrieveInputModelSessionInstanceReport sessionInstanceReport = null;

  private BQSessionRetrieveInputModelSessionInstanceAnalysis sessionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return sessionRetrieveActionRequest
  **/

  public String getSessionRetrieveActionRequest() {
    return sessionRetrieveActionRequest;
  }

  public void setSessionRetrieveActionRequest(String sessionRetrieveActionRequest) {
    this.sessionRetrieveActionRequest = sessionRetrieveActionRequest;
  }


  /**
   * Get sessionInstanceReport
   * @return sessionInstanceReport
  **/

  public BQSessionRetrieveInputModelSessionInstanceReport getSessionInstanceReport() {
    return sessionInstanceReport;
  }

  public void setSessionInstanceReport(BQSessionRetrieveInputModelSessionInstanceReport sessionInstanceReport) {
    this.sessionInstanceReport = sessionInstanceReport;
  }


  /**
   * Get sessionInstanceAnalysis
   * @return sessionInstanceAnalysis
  **/

  public BQSessionRetrieveInputModelSessionInstanceAnalysis getSessionInstanceAnalysis() {
    return sessionInstanceAnalysis;
  }

  public void setSessionInstanceAnalysis(BQSessionRetrieveInputModelSessionInstanceAnalysis sessionInstanceAnalysis) {
    this.sessionInstanceAnalysis = sessionInstanceAnalysis;
  }


}

