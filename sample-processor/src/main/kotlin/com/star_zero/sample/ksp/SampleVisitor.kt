package com.star_zero.sample.ksp

import org.jetbrains.kotlin.ksp.symbol.*
import java.io.File

class SampleVisitor : KSVisitor<String, Unit> {

    override fun visitAnnotated(annotated: KSAnnotated, data: String) {
        Logger.print("visitAnnotated: $annotated")
    }

    override fun visitAnnotation(annotation: KSAnnotation, data: String) {
        Logger.print("visitAnnotation: $annotation")
    }

    override fun visitCallableReference(reference: KSCallableReference, data: String) {
        Logger.print("visitCallableReference: $reference")
    }

    override fun visitClassDeclaration(classDeclaration: KSClassDeclaration, data: String) {
        Logger.print("visitClassDeclaration: $classDeclaration")
    }

    override fun visitClassifierReference(reference: KSClassifierReference, data: String) {
        Logger.print("visitClassifierReference: $reference")
    }

    override fun visitDeclaration(declaration: KSDeclaration, data: String) {
        Logger.print("visitDeclaration: $declaration")
    }

    override fun visitDeclarationContainer(declarationContainer: KSDeclarationContainer, data: String) {
        Logger.print("visitDeclarationContainer: $declarationContainer")
    }

    override fun visitDynamicReference(reference: KSDynamicReference, data: String) {
        Logger.print("visitDynamicReference: $reference")
    }

    override fun visitEnumEntryDeclaration(enumEntryDeclaration: KSEnumEntryDeclaration, data: String) {
        Logger.print("visitEnumEntryDeclaration: $enumEntryDeclaration")
    }

    override fun visitFile(file: KSFile, data: String) {
        Logger.print("visitFile: $file")
        file.declarations.forEach {
            it.accept(this, data)
        }
    }

    override fun visitFunctionDeclaration(function: KSFunctionDeclaration, data: String) {
        Logger.print("visitFunctionDeclaration: $function")
        Logger.print("  simpleName: ${function.qualifiedName?.asString()}")
        Logger.print("  visit: function.declarations")
        function.declarations.forEach {
            it.accept(this, data)
        }
        Logger.print("  visit: function.parameters")
        function.parameters.forEach {
            it.accept(this, data)
        }
        Logger.print("  visit: function.returnType")
        function.returnType?.accept(this, data)
    }

    override fun visitModifierListOwner(modifierListOwner: KSModifierListOwner, data: String) {
        Logger.print("visitModifierListOwner: $modifierListOwner")
    }

    override fun visitNode(node: KSNode, data: String) {
        Logger.print("visitNode: $node")
    }

    override fun visitParenthesizedReference(reference: KSParenthesizedReference, data: String) {
        Logger.print("visitParenthesizedReference: $reference")
    }

    override fun visitPropertyAccessor(accessor: KSPropertyAccessor, data: String) {
        Logger.print("visitPropertyAccessor: $accessor")
    }

    override fun visitPropertyDeclaration(property: KSPropertyDeclaration, data: String) {
        Logger.print("visitPropertyDeclaration: $property")
    }

    override fun visitPropertyGetter(getter: KSPropertyGetter, data: String) {
        Logger.print("visitPropertyGetter: $getter")
    }

    override fun visitPropertySetter(setter: KSPropertySetter, data: String) {
        Logger.print("visitPropertySetter: $setter")
    }

    override fun visitReferenceElement(element: KSReferenceElement, data: String) {
        Logger.print("visitReferenceElement: $element")
    }

    override fun visitTypeAlias(typeAlias: KSTypeAlias, data: String) {
        Logger.print("visitTypeAlias: $typeAlias")
    }

    override fun visitTypeArgument(typeArgument: KSTypeArgument, data: String) {
        Logger.print("visitTypeArgument: $typeArgument")
    }

    override fun visitTypeParameter(typeParameter: KSTypeParameter, data: String) {
        Logger.print("visitTypeParameter: $typeParameter")
    }

    override fun visitTypeReference(typeReference: KSTypeReference, data: String) {
        Logger.print("visitTypeReference: $typeReference")
        Logger.print("  typeName: ${typeReference.resolve()?.declaration?.qualifiedName?.asString()}")
    }

    override fun visitValueArgument(valueArgument: KSValueArgument, data: String) {
        Logger.print("visitValueArgument: $valueArgument")
    }

    override fun visitVariableParameter(variableParameter: KSVariableParameter, data: String) {
        Logger.print("visitVariableParameter: $variableParameter")
    }
}
