package com.star_zero.sample.ksp

import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.KSAnnotated

class SampleProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger
) : SymbolProcessor {

    private var invoked = false

    override fun process(resolver: Resolver): List<KSAnnotated> {
        logger.logging("[KSP] process start")
        if (invoked) {
            return emptyList()
        }

        val newFile = codeGenerator.createNewFile(
            Dependencies(false),
            "com.star_zero.sample",
            "Greeter"
        )

        val code = """
            package com.star_zero.sample
            object Greeter {
                fun greet() {
                    println("Hello World!")
                }
            }
        """.trimIndent()

        newFile.write(code.toByteArray())
        newFile.close()

        val files = resolver.getNewFiles()
        val visitor = SampleVisitor(logger)
        files.forEach { file ->
            file.accept(visitor, "")
        }

        invoked = true

        logger.logging("[KSP] process end")
        return emptyList()
    }
}
