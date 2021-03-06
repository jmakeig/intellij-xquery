/*
 * Copyright 2013-2016 Grzegorz Ligas <ligasgr@gmail.com> and other contributors
 * (see the CONTRIBUTORS file).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.xquery.psi.XQueryTypes.*;
import org.intellij.xquery.psi.*;

public class XQueryKindTestImpl extends XQueryPsiElementImpl implements XQueryKindTest {

  public XQueryKindTestImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitKindTest(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) accept((XQueryVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XQueryAnyKindTest getAnyKindTest() {
    return findChildByClass(XQueryAnyKindTest.class);
  }

  @Override
  @Nullable
  public XQueryAttributeTest getAttributeTest() {
    return findChildByClass(XQueryAttributeTest.class);
  }

  @Override
  @Nullable
  public XQueryCommentTest getCommentTest() {
    return findChildByClass(XQueryCommentTest.class);
  }

  @Override
  @Nullable
  public XQueryDocumentTest getDocumentTest() {
    return findChildByClass(XQueryDocumentTest.class);
  }

  @Override
  @Nullable
  public XQueryElementTest getElementTest() {
    return findChildByClass(XQueryElementTest.class);
  }

  @Override
  @Nullable
  public XQueryMapTest getMapTest() {
    return findChildByClass(XQueryMapTest.class);
  }

  @Override
  @Nullable
  public XQueryMarklogicAnyKindTest getMarklogicAnyKindTest() {
    return findChildByClass(XQueryMarklogicAnyKindTest.class);
  }

  @Override
  @Nullable
  public XQueryMarklogicArrayNodeTest getMarklogicArrayNodeTest() {
    return findChildByClass(XQueryMarklogicArrayNodeTest.class);
  }

  @Override
  @Nullable
  public XQueryMarklogicBinaryTest getMarklogicBinaryTest() {
    return findChildByClass(XQueryMarklogicBinaryTest.class);
  }

  @Override
  @Nullable
  public XQueryMarklogicBooleanNodeTest getMarklogicBooleanNodeTest() {
    return findChildByClass(XQueryMarklogicBooleanNodeTest.class);
  }

  @Override
  @Nullable
  public XQueryMarklogicNullNodeTest getMarklogicNullNodeTest() {
    return findChildByClass(XQueryMarklogicNullNodeTest.class);
  }

  @Override
  @Nullable
  public XQueryMarklogicNumberNodeTest getMarklogicNumberNodeTest() {
    return findChildByClass(XQueryMarklogicNumberNodeTest.class);
  }

  @Override
  @Nullable
  public XQueryMarklogicObjectNodeTest getMarklogicObjectNodeTest() {
    return findChildByClass(XQueryMarklogicObjectNodeTest.class);
  }

  @Override
  @Nullable
  public XQueryMarklogicTextTest getMarklogicTextTest() {
    return findChildByClass(XQueryMarklogicTextTest.class);
  }

  @Override
  @Nullable
  public XQueryNamespaceNodeTest getNamespaceNodeTest() {
    return findChildByClass(XQueryNamespaceNodeTest.class);
  }

  @Override
  @Nullable
  public XQueryPITest getPITest() {
    return findChildByClass(XQueryPITest.class);
  }

  @Override
  @Nullable
  public XQuerySchemaAttributeTest getSchemaAttributeTest() {
    return findChildByClass(XQuerySchemaAttributeTest.class);
  }

  @Override
  @Nullable
  public XQuerySchemaElementTest getSchemaElementTest() {
    return findChildByClass(XQuerySchemaElementTest.class);
  }

  @Override
  @Nullable
  public XQueryTextTest getTextTest() {
    return findChildByClass(XQueryTextTest.class);
  }

}
