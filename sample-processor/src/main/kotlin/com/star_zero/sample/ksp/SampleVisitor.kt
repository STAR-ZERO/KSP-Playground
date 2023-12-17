package com.star_zero.sample.ksp

import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.symbol.*

class SampleVisitor(
    private val logger: KSPLogger
) : KSVisitor<String, Unit> {

    override fun visitAnnotated(annotated: KSAnnotated, data: String) {
        logger.logging("[KSP] visitAnnotated")
    }

    override fun visitAnnotation(annotation: KSAnnotation, data: String) {
        logger.logging("[KSP] visitAnnotation")
    }

    override fun visitCallableReference(reference: KSCallableReference, data: String) {
        logger.logging("[KSP] visitCallableReference")
    }

    override fun visitClassDeclaration(classDeclaration: KSClassDeclaration, data: String) {
        logger.logging("[KSP] visitClassDeclaration")
    }

    override fun visitClassifierReference(reference: KSClassifierReference, data: String) {
        logger.logging("[KSP] visitClassifierReference")
    }

    override fun visitDeclarationContainer(declarationContainer: KSDeclarationContainer, data: String) {
        logger.logging("[KSP] visitDeclarationContainer")
    }

    override fun visitDefNonNullReference(reference: KSDefNonNullReference, data: String) {
        logger.logging("[KSP] visitDefNonNullReference")
    }

    override fun visitDynamicReference(reference: KSDynamicReference, data: String) {
        logger.logging("[KSP] visitDynamicReference")
    }

    override fun visitFile(file: KSFile, data: String) {
        logger.logging("[KSP] visitFile")
    }

    override fun visitFunctionDeclaration(function: KSFunctionDeclaration, data: String) {
        logger.logging("[KSP] visitFunctionDeclaration")
    }

    override fun visitModifierListOwner(modifierListOwner: KSModifierListOwner, data: String) {
        logger.logging("[KSP] visitModifierListOwner")
    }

    override fun visitNode(node: KSNode, data: String) {
        logger.logging("[KSP] visitNode")
    }

    override fun visitParenthesizedReference(reference: KSParenthesizedReference, data: String) {
        logger.logging("[KSP] visitParenthesizedReference")
    }

    override fun visitPropertyAccessor(accessor: KSPropertyAccessor, data: String) {
        logger.logging("[KSP] visitPropertyAccessor")
    }

    override fun visitPropertyDeclaration(property: KSPropertyDeclaration, data: String) {
        logger.logging("[KSP] visitPropertyDeclaration")
    }

    override fun visitPropertyGetter(getter: KSPropertyGetter, data: String) {
        logger.logging("[KSP] visitPropertyGetter")
    }

    override fun visitPropertySetter(setter: KSPropertySetter, data: String) {
        logger.logging("[KSP] visitPropertySetter")
    }

    override fun visitReferenceElement(element: KSReferenceElement, data: String) {
        logger.logging("[KSP] visitAnnotated")
    }

    override fun visitTypeAlias(typeAlias: KSTypeAlias, data: String) {
        logger.logging("[KSP] visitTypeAlias")
    }

    override fun visitTypeArgument(typeArgument: KSTypeArgument, data: String) {
        logger.logging("[KSP] visitTypeArgument")
    }

    override fun visitTypeParameter(typeParameter: KSTypeParameter, data: String) {
        logger.logging("[KSP] visitTypeParameter")
    }

    override fun visitTypeReference(typeReference: KSTypeReference, data: String) {
        logger.logging("[KSP] visitTypeReference")
    }

    override fun visitValueArgument(valueArgument: KSValueArgument, data: String) {
        logger.logging("[KSP] visitValueArgument")
    }

    override fun visitValueParameter(valueParameter: KSValueParameter, data: String) {
        logger.logging("[KSP] visitValueParameter")
    }

    override fun visitDeclaration(declaration: KSDeclaration, data: String) {
        logger.logging("[KSP] visitDeclaration")
    }
}
