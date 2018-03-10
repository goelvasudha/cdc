package com.ppg.datalake.ingestion

object DynamicSchemaGenerator {

  //TODO: add parameters to method
  def changeSchema(): Unit = {
    val curSchema = getCurrentSchema()
    val prevSchema = getPreviousSchema()
    if(compareSchemas()) {
      dfWithNewSchema()
    }
  }

  //TODO: add parameters to method
  private def getCurrentSchema() = ???

  //TODO: add parameters to method
  private def getPreviousSchema() = ???

  // Returns true when there is a schema change
  //TODO: add parameters to method
  private def compareSchemas(): Boolean = ???

  //TODO: add parameters to method
  private def dfWithNewSchema() = ???

}
