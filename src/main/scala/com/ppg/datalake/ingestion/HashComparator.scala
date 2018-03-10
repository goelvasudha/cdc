package com.ppg.datalake.ingestion

import org.apache.spark.sql.DataFrame

object HashComparator {
  // This method has Left join to determine deleted records
  def comparePrimaryKey(): DataFrame = ???

  // This method has left join to determine inserted and updated records
  def compareAllColumns(): DataFrame = ???
}