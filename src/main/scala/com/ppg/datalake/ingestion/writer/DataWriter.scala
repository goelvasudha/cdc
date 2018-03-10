package com.ppg.datalake.ingestion.writer

trait DataWriter {

  //TODO: add parameters to method
  def write(): Boolean
}
