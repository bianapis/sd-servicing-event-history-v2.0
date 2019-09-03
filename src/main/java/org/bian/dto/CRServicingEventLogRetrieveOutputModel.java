package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceAnalysis;
import org.bian.dto.CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceRecord;
import org.bian.dto.CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRServicingEventLogRetrieveOutputModel
 */
public class CRServicingEventLogRetrieveOutputModel   {
  private CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceRecord servicingEventLogInstanceRecord = null;

  private String servicingEventLogRetrieveActionTaskReference = null;

  private Object servicingEventLogRetrieveActionTaskRecord = null;

  private String servicingEventLogRetrieveActionResponse = null;

  private CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceReportRecord servicingEventLogInstanceReportRecord = null;

  private CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceAnalysis servicingEventLogInstanceAnalysis = null;


  /**
   * Get servicingEventLogInstanceRecord
   * @return servicingEventLogInstanceRecord
  **/

  public CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceRecord getServicingEventLogInstanceRecord() {
    return servicingEventLogInstanceRecord;
  }

  public void setServicingEventLogInstanceRecord(CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceRecord servicingEventLogInstanceRecord) {
    this.servicingEventLogInstanceRecord = servicingEventLogInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing Event Log instance retrieve service call 
   * @return servicingEventLogRetrieveActionTaskReference
  **/

  public String getServicingEventLogRetrieveActionTaskReference() {
    return servicingEventLogRetrieveActionTaskReference;
  }

  public void setServicingEventLogRetrieveActionTaskReference(String servicingEventLogRetrieveActionTaskReference) {
    this.servicingEventLogRetrieveActionTaskReference = servicingEventLogRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return servicingEventLogRetrieveActionResponse
  **/

  public String getServicingEventLogRetrieveActionResponse() {
    return servicingEventLogRetrieveActionResponse;
  }

  public void setServicingEventLogRetrieveActionResponse(String servicingEventLogRetrieveActionResponse) {
    this.servicingEventLogRetrieveActionResponse = servicingEventLogRetrieveActionResponse;
  }


  /**
   * Get servicingEventLogInstanceReportRecord
   * @return servicingEventLogInstanceReportRecord
  **/

  public CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceReportRecord getServicingEventLogInstanceReportRecord() {
    return servicingEventLogInstanceReportRecord;
  }

  public void setServicingEventLogInstanceReportRecord(CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceReportRecord servicingEventLogInstanceReportRecord) {
    this.servicingEventLogInstanceReportRecord = servicingEventLogInstanceReportRecord;
  }


  /**
   * Get servicingEventLogInstanceAnalysis
   * @return servicingEventLogInstanceAnalysis
  **/

  public CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceAnalysis getServicingEventLogInstanceAnalysis() {
    return servicingEventLogInstanceAnalysis;
  }

  public void setServicingEventLogInstanceAnalysis(CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceAnalysis servicingEventLogInstanceAnalysis) {
    this.servicingEventLogInstanceAnalysis = servicingEventLogInstanceAnalysis;
  }


}

