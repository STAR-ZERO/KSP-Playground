package com.star_zero.sample.ksp

import java.io.File

object Logger {
    private lateinit var logFile: File

    fun setup(logFile: File) {
        this.logFile = logFile
    }

    fun print(v: Any?) {
        logFile.appendText("$v\n")
    }
}
