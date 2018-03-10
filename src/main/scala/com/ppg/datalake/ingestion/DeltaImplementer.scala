package com.ppg.datalake.ingestion

import com.ppg.datalake.ingestion.writer.TextWriter

object DeltaImplementer {
  def implement() = {
    val deleteDataFrame = HashComparator.comparePrimaryKey() // This method has Left join to determine deleted records
    val upsertDataFrame = HashComparator.compareAllColumns() // This method has left join to determine inserted and updated records

    val allDataFrame = ??? // TODO: Add code to get the union of both data frames

    DataValidator.validateAndWrite(TextWriter)
  }
}
