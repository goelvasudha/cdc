package com.ppg.datalake.ingestion.util

import com.typesafe.config.{Config, ConfigFactory}

object AppConfig {

  private val appConfig = ConfigFactory.load()
  def getConfig(moduleName: String): Config = {
    appConfig.getConfig(moduleName).withFallback(appConfig.getConfig(CommonModule))
  }

  val CommonModule: String = "common"
}