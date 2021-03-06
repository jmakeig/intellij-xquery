/*
 * Copyright 2013-2014 Grzegorz Ligas <ligasgr@gmail.com> and other contributors
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

package org.intellij.xquery.structure;

import com.intellij.codeInsight.hint.DeclarationRangeHandler;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import org.intellij.xquery.psi.XQueryFunctionDecl;
import org.jetbrains.annotations.NotNull;

/**
 * User: ligasgr
 * Date: 10/09/13
 * Time: 20:57
 */
public class XQueryFunctionDeclarationRangeHandler implements DeclarationRangeHandler<XQueryFunctionDecl> {
    @NotNull
    @Override
    public TextRange getDeclarationRange(@NotNull XQueryFunctionDecl functionDeclaration) {
        PsiElement endElement = functionDeclaration.getFunctionBody();
        final TextRange textRange = functionDeclaration.getTextRange();
        int startOffset = textRange != null ? textRange.getStartOffset() : functionDeclaration.getTextOffset();
        int endOffset = endElement.getTextRange().getStartOffset();
        return new TextRange(startOffset, endOffset);
    }
}
