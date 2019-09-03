package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingEventLogRetrieveInputModelServicingEventLogInstanceAnalysis;
import org.bian.dto.CRServicingEventLogRetrieveInputModelServicingEventLogInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRServicingEventLogRetrieveInputModel
 */
public class CRServicingEventLogRetrieveInputModel   {
  private Object servicingEventLogRetrieveActionTaskRecord = null;

  private String servicingEventLogRetrieveActionRequest = null;

  private CRServicingEventLogRetrieveInputModelServicingEventLogInstanceReportRecord servicingEventLogInstanceReportRecord = null;

  private CRServicingEventLogRetrieveInputModelServicingEventLogInstanceAnalysis servicingEventLogInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return servicingEventLogRetrieveActionTaskRecord
  **/

  public Object getServicingEventLogRetrieveActionTaskRecord() {
    return servicingEventLogRetrieveActionTaskRecord;
  }

  public void setServicingEventLogRetrieveActionTaskRecord(Object servicingEventLogRetrieveActionTaskRecord) {
    this.servicingEventLogRetrieveActionTaskRecord = servicingEventLogRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return servicingEventLogRetrieveActionRequest
  **/

  public String getServicingEventLogRetrieveActionRequest() {
    return servicingEventLogRetrieveActionRequest;
  }

  public void setServicingEventLogRetrieveActionRequest(String servicingEventLogRetrieveActionRequest) {
    this.servicingEventLogRetrieveActionRequest = servicingEventLogRetrieveActionRequest;
  }


  /**
   * Get servicingEventLogInstanceReportRecord
   * @return servicingEventLogInstanceReportRecord
  **/

  public CRServicingEventLogRetrieveInputModelServicingEventLogInstanceReportRecord getServicingEventLogInstanceReportRecord() {
    return servicingEventLogInstanceReportRecord;
  }

  public void setServicingEventLogInstanceReportRecord(CRServicingEventLogRetrieveInputModelServicingEventLogInstanceReportRecord servicingEventLogInstanceReportRecord) {
    this.servicingEventLogInstanceReportRecord = servicingEventLogInstanceReportRecord;
  }


  /**
   * Get servicingEventLogInstanceAnalysis
   * @return servicingEventLogInstanceAnalysis
  **/

  public CRServicingEventLogRetrieveInputModelServicingEventLogInstanceAnalysis getServicingEventLogInstanceAnalysis() {
    return servicingEventLogInstanceAnalysis;
  }

  public void setServicingEventLogInstanceAnalysis(CRServicingEventLogRetrieveInputModelServicingEventLogInstanceAnalysis servicingEventLogInstanceAnalysis) {
    this.servicingEventLogInstanceAnalysis = servicingEventLogInstanceAnalysis;
  }


}

