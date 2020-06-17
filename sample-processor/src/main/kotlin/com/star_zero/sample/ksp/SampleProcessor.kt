package com.star_zero.sample.ksp

import org.jetbrains.kotlin.ksp.processing.CodeGenerator
import org.jetbrains.kotlin.ksp.processing.Resolver
import org.jetbrains.kotlin.ksp.processing.SymbolProcessor
import java.io.File

class SampleProcessor : SymbolProcessor {

    private lateinit var codeGenerator: CodeGenerator

    override fun init(options: Map<String, String>, kotlinVersion: KotlinVersion, codeGenerator: CodeGenerator) {
        this.codeGenerator = codeGenerator
        val logFile = codeGenerator.createNewFile("", "SampleProcessor", "log")
        Logger.setup(logFile)
        Logger.print("init")
    }

    override fun process(resolver: Resolver) {
        Logger.print("process")

        // Create com.star_zero.sample.Greeter
        val greeter = codeGenerator.createNewFile("com.star_zero.sample", "Greeter", "kt")
        greeter.appendText("package com.star_zero.sample\n")
        greeter.appendText("object Greeter {\n")
        greeter.appendText("fun greet() {\n")
        greeter.appendText("println(\"Hello World!\")\n")
        greeter.appendText("}\n")
        greeter.appendText("}\n")

        // logging source file
        val files = resolver.getAllFiles()
        val visitor = SampleVisitor()
        files.forEach { file ->
            Logger.print("Start log: ${file.fileName}")
            file.accept(visitor, "")
        }
    }

    override fun finish() {
        Logger.print("finish")
    }
}
